interface Stack<T> {
    
    boolean isEmpty();
    
    void push(T objectToBePushedOntoTopOfStack);
    
    T pop(); // Removes and returns object at top of stack or returns null if stack is emtpy.  
}