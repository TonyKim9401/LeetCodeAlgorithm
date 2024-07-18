class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(k, n, 0, 1,new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int k, int n, int sum, int idx, List<Integer> inside, List<List<Integer>> output ) {
        if (sum == n && k == inside.size()) {
            output.add(new ArrayList<>(inside));
            return;
        }

        if (inside.size() > k || sum > n) return;

        for (int i = idx; i <= 9; i++) {
            sum += i;
            inside.add(i);
            backtracking(k, n, sum, i+1, inside, output);
            sum -= i;
            inside.remove(inside.size()-1);
        }
    }
}