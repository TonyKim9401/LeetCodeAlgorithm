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
    private List<List<Integer>> elements = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root, 0);
        List<Double> output = new ArrayList<>();

        for (List<Integer> inside : elements) {
            long sum = 0;
            for (int num : inside) {
                sum += num;
            }
            double average = sum / (double)inside.size();
            output.add(average);
        }
        return output;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        if (elements.size() <= depth) {
            List<Integer> inside = new ArrayList<>();
            inside.add(node.val);
            elements.add(inside);
        } else {
            List<Integer> inside = elements.get(depth);
            inside.add(node.val);
        }
        depth += 1;
        dfs(node.left, depth);
        dfs(node.right, depth);
    }
}