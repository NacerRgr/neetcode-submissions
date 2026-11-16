class MinStack {

  private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
       stack = new Stack<>();
       minStack = new Stack<>();
    }
    
    public void push(int val) {
     
        this.stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        if(!minStack.isEmpty() && top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
      return  this.stack.peek();
        
    }
    
    public int getMin() {
        if(!minStack.isEmpty())
        return this.minStack.peek();

        return -1 ;
        
    }

}
