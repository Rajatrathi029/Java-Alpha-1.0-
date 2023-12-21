//Sudoku
public class sudoku{
        public static boolean issafe(int board[][],int row, int col, int digit){
            for(int i=0;i<=8;i++){
                if(board[row][i]==digit){//row
                    return false;
                }
                else if(board[i][col]==digit){//column
                    return false;
                }
            }

                //grid
                int sr=(row/3)*3;//(row/3)={0:1st grid, 1:2nd grid, 2:3rd grid}
                int sc=(col/3)*3;
                //3x3 grid
                for(int i=sr;i<sr+3;i++){
                    for(int j=sc;j<sc+3;j++){
                        if(board[i][j]==digit){//row
                    return false;
                }
                }
            }
            return true;
    }
        public static boolean sudokusol(int board[][], int row, int col){
            //base case
            if(row==9){
                return true;
            }
            //kaam
            int Nextrow=row,Nextcol=col+1;
            if(col==8){
                Nextrow=row+1;
                Nextcol=0;
            }
            if(board[row][col]!=0){
                return sudokusol(board, Nextrow, Nextcol);
            }
                for(int digit=1;digit<=9;digit++){
                    if(issafe(board,row,col,digit)){
                    board[row][col]=digit;
                    if(sudokusol(board, Nextrow, Nextcol)){
                        return true;
                    }
                    board[row][col]=0;
            }
            }
            return false;
        }
        public static void printboard(int board[][]){
            System.out.println("-------Sudoku---------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    if(j==2|| j==5){
                        System.out.print(board[i][j]+" "+"|"+" ");
                    }
                    else if((i==2|| i==5) && j==8){
                        System.out.print(board[i][j]+" ");
                        System.out.println();
                        for(int k=0; k<21;k++){
                            System.out.print("-");
                        }
                    }
                    else{
                    System.out.print(board[i][j]+" ");
                    }
            }
            System.out.println();
            }
        }
        public static void main(String args[]){
            int board[][]={{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
            //Function call
            if(sudokusol(board, 0, 0)){
                System.out.println("Solution is possible");
                printboard(board);
            }
            else{
                System.out.println("Solution is not possible");
            }
        }
}
//Output:-
// Solution is possible
// -------Sudoku---------
// 3 1 6 | 5 7 8 | 4 9 2 
// 5 2 9 | 1 3 4 | 7 6 8
// 4 8 7 | 6 2 9 | 5 3 1
// ---------------------
// 2 6 3 | 4 1 5 | 9 8 7
// 9 7 4 | 8 6 3 | 1 2 5
// 8 5 1 | 7 9 2 | 6 4 3
// ---------------------
// 1 3 8 | 9 4 7 | 2 5 6
// 6 9 2 | 3 5 1 | 8 7 4
// 7 4 5 | 2 8 6 | 3 1 9
