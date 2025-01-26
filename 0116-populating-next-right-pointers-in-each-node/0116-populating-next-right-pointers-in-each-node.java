/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Node output = root;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            Node left = null;
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                Node right = q.poll();

                if (left != null) left.next = right;
                left = right;

                if (right.left != null) q.offer(right.left);
                if (right.right != null) q.offer(right.right);
            }
        }

        return output;
    }
}