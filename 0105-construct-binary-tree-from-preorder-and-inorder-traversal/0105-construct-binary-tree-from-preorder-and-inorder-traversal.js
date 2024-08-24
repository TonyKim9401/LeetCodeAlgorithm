/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} preorder
 * @param {number[]} inorder
 * @return {TreeNode}
 */
var buildTree = function(preorder, inorder) {
    let i = 0; // inorder 배열의 인덱스
    let p = 0; // preorder 배열의 인덱스

    function builder(stop) {
        if (p >= preorder.length) return null;
        if (inorder[i] === stop) {
            i++;
            return null;
        }

        // 새로운 노드 생성
        const node = new TreeNode(preorder[p]);
        p++;

        // 왼쪽 서브트리 생성
        node.left = builder(node.val);
        // 오른쪽 서브트리 생성
        node.right = builder(stop);

        return node;
    }

    // 재귀적으로 트리 생성 시작
    return builder(Number.MIN_SAFE_INTEGER);
};
