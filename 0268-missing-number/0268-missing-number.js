/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let len = nums.length;
    let sum = len * (len+1) / 2;

    for (let num of nums) sum -= num;
    return sum;
};