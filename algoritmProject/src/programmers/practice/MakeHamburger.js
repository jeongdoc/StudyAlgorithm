function solution(ingredient) {

    // 프로그래머스 햄버거 만들기
    // 1231
    // [2, 1, 1, 2, 3, 1, 2, 3, 1] 	2
    // [1, 3, 2, 1, 2, 1, 3, 1, 2] 	0
    ingredient = [2, 1, 1, 2, 3, 1, 2, 3, 1];

    let stack = [];
    let answer = 0;

    for(let i = 0; i < ingredient.length; i ++) {
        stack.push(ingredient[i]);
        let stackSize = stack.length;
        if(stackSize > 3) {
            if(stack[stackSize - 4] === 1 && (stack[stackSize - 3] === 2) && (stack[stackSize - 2] === 3) && (stack[stackSize - 1] === 1)) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer ++;
            }
        }
    }

    return answer;
}

console.log(solution());