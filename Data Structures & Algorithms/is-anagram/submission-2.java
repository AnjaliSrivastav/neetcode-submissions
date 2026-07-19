class Solution {
    public boolean isAnagram(String s, String t) {
        int []letters = new int[26];

        //Iterate first array:  index = ch -'a', //aab
        for(int j=0; j< s.length();j++) {
            char ch = s.charAt(j);
            letters[ch - 'a']++; 
        }

        //iterae second array
        for(int k=0; k<t.length(); k++) {
            char ch = t.charAt(k);
            letters[ch -'a']--;
        }

        //Iterate the letters array
        for(int l: letters) {
            if( l != 0) {
                return false;
            }
        }
        return true;
    }
}
