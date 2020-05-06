class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> lst=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            lst.put(nums[i],lst.containsKey(nums[i])?lst.get(nums[i])+1:1);
        }
        for(int i:lst.keySet())
            if(lst.get(i)>(nums.length/2))
                return i;
        return -1;
    }
}
