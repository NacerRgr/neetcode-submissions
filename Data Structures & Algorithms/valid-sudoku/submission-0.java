class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();   
        
        // Vérification des lignes
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                row.putIfAbsent(i, new HashSet<>());
                
                if(row.get(i).contains(board[i][j])){
                    return false;
                } else {
                    row.get(i).add(board[i][j]);
                }
            }
        }

        // Vérification des colonnes
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                column.putIfAbsent(i, new HashSet<>());
                
                if(column.get(i).contains(board[j][i])){
                    return false;
                } else {
                    column.get(i).add(board[j][i]);
                }
            }
        }

        // Vérification des sous-grilles 3x3
        for(int boxRow = 0; boxRow < 3; boxRow++){
            for(int boxCol = 0; boxCol < 3; boxCol++){
                Set<Character> seen = new HashSet<>();
                
                for(int i = boxRow * 3; i < boxRow * 3 + 3; i++){
                    for(int j = boxCol * 3; j < boxCol * 3 + 3; j++){
                        if(board[i][j] == '.'){
                            continue;
                        }
                        
                        if(!seen.add(board[i][j])){ // add() retourne false si déjà présent
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}