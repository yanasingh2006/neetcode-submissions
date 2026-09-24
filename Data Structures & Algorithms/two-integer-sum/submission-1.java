class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int target2 = target - nums[i];

            if (map.containsKey(target2)) {
                return new int[] {map.get(target2), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
