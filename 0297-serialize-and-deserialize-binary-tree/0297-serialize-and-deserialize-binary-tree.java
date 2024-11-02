public class Codec {
    // 직렬화
    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("#,");
            } else {
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return sb.toString();
    }

    // 역직렬화
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        for (int i = 1; i < nodes.length; i++) {
            TreeNode parent = queue.poll();
            if (!nodes[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = left;
                queue.add(left);
            }
            if (!nodes[++i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
