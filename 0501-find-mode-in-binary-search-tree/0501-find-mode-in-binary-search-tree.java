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
    private Map<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        check(root);
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int max = map.get(keySet.get(0));
        List<Integer> maxList = new ArrayList<>();
        for (int key : keySet) {
            if (max == map.get(key)) maxList.add(key);
            else break;
        }
        int[] output = new int[maxList.size()];
        for (int i = 0; i < maxList.size(); i++) {
            output[i] = maxList.get(i);
        }
        return output;
    }

    public void check(TreeNode node) {
        if (node == null) return;

        if (map.containsKey(node.val)) {
            map.put(node.val, map.get(node.val) + 1);
        } else {
            map.put(node.val, 1);
        }
        check(node.left);
        check(node.right);
    }
}