class Solution {
public:
    int numRabbits(vector<int>& answers) {
       vector<int> freq(1001, 0);
       for( int x : answers)
       freq[x]++;

       int ans = 0; 

       for(int x = 0; x <= 1000; x++){
        if(freq[x] == 0) continue;

        int group = x + 1;
        int groups = (freq[x] + group - 1 )/ group;

        ans += groups * group;
       } 
       return ans;
    }
};