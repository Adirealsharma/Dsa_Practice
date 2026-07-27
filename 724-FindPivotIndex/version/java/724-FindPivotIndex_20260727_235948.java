// Last updated: 7/27/2026, 11:59:48 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int sum=0;
4        int n = nums.length;
5        int pivot = -1;
6        int left_sum = 0;
7        for(int i =0; i<n; i++){
8            sum += nums[i];
9        }
10        for(int j=0; j<=n-1; j++)
11        {
12
13            if(left_sum == (sum - left_sum - nums[j])){
14                pivot = j;
15                break;
16            }
17            left_sum += nums[j];
18        }
19        return pivot;
20    }
21}