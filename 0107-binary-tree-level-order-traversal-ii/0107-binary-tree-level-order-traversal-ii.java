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
    private int level = -1;
    private Map<Integer, List<Integer>> map = new HashMap<>();
    private List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        builder(root);

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.reverse(keySet);        

        for (int key : keySet) {
            output.add(map.get(key));
        }
        return output;
    }

    public void builder(TreeNode node) {
        if (node == null) return;

        level += 1;
        builder(node.left);

        if (map.containsKey(level)) {
            List<Integer> list = map.get(level);
            list.add(node.val);
            map.put(level, list);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            map.put(level, list);
        }

        builder(node.right);
        level -= 1;
    }
}