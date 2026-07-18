class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer>  map = new HashMap<Character,Integer>();
        for(int i=0; i< s.length();i++) {
            Character ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            
        }

        for(int j=0; j<t.length(); j++) {
            Character th = t.charAt(j);
            if(!map.containsKey(th)){
                return false;
            } else {
                if(map.get(th) == 0) {
                    return false;
                }
                if(map.get(th) > 0) {
                   map.put(th, map.get(th) - 1);
                }
                
            }
        }

        for(int count: map.values()) {
            if(count != 0) {
                return false;
            }
        }

        return true;

    }
}
