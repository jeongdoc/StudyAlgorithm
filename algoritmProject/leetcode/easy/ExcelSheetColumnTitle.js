// 168. Excel Sheet Column Title

/**
 * @param {number} columnNumber
 * @return {string}
 */

var convertToTitle = function(columnNumber) {
    // 1회차 풀이
    // columnNumber = 2147483647;
    // columnNumber = 701;
    // columnNumber = 1;
    columnNumber = 77;

    let remain = 0;
    const charcode = [];

    while(columnNumber > 0) {

        remain = columnNumber % 26;

        if(remain === 0) {

            let checkCode = columnNumber + 64;
            if(checkCode > 97)  {
                checkCode = (columnNumber / 26) + 63;
                charcode.push(90);
            }
            charcode.unshift(checkCode);

            break;
        }

        charcode.unshift(remain+64);
        columnNumber = (columnNumber - remain) / 26;

    }

    console.log(String.fromCharCode(...charcode));

};

var convertToTitle2 = function(columnNumber) {
    // 1회차 풀이 코드 정리
    // columnNumber = 2147483647;
    // columnNumber = 701;
    // columnNumber = 1;
    columnNumber = 77;

    let remain = 0;
    const charcode = [];

    while(columnNumber > 0) {

        remain = (columnNumber -= 1) % 26;
        charcode.unshift(remain + 65);
        columnNumber = (columnNumber - remain) / 26;

    }

    console.log(String.fromCharCode(...charcode));

};



convertToTitle2();