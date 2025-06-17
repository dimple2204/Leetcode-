class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int a:arr){
            if(k>0){
                pq.offer(a);
                k--;
            }
            else if(Math.abs(x-pq.peek())>Math.abs(x-a)){
                pq.poll();
                pq.offer(a);

            }
        }
        List<Integer>arraylist=new ArrayList<>();
        while(!pq.isEmpty()){
            arraylist.add(pq.peek());
            pq.poll();
        }
        return arraylist;
        
    }
}