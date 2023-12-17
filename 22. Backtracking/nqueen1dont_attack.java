//Don't attack in col and diag. directions
public class nqueen1dont_attack{
        public static void dontattk(char board[][],int row){
            //base case
            if(row==board.length){
                printboard(board);
                return;
            }
            //col loop
            for(int j=0;j<board.length;j++){
                board[row][j]='Q';
                dontattk(board, row+1);//func call
                board[row][j]='x';//backtracking step
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
            int n=2;
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
    
//Output:-
// ---------Chess Board---------
// Q x 
// Q x
// ---------Chess Board---------
// Q x
// x Q
// ---------Chess Board---------
// x Q
// Q x
// ---------Chess Board---------
// x Q
// x Q
