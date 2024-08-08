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
    private List<List<Integer>> output = new ArrayList<>();
    private Map<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        dfs(root, 0);
        for (int key : map.keySet()) {
            output.add(map.get(key));
        }
        Collections.reverse(output);
        return output;
    }

    public void dfs(TreeNode node, int depth) {
        if (node == null) return;

        depth += 1;
        if (map.containsKey(depth)) {
            List<Integer> inside = map.get(depth);
            inside.add(node.val);
        } else {
            List<Integer> inside = new ArrayList<>();
            inside.add(node.val);
            map.put(depth, inside);
        }

        dfs(node.left, depth);
        dfs(node.right, depth);
        depth -= 1;
    }
}