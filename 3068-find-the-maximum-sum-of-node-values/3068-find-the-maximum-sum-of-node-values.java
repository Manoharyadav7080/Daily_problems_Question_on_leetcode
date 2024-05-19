class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        long count = 0;
        long SmallNum = Long.MAX_VALUE;

        for(int n : nums){
            if((n^k) > n){
                sum += (n^k);
                SmallNum = Math.min(SmallNum,(long)((n^k)-n));
                count++;
            }
            else{
                sum += n;
                SmallNum = Math.min(SmallNum,(long)(n-(n^k)));
            }
        }

        if(count%2 == 0){
            return sum;
        }
        return sum - SmallNum;
    }
}