class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        
        while(min<max){
            int mid=min+(max-min)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(piles[i]+mid-1)/mid;
            }
            if(sum<=h){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
}
