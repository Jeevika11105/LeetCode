class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> tempstack;
    public MyQueue() {
        stack = new Stack<>();
        tempstack = new Stack<>();
    }
    
    public void push(int x) {
        while(!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }
        stack.push(x);
     
        while(!stack.isEmpty() ){
            tempstack.push(stack.pop());
        }
    }
    
    public int pop() {
        return tempstack.pop();
    }
    
    public int peek() {
        return tempstack.peek();
    }
    
    public boolean empty() {
        return tempstack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */