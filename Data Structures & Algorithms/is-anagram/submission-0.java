class Solution {
    public boolean isAnagram(String s, String t) {
        boolean value=false;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        value=Arrays.equals(arr1,arr2);
        return value;
    }
}
