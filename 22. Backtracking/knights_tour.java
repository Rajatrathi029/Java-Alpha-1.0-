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
            if(board(board, i+2, j+1, count++)){
                return true;
            }
            if(board(board, i+2, j-1, count++)){
                return true;
            }
            if(board(board, i-2, j+1, count++)){
                return true;
            }
            if(board(board, i-2, j-1, count++)){
                return true;
            }
            if(board(board, i+1, j+2, count++)){
                return true;
            }
            if(board(board, i-1, j+2, count++)){
                return true;
            }
            if(board(board, i+1, j-2, count++)){
                return true;
            }
            if(board(board, i-1, j-2, count++)){
                return true;
            }
            board[i][j]=-1;
        }
        return false;
    }
    public static void printboard(int maze[][]){
        System.out.println("---------Knight's Tour---------");
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
        }
        System.out.println();
        }
    }

    public static void main(String args[]){
        int n=8;
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

//Output:-
