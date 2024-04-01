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
     public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         if (Objects.isNull(root)) return result;
         nodeFinder(root, result);
         return result;
     }
    
    public void nodeFinder(TreeNode node, List<Integer> result){
        if (!Objects.isNull(node.left)) {
            nodeFinder(node.left, result);
        }
        result.add(node.val);
        if (!Objects.isNull(node.right)) {
            nodeFinder(node.right, result);
        }
    }
}