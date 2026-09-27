class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int threshold = nums.length/2;
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if(count.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
}