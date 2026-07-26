// Last updated: 7/26/2026, 10:13:59 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int s= 0;
        int e= n-1;
        int ans= n;

        while( s <= e){
            int mid= s + (e - s) / 2;
            if(nums[mid] < target){
                s= mid+1;
            }else if(nums[mid] > target){
                e= mid-1;
                ans= mid;
            }else{
                return mid;
            }
        }
        return ans;
    }
}