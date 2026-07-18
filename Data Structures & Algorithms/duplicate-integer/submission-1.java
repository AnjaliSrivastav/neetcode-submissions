class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int value: nums) {
            if(set.contains(value)) {
                return true;
            }
             set.add(value);
             
        }
        return false;
    }
}