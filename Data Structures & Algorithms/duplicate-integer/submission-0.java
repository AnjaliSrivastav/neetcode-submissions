class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i],true);
            }
        }
        return false;
    }
}