/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var plus = -1;
    return function() {
        plus += 1;
        return n + plus;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */