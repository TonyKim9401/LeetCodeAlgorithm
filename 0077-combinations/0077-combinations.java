class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(n, k, 1, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int n, int k, int idx, List<Integer> inside, List<List<Integer>> output) {
        if (inside.size() == k) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = idx; i <= n; i++) {
            inside.add(i);
            backtracking(n, k, i+1, inside, output);
            inside.remove(inside.size()-1);
        }
    }
}