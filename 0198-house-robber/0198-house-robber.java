class Solution {
    public int rob(int[] nums) {
       int n = 0;
       int m = 0; 

       for ( int money : nums){
        int curr = Math.max(m, n + money);
        n = m ;
         m = curr;
       } 
       return m;
    }
}