var maxArea = function(height) {
    let max = 0;
    let start = 0;
    let end = height.length - 1;

    while (start < end) {
        let heightLeft = height[start];
        let heightRight = height[end];

        let hei = Math.min(heightLeft, heightRight);
        let wid = end - start;

        max = Math.max(max, hei * wid);

        if (heightRight > heightLeft) {
            start += 1;
        } else {
            end -= 1;
        }
    }

    return max;
};
