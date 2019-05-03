class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(String str:ops){
            if(str.equals("+")){
                int top = s.pop();
                int newtop = top + s.peek();
                s.push(top);
                s.push(newtop);
            }else if(str.equals("D")){
                s.push(2*s.peek());
            }else if(str.equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(str));
            }
        }
        
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        
        return sum;
        
    }
}
