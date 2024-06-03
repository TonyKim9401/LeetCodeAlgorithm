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
import java.util.*;

class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> keyList = new ArrayList<>();
        List<Integer> valList = new ArrayList<>();

        if (root != null) {
            if (map.containsKey(root.val)) {
                int value = map.get(root.val);
                map.put(root.val, value++);
            } else {
                map.put(root.val, 1);
                keyList.add(root.val);
            }
            subMode(root.left, map, keyList);
            subMode(root.right, map, keyList);
        }

        int max = 0;
        for (int i = 0; i < keyList.size(); i++) {
            int key = keyList.get(i);
            max = Math.max(map.get(key), max);
        }
        for (int i = 0; i < keyList.size(); i++) {
            int key = keyList.get(i);
            if (max == map.get(key)) {
                valList.add(key);
            }
        }

        int[] result = new int[valList.size()];
        for (int i = 0; i < valList.size(); i++) {
            result[i] = valList.get(i);
        }
        return result;
    }

    public void subMode(TreeNode root, Map<Integer, Integer> map, List<Integer> keyList) {
        if (root != null) {
            if (map.containsKey(root.val)) {
                int value = map.get(root.val);
                value += 1;
                map.put(root.val, value);
            } else {
                map.put(root.val, 1);
                keyList.add(root.val);
            }
            subMode(root.left, map, keyList);
            subMode(root.right, map, keyList);
        }
    }
}