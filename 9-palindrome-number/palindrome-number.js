/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let s = x.toString();
    if(s === s.split('').reverse().join('')){
        return true;
    }
    return false;
};