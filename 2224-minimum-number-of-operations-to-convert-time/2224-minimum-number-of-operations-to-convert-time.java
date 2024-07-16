class Solution {
    public int convertTime(String current, String correct) {
        // convert current, correct to minutes
        int convertedCurrent = convertMinutes(current);
        int convertedCorrect = convertMinutes(correct);
        
        // correct - current = gap time;
        int gap = convertedCorrect - convertedCurrent;
        // [125]

        int output = 0;
    
        // [1,5,15,60]
        int[] factors = {60,15,5,1};
        for (int i = 0; i < factors.length; i++) {
            int factor = factors[i];
            if (gap / factor > 0) {
                output += gap / factor;
                gap %= factor;
            }
        }
        return output;
    }

    public int convertMinutes(String time) {
        // HH:MM
        String[] str = time.split(":");
        String hour = str[0];
        String minutes = str[1];
        return Integer.valueOf(hour) * 60 + Integer.valueOf(minutes);
    }
}