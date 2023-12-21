//Print One Solution only
public class nqueen4one_solution{
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

        public static boolean dontattk(char board[][],int row){
            //base case
            if(row==board.length){
                return true;
            }
            //col loop
            for(int j=0;j<board.length;j++){
                if(issafe(board,row,j)){
                board[row][j]='Q';
                if(dontattk(board, row+1)){//If n-1 queens can be placed safely
                    return true;//terminate the function if 1 solution is find
                }
                board[row][j]='x';//backtracking step
            }
        }
        return false;
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
            //Function call
            if(dontattk(board,0)){
                System.out.println("Solution is possible");
                printboard(board);
            }
            else{
                System.out.println("Solution is not possible");
            }
            
        }
    }
    
//Output(n=4):-
// Solution is possible
// ---------Chess Board---------
// x Q x x 
// x x x Q
// Q x x x
// x x Q x
