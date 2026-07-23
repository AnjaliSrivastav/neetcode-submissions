class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> anagramGroup = new ArrayList<>();
        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List list = null;
            if(!map.containsKey(key)) {
                list = new ArrayList<String>();
                list.add(s);
                map.put(key, list);
            } else {
               list = map.get(key);
               list.add(s);
               map.put(key, list);
               
            }
        }

        for(List<String> l: map.values()) {
            anagramGroup.add(l);
        }

        return anagramGroup;
        
    }
}
