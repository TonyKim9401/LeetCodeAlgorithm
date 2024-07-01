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
    //            level,   value
    private Map<Integer, List<Integer>> map = new HashMap<>();
    private int depth;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return List.of();
        levelCheck(root);
        List<List<Integer>> output = new ArrayList<>();
        for (int level : map.keySet()) {
            output.add(map.get(level));
        }
        Collections.reverse(output);
        return output;
    }

    public void levelCheck(TreeNode node) {
        if (node == null) return;

        depth += 1;
        levelCheck(node.left);

        if (map.containsKey(depth)) {
            List<Integer> inside = map.get(depth);
            inside.add(node.val);
            map.put(depth, inside);
        } else {
            List<Integer> inside = new ArrayList<>();
            inside.add(node.val);
            map.put(depth, inside);
        }

        levelCheck(node.right);
        depth -= 1;
    }
}