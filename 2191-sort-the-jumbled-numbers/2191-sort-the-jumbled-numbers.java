import java.util.*;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        // 변환된 값과 원래 값의 쌍을 저장할 리스트
        List<int[]> converted = new ArrayList<>();
        
        // nums 요소들을 변환 값으로 매핑
        for (int num : nums) {
            int convertedValue = 0;
            String s = String.valueOf(num);
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(mapping[c - '0']);
            }
            convertedValue = Integer.parseInt(sb.toString());
            converted.add(new int[] {convertedValue, num});
        }
        
        // 변환된 값 기준으로 정렬
        Collections.sort(converted, (a, b) -> Integer.compare(a[0], b[0]));
        
        // 원래 값을 정렬된 순서대로 배열에 넣기
        int[] output = new int[nums.length];
        for (int i = 0; i < converted.size(); i++) {
            output[i] = converted.get(i)[1];
        }
        
        return output;
    }
}
