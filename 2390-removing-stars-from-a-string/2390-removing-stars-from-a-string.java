class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            } 
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String ans = sb.reverse().toString();
        return ans;
    }
}