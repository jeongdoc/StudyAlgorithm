// 169. Majority Element
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {

    // O(nlogn)
    if(nums.length < 3) return nums[0];

    nums.sort();
    let cnt = 1;
    for(let i = 0; i < nums.length-1; i ++) {
        
        if((nums[i] ^ nums[i+1]) === 0) {
            cnt ++;
        } else {
            cnt = 1;
        }

        if(cnt > Math.floor(nums.length/2)) {
            return nums[i];
        }
    }

};


var majorityElement2 = function(nums) {
    if(nums.length < 3) return nums[0];

    let majority = 0;
    for(let i = 0; i < 32; i ++) {
        let cnt = 0;
        for(let j = 0; j < nums.length; j ++) {
            if((nums[j] >> i) & 1 === 1) {
                cnt ++;
            }

            if(cnt > Math.floor(nums.length/2)) {
                console.log(nums[j])
                majority |= (1 << i);
            }
        }
    }

    return majority;
};

console.log("result : ", majorityElement2([2,4,4]));