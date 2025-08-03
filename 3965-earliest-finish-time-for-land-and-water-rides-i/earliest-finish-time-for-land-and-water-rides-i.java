class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int mintym=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landend=landStartTime[i]+landDuration[i];
                int waterstart=Math.max( waterStartTime[j],landend);
                int finish1=waterstart+ waterDuration[j];

                int waterend=waterStartTime[j]+waterDuration[j];
                int landstart=Math.max(landStartTime[i], waterend);
                int finish2=landstart+landDuration[i];

                  int finishTime = Math.min(finish1, finish2);
                   mintym = Math.min(mintym, finishTime);
            }
        }
        return  mintym;

        
    }
}