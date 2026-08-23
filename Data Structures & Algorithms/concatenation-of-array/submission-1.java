class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int[nums.length*2];
        int size=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[size]=nums[i];
            size++;
        }
        return arr;
    }
}