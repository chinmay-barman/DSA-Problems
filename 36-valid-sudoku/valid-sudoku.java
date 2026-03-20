class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>row[] = new HashSet[9];
        HashSet<Character>col[] = new HashSet[9];
        HashSet<Character>subBox[] = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            subBox[i] = new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && row[i].contains(board[i][j])){
                    return false;
                }
                else if(board[i][j]!='.' && col[j].contains(board[i][j])){
                    return false;
                }
                else if(board[i][j]!='.' && subBox[((i/3)*3)+(j/3)].contains(board[i][j])){
                    return false;
                }
                if(board[i][j]!='.'){
                    row[i].add(board[i][j]);
                    col[j].add(board[i][j]);
                    subBox[((i/3)*3)+(j/3)].add(board[i][j]);
                }
            }
        }
        return true;
    }
}