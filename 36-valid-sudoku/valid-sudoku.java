class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(set.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                else{
                    if(board[i][j]!='.'){
                        set.add(board[i][j]);
                    }
                }
            }
            

        }
        for(int j=0;j<board[0].length;j++){
            HashSet<Character>set=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(set.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                else{
                    if(board[i][j]!='.'){
                        set.add(board[i][j]);
                    }
                }
            }
        }
        HashSet<Character>set1=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(set1.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set1.add(board[i][j]);
            }
        }
        HashSet<Character>set2=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){
                if(set2.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set2.add(board[i][j]);
            }
        }
        HashSet<Character>set3=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){
                if(set3.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set3.add(board[i][j]);
            }
        }HashSet<Character>set4=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){
                if(set4.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set4.add(board[i][j]);
            }
        }
        HashSet<Character>set5=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){
                if(set5.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set5.add(board[i][j]);
            }
        }
        HashSet<Character>set6=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){
                if(set6.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set6.add(board[i][j]);
            }
        }
        HashSet<Character>set7=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){
                if(set7.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set7.add(board[i][j]);
            }
        }
        HashSet<Character>set8=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){
                if(set8.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set8.add(board[i][j]);
            }
        }
        HashSet<Character>set9=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){
                if(set9.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                set9.add(board[i][j]);
            }
        }
        return true;
    }
}