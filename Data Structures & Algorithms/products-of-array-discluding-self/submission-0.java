class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //calculate the left side product of nums[i]
        for(int i=0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = 1;
            } else {
                result[i] = result[i-1]* nums[i-1];
            }

        }

        int rightProduct = 1;
        for(int i = nums.length -1; i >= 0; i--) {
            result[i]*= rightProduct;
            rightProduct*= nums[i];
        }
        return result;
    }
}  
