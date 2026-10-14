class Solution {
    public int trap(int[] height) {
        int max_left=height[0];
        int max_right=height[height.length-1];
        int h=0;
        int left=0;
        int right=height.length-1;
        while(left<right){    
            if(max_left<=max_right){
                left++;
                if(height[left]>max_left){
                    max_left=height[left];
                }
                int ans=max_left-height[left];
                if(ans>0){
                    h+=ans;
                }
            }
            else if(max_left>max_right){
                right--;
                if(height[right]>max_right){
                    max_right=height[right];
                }
                int ans2=max_right-height[right];
                if(ans2>0){
                    h+=ans2;
                }
            }
            
        }
        return h;
    }
}
