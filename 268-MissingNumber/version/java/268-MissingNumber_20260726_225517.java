// Last updated: 7/26/2026, 10:55:17 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = n*(n + 1) / 2;
5        int arrsum=0;
6        for (int ele : nums) {
7            arrsum += ele;
8        }
9        return sum - arrsum;
10    }
11}