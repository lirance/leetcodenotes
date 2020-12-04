class Solution {
    public boolean isHappy(int n) {
        
        int slow = n, fast = n;
        
        while(fast != 1 && getNext(fast) != 1){
            
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            
            if(slow == fast && slow != 1){
                return false;
            }
        }
        
        return true;
        
        
        
    }
    
    public int getNext(int n){
        int res = 0;
        
        while(n>0){
            res = (n%10)*(n%10) + res;
            n = n/10;
        }
        
        return res;
    }
}
