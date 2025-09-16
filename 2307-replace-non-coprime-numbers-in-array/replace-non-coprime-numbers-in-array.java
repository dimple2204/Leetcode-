class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer>stack=new ArrayDeque<>();
        for(int num:nums){
            stack.addLast(num);
            while(stack.size()>1){
                int b=stack.removeLast();
                int a=stack.removeLast();
                int g=gcd(a,b);
                if(g==1){
                    stack.addLast(a);
                      stack.addLast(b); 
                      break;

                }
                else{
                    long lcm=(long)a*b/g;
                    stack.addLast((int) lcm);
                }
            }
        }
          return new ArrayList<>(stack);
        
    }
    private int gcd(int a,int b){
        while(b!=0){
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
}