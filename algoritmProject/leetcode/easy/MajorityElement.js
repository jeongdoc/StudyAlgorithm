// 169. Majority Element
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {

    if(nums.length < 3) return nums[0];

    nums.sort();
    let cnt = 1;
    for(let i = 0; i < nums.length-1; i ++) {
        
        if((nums[i] ^ nums[i+1]) !== 0) {
            cnt = 1;
        } else {
            cnt ++;
        }

        if(cnt > Math.floor(nums.length/2)) {
            return nums[i];
        }
    }

};
console.log(majorityElement([3,3,4]));