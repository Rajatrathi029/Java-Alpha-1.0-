//Run for n<8 values
public class knights_tour {
    public static boolean issafe(int[][]board,int i, int j){
        return (i>=0 && j>=0 && i<board.length && j<board.length && board[i][j]==-1);
    }
    public static boolean board(int[][]board,int i, int j, int count){
        //base case
        int n=(board.length*board.length);
        if(count==n){
            return true;
        }
        //recursion
        if(issafe(board, i, j)){
            board[i][j]=count;
            if(board(board, i+2, j+1, count+1)){//(++count) & (count++) are invalid
                return true;
            }
            if(board(board, i+2, j-1, count+1)){
                return true;
            }
            if(board(board, i-2, j+1, count+1)){
                return true;
            }
            if(board(board, i-2, j-1, count+1)){
                return true;
            }
            if(board(board, i+1, j+2, count+1)){
                return true;
            }
            if(board(board, i-1, j+2, count+1)){
                return true;
            }
            if(board(board, i+1, j-2, count+1)){
                return true;
            }
            if(board(board, i-1, j-2, count+1)){
                return true;
            }
            board[i][j]=-1;//backtracking
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
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=-1;
        }
    }
        if(board(board,0,0,0)){
            System.out.println("Solution is possible");
            printboard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
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