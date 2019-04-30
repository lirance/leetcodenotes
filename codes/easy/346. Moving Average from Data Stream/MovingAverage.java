class MovingAverage {
    
    Queue<Integer> q;
    //int first;
    double sum;
    int size;
    int cSize;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q = new LinkedList<>();
        sum=0.0;
        this.size = size;
        cSize = 0;
    }
    
    public double next(int val) {
        if(cSize<size){
            cSize++;          
        }else if(cSize==size){
            sum-=q.poll();
            
        }
        
        q.offer(val);
        sum+=val;
        
        return sum/cSize;
 
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
