class MyQueue {
    Stack<Integer>st1;
    Stack<Integer>st2;
    int size;
    public MyQueue() {
        size = 0;
        st1= new Stack<>();
        st2= new Stack<>();
    }
    
    public void push(int x) {
        size = st1.size();
        for(int i = 0; i< size; i++){
            int temp = st1.pop();
            st2.push(temp);
        }
        st1.push(x);
        for(int j = 0; j<size; j++){
            int temp1 = st2.pop();
            st1.push(temp1);
        }
        size = st1.size();
    }
    
    public int pop() {
        size--;
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        if(size == 0){
            return true;
        }
        return false;
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