// Last updated: 7/27/2026, 11:58:13 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int sum = 0;
4        int n = nums.length;
5        int left_sum = 0;
6        
7        // Step 1: Calculate the total sum of the array
8        for(int i = 0; i < n; i++) {
9            sum += nums[i];
10        }
11        
12        // Step 2: Iterate to find the pivot
13        for(int j = 0; j < n; j++) {
14            // The right sum is the total sum minus the current left sum and the current element
15            if (left_sum == sum - left_sum - nums[j]) {
16                return j; // Return immediately when found
17            }
18            
19            // Add the current element to left_sum AFTER checking
20            left_sum += nums[j];
21        }
22        
23        return -1; // Return -1 if no pivot is found
24    }
25}