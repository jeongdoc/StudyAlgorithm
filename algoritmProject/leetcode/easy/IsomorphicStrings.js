// Leetcode easy 205. Isomorphic Strings

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
const checkIsnomorphic = (s, t) => {

    // 단어 사전을 하나 만든다고 가정
    let charDic = new Map();
    for(let i = 0; i < s.length; i ++) {
        
        if(!charDic.has(s.charCodeAt(i))) {
            const values = [...charDic.values()];
            if(!values.includes(t.charCodeAt(i))) charDic.set(s.charCodeAt(i), t.charCodeAt(i));
        }
    }

    return charDic;
}

var isIsomorphic = function(s, t) {
    
    let charDic = checkIsnomorphic(s, t);
    
    let ttemp = [];
    let stemp = [];
    for(let i = 0; i < t.length; i ++) {
        ttemp[i] = t.charCodeAt(i);
        if(charDic.has(s.charCodeAt(i))) {
            stemp[i] = charDic.get(s.charCodeAt(i));
        }
    }

    return stemp.toString() === ttemp.toString() ? true : false;
};
// ================================================================================================
// 그냥 간단하게 푼거
var isIsomorphic2 = function(s, t) {
    
    s = "add";
    t = "bar"
    let ttemp = [];
    let stemp = [];
    for(let i = 0; i < t.length; i ++) {
        if(stemp[s.charCodeAt(i)] !== ttemp[t.charCodeAt(i)]) {
            return false;
        }

        stemp[s.charCodeAt(i)] = i+1;
        ttemp[t.charCodeAt(i)] = i+1;
    }
    return true;
};

console.log(isIsomorphic("a", "b"));