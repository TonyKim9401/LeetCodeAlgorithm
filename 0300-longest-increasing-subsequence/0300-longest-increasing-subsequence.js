/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const output = new Array();

    for (let num of nums) {
        let start = 0;
        let end = output.length;

        while (start < end) {
            let mid = Math.floor(start + (end - start) / 2);
            if (output[mid] < num) start = mid + 1;
            else end = mid;
        }

        if (start === output.length) output.push(num);
        else output[start] = num;
    }
    console.log(output);
    return output.length;
};