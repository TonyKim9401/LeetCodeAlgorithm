class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        for (int pile : piles) maxSpeed = Math.max(maxSpeed, pile);
        
        while (minSpeed < maxSpeed) {
            int midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;

            if (canEatInTime(piles, h, midSpeed)) maxSpeed = midSpeed;
            else minSpeed = midSpeed + 1;
        }

        return minSpeed;
    }

    private boolean canEatInTime(int[] piles, int h, int speed) {
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }

        return totalHours <= h;
    }
}