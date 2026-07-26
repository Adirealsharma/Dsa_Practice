// Last updated: 7/26/2026, 10:13:54 PM
class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int single = 0;

        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                single = entry.getKey();
                break;
            }
        }

        return single;
    }
}