class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[]freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> b - a);
        for(int t:freq){
            if(t>0) pq.add(t);
        }
        int time=0;
        while(!pq.isEmpty()){
            ArrayList<Integer>temp=new ArrayList<>();
            int cycle=n+1;
            for(int i=0;i<cycle && !pq.isEmpty();i++){
                temp.add(pq.poll()-1);
                time++;
            }
             for(int t:temp){
                if(t>0) pq.add(t);
             }
             if(!pq.isEmpty()){
                 time += cycle - temp.size();
             }
        }
        return time;
        
    }
}