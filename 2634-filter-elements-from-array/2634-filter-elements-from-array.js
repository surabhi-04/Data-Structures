/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let filteredArr = [];
    
    for (let i = 0; i < arr.length; i++) {
        // In JavaScript, passing the value to the if-statement automatically checks for truthiness
        if (fn(arr[i], i)) {
            filteredArr.push(arr[i]);
        }
    }
    
    return filteredArr;
    
};