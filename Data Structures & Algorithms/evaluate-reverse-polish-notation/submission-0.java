class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> bob=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            if(token.equals("+")){
                int b=bob.pop();
                int a=bob.pop();
                bob.push(a+b);
            }
            else if(token.equals("-")){
                int b=bob.pop();
                int a=bob.pop();
                bob.push(a-b);
            }
            else if(token.equals("*")){
                int b=bob.pop();
                int a=bob.pop();
                bob.push(a*b);
            }
            else if(token.equals("/")){
                int b=bob.pop();
                int a=bob.pop();
                bob.push(a/b);
            }
            else{
                bob.push(Integer.parseInt(token));
            }
        }
        return bob.pop();
    }
}
