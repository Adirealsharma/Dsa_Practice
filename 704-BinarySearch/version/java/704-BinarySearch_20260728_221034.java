// Last updated: 7/28/2026, 10:10:34 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int hi = nums.length-1, lo = 0, mid =(hi+lo)/2;
4        while(lo<=hi){
5            if(target == nums[mid]) return mid;
6            if(target < nums[mid]){
7                hi = mid-1;
8                mid = (hi + lo)/2;
9            }
10            if(target > nums[mid]){
11                lo = mid+1;
12                mid = (hi + lo)/2;
13            }
14        }
15        return -1;
16    }
17}