class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int m =search(nums,0,n-1);
        return m;
    }
    public int search(int[] nums, int low,int high)
    {
        if(low==high)
        {
            return nums[low];
            }
        int mid=(low+high)/2;
        if(mid%2==0)
        {
            if(nums[mid]==nums[mid+1])
                return search(nums,mid+2,high);
            else
                return search(nums,low,mid);
        }
        else if(mid%2==1)
        {
            if(nums[mid]==nums[mid-1])
                return search(nums,mid+1,high);
            else
                return search(nums,low,mid-1);
        }
        return nums[low];
    }
}
