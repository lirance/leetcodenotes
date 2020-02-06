class Solution {
    public int connectSticks(int[] sticks) {
                int res = 0;
        //add all elements to the min heap
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int s : sticks)
            pq.add(s);
        
        //iterate over all elements in the heap
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            res += cost;
            pq.add(cost);
        }
        
        return res;
    }
//         int cost=0;
        
//         for(int i=0;i<sticks.length-1;i++){
//             cost=connectTwo(cost,sticks);
//         }
        
//         return cost;
//     }
    
//     public int connectTwo(int cost, int[] sticks){
//         int minIndex =0;
//         int minIndex1 =0;
//         int mini=Integer.MAX_VALUE;
//         int mini1=Integer.MAX_VALUE;
//         for(int i=0;i<sticks.length;i++){
//             if(sticks[i]!=-1&&sticks[i]<mini){
//                 mini1=mini;
//                 mini=sticks[i];
//                 minIndex1=minIndex;
//                 minIndex = i;
//             }else if(sticks[i]!=-1&&sticks[i]<mini1){
//                 minIndex1=i;
//                 mini1=sticks[i];
//             }
//         }
//         int newStick= sticks[minIndex]+sticks[minIndex1];
//         sticks[minIndex]= newStick;
//         sticks[minIndex1]=-1;
//         return cost+newStick;
//     }
}

//// mini heap using
