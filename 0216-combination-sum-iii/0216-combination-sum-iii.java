class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(k, n, 1, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int k, int n, int idx, int sum, List<Integer> inside, List<List<Integer>> output) {

        if (inside.size() == k && sum != n) return;
        else if (inside.size() == k && sum == n) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            sum += i;
            inside.add(i);
            System.out.println(sum + " " + i + " " + inside.size());
            backtracking(k, n, i+1, sum, inside, output);
            sum -= i;
            inside.remove(inside.size()-1);
        }
    }
}