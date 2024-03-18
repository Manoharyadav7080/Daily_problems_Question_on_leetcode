class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(final int[] entry1, final int[] entry2){
                if(entry1[0]>entry2[0]) return 1;
                else return -1;
            }
        });
        int ans=0;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=points[i-1][1]){
                points[i][1]=Math.min(points[i][1], points[i-1][1]);
            }else ans++;
        }
        return ans+1;
    }
}