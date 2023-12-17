//Count Case
public class nqueen3count{
        public static boolean issafe(char board[][], int row, int col){
            //vertical up
            for(int i=0;i<row;i++){
                if(board[i][col]=='Q'){
                    return false;
                }
            }

            //diagonal left
            for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }

            //diagonal right
            for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }

        public static void dontattk(char board[][],int row){
            //base case
            if(row==board.length){
                count++;
                return;
            }
            //col loop
            for(int j=0;j<board.length;j++){
                if(issafe(board,row,j)){
                board[row][j]='Q';
                dontattk(board, row+1);//func call
                board[row][j]='x';//backtracking step
            }
        }
    }
        static int count;
        public static void main(String args[]){
            int n=4;
            char board[][]=new char[n][n];
            //initialise
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='x';
            }
            }

            dontattk(board,0);
            System.out.println("Total possible solutions: "+ count);
        }
    }
    
//Output(n=4):-
//Total possible solutions: 2
