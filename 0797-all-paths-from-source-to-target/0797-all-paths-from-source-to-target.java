class Solution {
    private List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> inside = new ArrayList<>();
        // n = graph.length - 1 = 3
        int firstNode = 0;
        inside.add(firstNode);
        backtracking(graph, firstNode, inside);
        return output;
    }

    private void backtracking(int[][] graph, int nodeValue, List<Integer> inside) {
        if (graph.length - 1 == nodeValue) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int node : graph[nodeValue]) {
            inside.add(node);
            backtracking(graph, node, inside);
            inside.remove(inside.size() - 1);
        }
    }
}