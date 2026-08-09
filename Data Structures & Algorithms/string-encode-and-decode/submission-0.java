class Solution {

    public String encode(List<String> strs) {
         StringBuilder res = new StringBuilder();

        for (String str : strs) {
            res.append(str.length())
               .append("#")
               .append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the '#' after the length
            int separatorIndex = str.indexOf('#', i);

            // Extract the length
            String lengthString = str.substring(i, separatorIndex);

            // Convert length from String to int
            int length = Integer.parseInt(lengthString);

            // Start of actual string
            int start = separatorIndex + 1;

            // Extract exactly 'length' characters
            String word = str.substring(start, start + length);

            result.add(word);

            // Move i to the beginning of the next length
            i = start + length;
        }

        return result;
    }
}
