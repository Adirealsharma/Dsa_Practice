// Last updated: 7/26/2026, 10:35:40 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k%n;
5        reverse(nums, 0, n - 1);
6        reverse(nums, 0, k-1);
7        reverse(nums, k , n - 1);
8        
9
10    }
11
12    public void reverse(int[] arr, int i, int j) {
13        while (i < j) {
14            int temp = arr[i];
15            arr[i] = arr[j];
16            arr[j] = temp;
17            i++;
18            j--;
19        }
20    }
21}
22