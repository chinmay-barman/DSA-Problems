class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>row[]=new HashSet[9];
        Set<Character>col[]=new HashSet[9];
        Set<Character>sub[][] =new HashSet[3][3];
        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sub[i][j]=new HashSet<>();
            }
        }
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[r].length;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                if(row[r].contains(board[r][c])){
                    return false;
                }
                else if(col[c].contains(board[r][c])){
                    return false;
                }
                else if(sub[r/3][c/3].contains(board[r][c])){
                    return false;
                }
                row[r].add(board[r][c]);
                col[c].add(board[r][c]);
                sub[r/3][c/3].add(board[r][c]);
            }
        }
        return true;
    }
}