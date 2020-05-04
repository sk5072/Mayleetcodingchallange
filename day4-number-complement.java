class Solution {
    public int bitwiseComplement(int N) {
        List<Integer> lst= new ArrayList<>();
        int n=N;
        if(n==0)
            return 1;
        while(n>0){
            lst.add(n%2);
            n=n/2;
        }
        int m=lst.size();
        int k=0;
        for(int i=0;i<m;i++)
        {
             if(lst.get(i)==0)
                 lst.set(i,1);
            else
                lst.set(i,0);
            System.out.print(lst.get(i));
        }
        for(int i=0;i<m;i++)
        {
             k=k+lst.get(i)*(int)Math.pow(2,i);
        }
        // System.out.print(k);
        return k;
    }
}
