class Solution {
    public static void helper(int arr[], int start, List<Integer>hlp,List<List<Integer>>ans )
    {
        if(arr.length==start)
        {
         ans.add(new ArrayList<>(hlp));
         return;
        }
        helper(arr, start+1, hlp, ans);
        hlp.add(arr[start]);
        helper(arr, start+1, hlp, ans);
        hlp.remove(hlp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>hlp=new ArrayList<>();
       helper(nums, 0, hlp, ans);
       return ans;
    }
}