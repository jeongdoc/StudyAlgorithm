// 136. single number

function SingleNumber(nums: number[]): void {
    // first solution
    // let checkDuple: Map<number, number> = new Map<number, number>();

    // nums.forEach((i, idx) => {
    //     if(checkDuple.get(i)) {
    //         let temp: number = checkDuple.get(nums[i])!;
    //         checkDuple.set(i, temp+1);
    //     } else {
    //         checkDuple.set(i, 1);
    //     }
    // });

    const checkDuple: Map<number, number> = nums.reduce((prev, curr, idx)=> {
        prev.set(curr, (prev.get(curr) || 0) +1);
        return prev;
    }, new Map<number, number>());

    let singleOne: number = 0;
    for(let [key, val] of checkDuple) {
        if(val === 1) {
            singleOne = key;
            break;
        }
    }

    console.log(singleOne);
};


function SingleNumber2(nums: number[]): void {


    // second solution
    let singleOne: number =0;
    for(let i: number = 0; i < nums.length; i++){
        singleOne^=nums[i];
    }
    
    console.log(singleOne);

};

// SingleNumber([4,1,2,1,2]);
SingleNumber2([4,1,2,1,2]);