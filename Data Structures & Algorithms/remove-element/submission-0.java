class Solution {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeElement(int[] nums, int val) {

        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[l] == val && nums[r] == val) {
                r--;
            }else if(nums[l] == val && nums[r] != val) {
                swap(nums, l , r);
                l++;
                r--;
            }else if(nums[l] != val) {
                l++;
            }
        }
        return l;
    }
}