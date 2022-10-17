// 88. Merge Sorted Array

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
 var merge = function(nums1, m, nums2, n) {

    nums1 = [1, 2, 3, 0, 0, 0];
    m = 3;
    nums2 = [1, 3, 6];
    n = 3;

    if(m+n === 0) {
        return nums1;
    }

    // m : 병합돼야하는 요소 개수 -> 3
    // n : num2 길이

    // console.log("M -> " + m);
    // console.log("m - n = " + (m-n));
    
    // Sol1
    // 음.. O(n+m)log(n+m) ?
    // let j = 0;
    // for(let i = 0, len = m+n; i < len; i++) {
    //     if(i >= m) {
    //         nums1[i] = nums2[j];
    //         // nums1.push(nums2[j]);
    //         j++;
    //     }
    // }
    // console.log(nums1.sort((a, b) => {return a - b}));

    // Follow up: Can you come up with an algorithm that runs in O(m + n) time?
    let fillIndex = nums1.length-1;
    let nums1pointer = m - 1;
    
    for(let i = n-1 ; i >= 0; i--){
        console.log("[" + nums1pointer +", " + fillIndex + " : " + + nums1[nums1pointer] + "] " + nums2[i] + ", i -> " + i);
        if(nums1[nums1pointer] > nums2[i] ){
            nums1[fillIndex] = nums1[nums1pointer];
            fillIndex--;
            nums1pointer--;
            i++;
        }else{
            
            nums1[fillIndex] = nums2[i];
            fillIndex--;
        }
    }
    console.log(nums1);
    console.log("===================");
    // num2 배열 순회
    // nums1 원소랑 nums2 원소랑 비교
    // nums1 Index 기억할 필요가 있음
    nums1 = [1, 2, 3, 0, 0, 0];
    m = 3;
    nums2 = [1, 3, 6];
    n = 3;

    let startIdx = m;
    let nums1pt = m - 1;
    for(let i = n - 1 ; i >= 0; i--) {

        console.log("[" + nums1pt +", " + startIdx + " : " + + nums1[nums1pt] + "] " + nums2[i] + ", i -> " + i);
        if(nums1[nums1pt] > nums2[i]) {
            nums1[startIdx] = nums1[nums1pt];
            startIdx ++;
            nums1pt ++;
            i ++;
            // console.log(nums1[startIdx] + ", " + nums1[nums1pt]);
        } else {
            nums1[startIdx] = nums2[i];
            startIdx ++;
            // console.log(nums1[startIdx] + ", " + nums1[nums1pt] + ", " + nums2[i]);
        }
        // console.log(nums1[nums1pt]+", "+nums1pt);
        // console.log(nums1[startIdx]+","+startIdx);
    }
    // console.log("sol 2");
    console.log(nums1);

};

merge();