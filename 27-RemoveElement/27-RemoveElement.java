// Last updated: 7/26/2026, 10:14:01 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int n= nums.length;

        while(i!=n){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return j;
    }
}