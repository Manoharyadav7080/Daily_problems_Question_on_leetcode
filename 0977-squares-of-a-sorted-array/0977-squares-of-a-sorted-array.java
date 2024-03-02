class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0,end=nums.length-1;
        int arr[]=new int[nums.length];
        int endans=arr.length-1;

        while(start<=end && endans>=0)
        {
            if(Math.abs(nums[start])<=Math.abs(nums[end]))
            {
                arr[endans--]=nums[end]*nums[end];
                end--;
            }
            else
            {
                arr[endans--]=nums[start]*nums[start];
                start++;
            }
        }
        return arr;

    }
}