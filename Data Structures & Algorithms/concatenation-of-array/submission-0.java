class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int [nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int arrr=nums.length;
        int j=0;
        while(j<nums.length){
            arr[arrr]=nums[j];
            arrr++;
            j++;
        }
        return arr;
    }
}