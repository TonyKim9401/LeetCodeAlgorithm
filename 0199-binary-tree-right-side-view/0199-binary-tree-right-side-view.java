/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return List.of();

        List<Integer> output = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int count = q.size();
            // [1,2,3,(4)]
            for (int i = 0; i < count; i++) {
                TreeNode currNode = q.poll();
                if (currNode.left != null) q.offer(currNode.left);
                if (currNode.right != null) q.offer(currNode.right);
                if (i == count - 1) output.add(currNode.val);
            }
        }

        return output;
    }
}