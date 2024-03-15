interface Queue<T> {
    
    boolean isEmpty();
    
    void joinBack(T objectJoiningBackOfQueue);
    
    T atFront(); // Returns object at the front of the queue or null is queue is empty.
    
    void leaveFront(); // Object at front of queue is removed from queue.
}