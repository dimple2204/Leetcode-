class ExamTracker {
    private List<Integer>times;
    private List<Long>prefixSums;


    public ExamTracker() {
        times=new ArrayList<>();
        prefixSums=new ArrayList<>();    
    }
    
    public void record(int time, int score) {
        times.add(time);
        if(prefixSums.isEmpty()){
            prefixSums.add((long)score);

        }
        else{
            prefixSums.add(prefixSums.get(prefixSums.size()-1)+score);
        }
        
    }
    
    public long totalScore(int startTime, int endTime) {
        int left=lowerBound(times,startTime);
         int right = upperBound(times, endTime) - 1;
         
         if(left>right) return 0;
           long rightSum = prefixSums.get(right);
           long leftSum= (left==0)?0:prefixSums.get(left - 1);
           return rightSum-leftSum;

        
    }
    private int lowerBound(List<Integer> list, int target){
        int low=0;
        int high=list.size()-1;
       
        while(low<high){
             int mid=(low + high) / 2;
        if(list.get(mid)<target){
            low=mid+1;
        }
        else{
            high=mid;
        }
        }
          return low;
    }
    
    private int upperBound(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */