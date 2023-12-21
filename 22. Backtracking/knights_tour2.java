//Run for n<8 values and similar to previous one
public class knights_tour2 {
    public static boolean issafe(int[][]board,int i, int j){
        return (i>=0 && j>=0 && i<board.length && j<board.length && board[i][j]==-1);
    }

    public static void board(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=-1;
        }
        }

        int x_move[]={2,2,-2,-2,1,1,-1,-1};
        int y_move[]={1,-1,1,-1,2,-2,2,-2};
        
        if(board2(board,0,0,0,x_move,y_move)){
            System.out.println("Solution is possible");
            printboard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }

        public static boolean board2(int[][]board,int i, int j, int count, int[] x_move, int[] y_move){
            //base case
        int n=(board.length*board.length);
        if(count==n){
            return true;
        }
        //recursion
            for(int k=0;k<8;k++){
                // int next_x=i+x_move[k];
                // int next_y=i+y_move[k];
                if(issafe(board,i,j)){
                board[i][j]=count;
                if(board2(board,i+x_move[k] ,j+y_move[k], count+1, x_move, y_move)){//(++count) & (count++) are invalid
                    return true;
                }
                board[i][j]=-1;//backtracking
        }
                
            }
            
        return false;
    }

    public static void printboard(int maze[][]){
        System.out.println("---------Knight's Tour---------");
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                if(maze[i][j]<10){
                    System.out.print("0"+maze[i][j]+" ");
                }else{
                    System.out.print(maze[i][j]+" ");
            }
        }
        System.out.println();
        }
    }

    public static void main(String args[]){
        int n=7;
        int board[][]= new int[n][n];
        board(board);
    }
}

//Output(n=7):-
// Solution is possible
// ---------Knight's Tour---------
// 0 27 36 39 24 29 8   
// 37 40 25 28 9 34 23  
// 26 1 38 35 22 7 30   
// 41 18 43 16 31 10 33 
// 44 47 2 21 4 13 6    
// 19 42 17 46 15 32 11 
// 48 45 20 3 12 5 14  
