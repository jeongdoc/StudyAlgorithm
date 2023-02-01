// 202. Happy Number
/**
 * @param {number} n
 * @return {boolean}
 */

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

const getsquares = (n) => {    

    let square = 1;
    let arr = [];
    while(n > 0) {

        let pow = Math.pow(10, square);
        let remain = n % pow;
        let res = remain / pow * 10;
        n -= remain;

        let temp = (res ** 2);
        arr.push(temp);

        square ++;
    }

    console.log(arr);

    let sum = 0;
    for(let i = 0; i < arr.length; i ++) {
        sum += arr[i];
    }

    console.log(sum);

    if(sum / 10 < 1) {
        return sum;
    }

    return getsquares(sum);
}

var isHappy = function(n) {
    // console.log("AA : " , getsquares(n));
    // ?? 문제를 완벽하게 이해 못했나;;

    return getsquares(n) === 1 ? true : false;
};

console.log(isHappy(1111111));