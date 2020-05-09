class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1;
        if(num==1)
            return true;
        long r=num;
        while(l<=r)
        {
            long mid=l-(l-r)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid<num)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}
