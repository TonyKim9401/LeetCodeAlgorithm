/**
 * @param {character[][]} grid
 * @return {number}
 */

var numIslands = function(grid) {
    const bArray = Array.from({ length: grid.length }, () => new Array(grid[0].length).fill(false));

    let output = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1' && !bArray[i][j]) {
                output += 1;
                bfs(i, j, grid, bArray);
            }
        }
    }

    return output;
};

var bfs = function(i, j, grid, bArray) {
    if (i < 0 || i > grid.length - 1 ||
        j < 0 || j > grid[0].length - 1) return false;
    if (grid[i][j] === '0') return false;
    if (bArray[i][j]) return false;

    bArray[i][j] = true;

    bfs(i+1, j, grid, bArray);
    bfs(i-1, j, grid, bArray);
    bfs(i, j+1, grid, bArray);
    bfs(i, j-1, grid, bArray);
}