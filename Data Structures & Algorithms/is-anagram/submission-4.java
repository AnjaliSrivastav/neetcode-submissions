class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        int []frequency = new int[26];

        //Iterate first array:  index = ch -'a', //aab
        for(int j=0; j< s.length();j++) {
            char ch = s.charAt(j);
            frequency[s.charAt(j) - 'a']++;
            frequency[t.charAt(j) - 'a']--;

        }

        //Iterate the letters array
        for(int count: frequency) {
            if( count != 0) {
                return false;
            }
        }
        return true;
    }
}
