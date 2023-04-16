import java.util.Arrays;

import java.util.Arrays;

class sum3Closest_16{
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums); // -4, -1, 1 2
        int firstSum = nums[0] + nums[1] + nums[n - 1];

        for (int i = 0; i < n; i++) {
            int s = i + 1;
            int e = n - 1;
            while (s < e) {
                int sum = nums[i] + nums[s] + nums[e];
                if (sum < target) s++;
                else if (sum > target) e--;
                else return sum;

                if (Math.abs(sum - target) < Math.abs(firstSum - target)) firstSum = sum;
            }
        }
        return firstSum;
    }
}