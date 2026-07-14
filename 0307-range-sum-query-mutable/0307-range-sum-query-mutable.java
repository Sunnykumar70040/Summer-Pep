class NumArray {
int[] bit;
int[] nums;
int n;
    public NumArray(int[] nums) {
      this.nums = nums.clone();
      n = nums.length;
      bit = new int[n + 1];

      for ( int i = 0; i < n; i++){
      add(i + 1, nums[i]);
      }  
    }
    
    private void add(int i, int val){
        while ( i <= n){
            bit[i] += val;
            i += i & -i;
        }
    }

    private int sum( int i ){
        int res = 0;
        while (  i > 0){
            res += bit[i];
            i -= i & -i;
        }
        return res;
    }
    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        add(index + 1, diff);
    }

    
    public int sumRange(int left, int right) {
    return  sum(right + 1) - sum(left);    
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */