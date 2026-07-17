class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0, c = 0;

        for (int x : nums){
            if ( c == 0) ans = x;

            if ( x == ans)
            c++;
            else 
            c--;
        }
        return ans;
        
    }
}