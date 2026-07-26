// Last updated: 7/26/2026, 10:13:55 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
          
        int longest = 1;

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int next = i;

                while (set.contains(next + 1)) {
                    next++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}