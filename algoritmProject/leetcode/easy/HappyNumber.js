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

const getsquares = (n, arr = []) => {    

    // while(n>0){
    //     int a = n%10;
    //     sum+=a*a;
    //     n=n/10;
    // }

    if(n === 1) return n;

    let square = 1;
    let sum = 0;
    while(n > 0) {
        
        let pow = Math.pow(10, square);
        let remain = n % pow;
        n -= remain;

        let temp = ((remain / pow * 10) ** 2);
        sum += temp;

        if(arr.includes(sum)) return false;
        console.log(arr);
        
        arr.push(sum);
        square ++;
    }

    return getsquares(sum, arr);
}

var isHappy = function(n) {
    // console.log("AA : " , getsquares(n));
    // ?? 문제를 완벽하게 이해 못했나;;
    return getsquares(n);
};

console.log(isHappy(19));