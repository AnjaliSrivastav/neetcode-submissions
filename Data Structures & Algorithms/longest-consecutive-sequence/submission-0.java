class Solution {
    public int longestConsecutive(int[] nums) {
         Map<Integer,Boolean> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, false);
        }

        int maxSize = 0;
        for(int i=0; i < nums.length; i++) {
            int size = 0;
            if(map.get(nums[i]) == false) {
                map.put(nums[i], true);
                size++;

                int nextElement = nums[i] + 1;
                int prevElement = nums[i] -1;

                while(map.containsKey(nextElement)) {
                    map.put(nextElement, true);
                    size++;
                    nextElement = nextElement +1;
                }

                while(map.containsKey(prevElement)) {
                    map.put(prevElement, true);
                    size++;
                    prevElement = prevElement - 1;
                }
            } else {
                i++;
                size++;
            }

            if(size > maxSize) {
                maxSize = size;
            }
        }

        return maxSize;
    }
}
