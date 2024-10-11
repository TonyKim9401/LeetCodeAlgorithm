/**
 * @param {number[][]} heights
 * @return {number[][]}
 */
var pacificAtlantic = function(heights) {
    if (!heights || heights.length === 0 || heights[0].length === 0) return [];
    
    const rows = heights.length;
    const cols = heights[0].length;
    const pacific = Array.from({ length: rows }, () => Array(cols).fill(false));
    const atlantic = Array.from({ length: rows }, () => Array(cols).fill(false));
    const result = [];

    const dfs = (i, j, visited, preValue) => {
        if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] || heights[i][j] < preValue) return;
        visited[i][j] = true;
        dfs(i + 1, j, visited, heights[i][j]);
        dfs(i - 1, j, visited, heights[i][j]);
        dfs(i, j + 1, visited, heights[i][j]);
        dfs(i, j - 1, visited, heights[i][j]);
    };

    for (let i = 0; i < rows; i++) {
        dfs(i, 0, pacific, heights[i][0]);
        dfs(i, cols - 1, atlantic, heights[i][cols - 1]);
    }

    for (let j = 0; j < cols; j++) {
        dfs(0, j, pacific, heights[0][j]);
        dfs(rows - 1, j, atlantic, heights[rows - 1][j]);
    }

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (pacific[i][j] && atlantic[i][j]) {
                result.push([i, j]);
            }
        }
    }

    return result;
};
