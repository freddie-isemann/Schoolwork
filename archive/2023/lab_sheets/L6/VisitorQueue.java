class VisitorQueue implements Queue<Visitor> {
    
    public boolean isEmpty() {
        return true;
    }
    
    public void joinBack(Visitor v) { }
    
    public Visitor atFront() {
       return new Visitor("Stub");   
    }
    
    public void leaveFront() { }
    
}