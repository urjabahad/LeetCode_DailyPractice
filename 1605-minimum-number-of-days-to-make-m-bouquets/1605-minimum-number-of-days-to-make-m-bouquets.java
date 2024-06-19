import java.util.Arrays;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }

        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int countinue = 0;
            int blooms = 0;

            for (int day : bloomDay) {
                if (day <= mid) {
                    countinue++;

                    if (countinue >= k) {
                        blooms++;
                        countinue = 0;
                    }
                } else {
                    countinue = 0;
                }
            }

            if (blooms >= m) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
