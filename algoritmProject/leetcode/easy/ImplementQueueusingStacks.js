// [challenges] 232. Implement Queue using Stacks
// Need to concern a Time complexity the Queue
var MyQueue = function() {
    this.myStack = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    this.myStack.push(x);
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    let temp = [];

    while(this.myStack.length > 1) {
        temp.push(this.myStack.pop());
    }

    let x = this.myStack.pop();
    while(temp.length > 0) {
        this.myStack.push(temp.pop());
    }

    return x;
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    if(this.myStack.length === 0) return null;

    return this.myStack[0];
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
    return this.myStack.length === 0;
};

const Main = () => {
    var obj = new MyQueue();
    obj.push(1);                // queue [1]
    obj.push(2);                // queue [1, 2]
    console.log(obj.peek());    // return 1
    console.log(obj.pop());     // return 1, queue [2]
    console.log(obj.empty());   // return false
}

Main();