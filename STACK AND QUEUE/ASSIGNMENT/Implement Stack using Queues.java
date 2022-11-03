class MyStack {
    ArrayDeque<Integer> p;

    public MyStack() {
        p= new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        p.push(x);
        
    }
    
    public int pop() {
       return p.poll();
        
    }
    
    public int top() {
        return p.peek();
        
    }
    
    public boolean empty() {
        return p.size()==0;
        
    }
}
