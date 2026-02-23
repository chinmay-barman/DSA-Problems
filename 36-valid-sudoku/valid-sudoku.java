class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>row[]=new HashSet[9];
        Set<Character>col[]=new HashSet[9];
        Set<Character>sub[]=new HashSet[9];
        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            sub[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                else if(row[r].contains(board[r][c])){
                    return false;
                }
                else if(col[c].contains(board[r][c])){
                    return false;
                }
                else if(sub[(r/3)*3+(c/3)].contains(board[r][c])){
                    return false;
                }
                row[r].add(board[r][c]);
                col[c].add(board[r][c]);
                sub[(r/3)*3+(c/3)].add(board[r][c]);
            }
        }
        return true;
    }
}