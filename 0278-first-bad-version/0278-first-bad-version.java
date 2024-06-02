/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if (isBadVersion(1)) return 1;
        if (isBadVersion(n) && !isBadVersion(n-1)) {
            return n;
        }
        
        int start = 1;
        int end = n;
        int bad = 1;
        
        while (start <= end) {
            int middle = start + (end-start) / 2;
            if (isBadVersion(middle) && !isBadVersion(middle-1)) {
                bad = middle;
                break;
            } else if (!isBadVersion(middle)) {
                start = middle;
            } else {
                end = middle;
            }
        }
        return bad;
    }
}