// Queue는 O(1)
var Node = function(value) {
    this.value = null;
    this.next = null;
}

var MyQueue = function() {
    this.front = null;
    this.rear = null;  
    this.size = 0;
};

/** 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    const node = new Node(x);
    if(this.size === 0) {
        this.front = node;
        this.rear = node;
    } else {
        this.rear.next = node;
        this.rear = node;
    }

    this.size++;
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    if(this.size === 0) return null;

    return this.front.value;
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
    return this.size === 0;
};

const Main = () => {
    // var obj = new MyQueue();
    let test = new Array();
    var obj = new MyQueue();
    obj.push(1);
    obj.push(2);
    console.log(obj);
    console.log(obj.pop());
    console.log(obj.peek());
    console.log(obj.empty());
}

Main();