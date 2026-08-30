class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] output=new int[temperatures.length];
        Stack<Integer> bob=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!bob.isEmpty() && temperatures[i]>temperatures[bob.peek()]){
                int prev=bob.pop();
                output[prev]=i-prev;
            }
            bob.push(i);
        }
        return output;
    }
}
