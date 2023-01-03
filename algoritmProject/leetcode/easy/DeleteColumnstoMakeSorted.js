// 944. Delete Columns to Make Sorted

/**
 * @param {string[]} strs
 * @return {number}
 */
var minDeletionSize = function(strs) {
    
    strs = ["cba","daf","ghi"];

    let len = strs.length;
    let eleLen = strs[0].length;
    let res = 0;

    for(let i = 0; i < eleLen; i ++) {
        for(let j = 0; j < len-1; j ++) {
            if(strs[j][i] <= strs[j+1][i]) {
                continue;
            }

            res++;
            break;
        }
    }
    return res;
};

console.log(minDeletionSize());