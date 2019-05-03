class Solution {
    public int fibRec(int N) {
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        return fib(N-1)+fib(N-2);
        
    }
    
    public int fib(int N) {
        
        int sum = 0;
        int a = 0;
        int b = 1;
        
        while (N>=0){
            sum+=a;
            a=b;
            b=sum;
            N--;
        }
        return sum;
        
    }
    
}
