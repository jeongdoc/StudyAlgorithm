//121. Best Time to Buy and Sell Stock


// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

// 1 <= prices.length <= 105
// 0 <= prices[i] <= 104

/**
 * @param {number[]} prices
 * @return {number}
 */

const sequentialSearch = (arr, len, data, profit) => {
    for(let i = 0; i < len; i ++) {
        if(data - arr[i] < profit) {
            return data - arr[i]
        }
    }
    return profit;
}

 var maxProfit = function(prices) {

    prices = [7,6,4,3,1]

    let profit = 0;

    

    return profit;

    // prices = [5];

    // if(prices.length < 2) return 0;    

    // let profit = 0;
    // const recursion = (arr) => {

    //     let buy = arr[0];
    //     for(let i = 1; i < arr.length; i ++) {
    //         const daliyProfit = cal(buy, arr[i]);
    //         if(daliyProfit < profit) {
    //             profit = daliyProfit;
    //         }
    //     }
    //     arr.splice(0, 1);
        
    //     return arr.length === 1 ? profit : recursion(arr);
    // }

    // recursion(prices);

    // return profit*-1;
};
console.log(maxProfit(0));