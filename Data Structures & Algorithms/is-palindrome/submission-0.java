class Solution {
    public boolean isPalindrome(String s) {
        boolean value=true;
        int left=0;
        int right=s.length()-1;
        s=s.toLowerCase();
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!=s.charAt(right)){
                value=false;
            }
            left++;
            right--;
        }
        return value;
    }
}
