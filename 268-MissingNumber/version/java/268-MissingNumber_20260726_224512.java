// Last updated: 7/26/2026, 10:45:12 PM
1class Solution {
2    public static void swap(int[] arr, int index1, int index2){
3        int temp = arr[index1];
4        arr[index1] = arr[index2];
5        arr[index2] = temp;
6    }
7    public static int missingNumber(int[] nums) {
8        int i =0;
9        while(i<nums.length) {
10            if(nums[i]<nums.length&&nums[i]!=i){
11                swap(nums, i, nums[i]);
12            }
13            else i++;
14        }
15        for (int j = 0; j < nums.length; j++) {
16            if(nums[j]!=j) return j;
17        }
18        return nums.length;
19    }
20}