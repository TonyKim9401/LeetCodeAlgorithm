/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var characterReplacement = function(s, k) {
    let ans = 0;
    let n = s.length;
    for (let c = 'A'.charCodeAt(0); c <= 'Z'.charCodeAt(0); c++) {
        let i = 0, j = 0, replaced = 0;
        while (j < n) {
            if (s.charAt(j) === String.fromCharCode(c)) j += 1;
            else if (replaced < k) {
                j++;
                replaced++;
            } else if (s.charAt(i) === String.fromCharCode(c)) i += 1;
            else {
                i++;
                replaced--;
            }
            ans = Math.max(ans, j - i);
        }
    }
    return ans;
};
