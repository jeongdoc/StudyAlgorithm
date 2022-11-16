/*
 * 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
 *
 * 예를 들어
 * d(91) = 9 + 1 + 91 = 101
 *
 * 이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
 * 
 * 어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 
 * 그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 
 * 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 
 * 예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
 * 
 * 1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
 */

// 총합
const sum = (set) => {
    
    let sum = 0;
    for(let i of set.keys()) {
        sum += i;
    }

    return sum;
}

// 제너레이터 구하기
const getGenerator = () => {

    let set = new Set();
    for(let i = 1; i < 5000; i ++) {
        let genNum = i;
        let checkGen = i;

        // 4자리수
        let times = 3;
        while(times >= 0) {
    
            let pow = Math.pow(10, times);
            let quan = Math.floor(checkGen / pow);
            checkGen -= pow * quan;
            
            if(quan > 0) {
                genNum += quan;
            }
            
            times --;
        }

        if(genNum < 5000) {
            set.add(genNum);
        }
    }

    return set;
}

const nexon_generator = () => {
    
    let genSum = sum(getGenerator());
    let totalSum = sum(new Array(5000));

    // 1227365
    // 총합 - 제너레이터합계
    console.log(totalSum - genSum);
}

nexon_generator();
