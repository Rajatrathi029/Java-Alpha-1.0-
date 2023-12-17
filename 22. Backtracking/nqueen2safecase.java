//Safe Case
public class nqueen2safecase{
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
                printboard(board);
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
        public static void printboard(char board[][]){
            System.out.println("---------Chess Board---------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
            }
            System.out.println();
            }
        }
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
        }
    }
    
//Output(n=4):-
// ---------Chess Board---------
// x Q x x 
// x x x Q
// Q x x x
// x x Q x 
// ---------Chess Board---------
// x x Q x
// Q x x x
// x x x Q
// x Q x x
