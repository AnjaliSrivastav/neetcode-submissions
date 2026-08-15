class Solution {
    public boolean isValidSudoku(char[][] board) {
         Set<Integer> rowSet = null;
         Set<Integer> colset = null;
         Map<Integer, Set<Integer>> colmap = new HashMap<>();

         Map<String, Set<Integer>> squareMap = new HashMap<>();
         Set<Integer> squareSet = null;

         for(int i=0; i< board.length; i++ ) {
             //for each row, there is a set
             rowSet = new HashSet<>();

             for (int j=0; j< board[i].length; j++) {

                 //for each column, there is a set
                 if(colmap.containsKey(j)) {
                    colset = colmap.get(j);
                 } else {
                     colset = new HashSet<>();
                     colmap.put(j, colset);
                 }

                 ////for each square of 3*3, there is a set
                 String key = String.valueOf(i/3 + "-" + j/3);
                 if(squareMap.containsKey(key)) {
                     squareSet = squareMap.get(key);
                 } else {
                     squareSet = new HashSet<>();
                     squareMap.put(key, squareSet);
                 }

                 if(!(board[i][j] == '.')) {
                     int num = board[i][j] - '0';

                     if(rowSet.contains(num) || colset.contains(num) || squareSet.contains(num)) {
                         return false;
                     } else {
                         rowSet.add(num);
                         colset.add(num);
                         squareSet.add(num);
                     }
                 }

             }
         }
        return true;
    }
}
