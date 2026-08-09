class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }

        }



        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(k, Comparator.comparingInt(Map.Entry:: getValue));

        //loop the map, populate pq
       for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(pq.size() < k) {
                pq.offer(entry);
            } else {
                int value1 = entry.getValue();
                int value2 = pq.peek().getValue();
                if(value1 > value2) {
                    pq.poll();
                    pq.offer(entry);
                }
            }
        }

        //iterate pq, populate ans array
        int[] ans = new int[k] ;
        int index=0;
        while(!pq.isEmpty() && index != k) {
            Map.Entry<Integer,Integer> entry = pq.poll();
            ans[index] = entry.getKey();
            index++;
        }

        return ans;
    }
}
