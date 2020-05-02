/*
here i have used bruteforce approach by search every stones element in jewels
and time complexity is nxm
n- no of stones
m- no of jewels
*/
class Solution {
    public int numJewelsInStones(String J, String S) {
        int nj=J.length();
        int ns=S.length();
        int count=0;
        for(int i=0;i<ns;i++)
        {
            for(int j=0;j<nj;j++)
            {
                if(S.charAt(i)==J.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
