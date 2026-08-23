class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=0;
        while(left<nums.length){
            if(nums[left]!=val){
                nums[right]=nums[left];
                right++;
            }
            left++;
        }
        return right;
    }
}