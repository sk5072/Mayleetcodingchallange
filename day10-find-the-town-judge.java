class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] count1=new int[N+1];
        int[] count2=new int[N+1];
        int n=trust.length,m=N-1;
        for(int i=0;i<n;i++)
        {
            count1[trust[i][1]]++;
            count2[trust[i][0]]++;
        }
        for(int i=1;i<N+1;i++)
        {
            // System.out.println(count[i]);
            if(count1[i]==m && count2[i]==0)
                return i;
        }
        return -1;
    }
}
