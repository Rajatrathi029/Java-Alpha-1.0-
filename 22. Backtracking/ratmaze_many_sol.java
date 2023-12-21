//Print multiple solution
//Allowed moves : down and right
public class ratmaze_many_sol {
    public static boolean issafe(int[][]maze,int [][]ans,int x,int y){
        while(x<maze.length && y<maze.length && maze[x][y]==1){
            return true;
        }
        return false;
    }

    public static void maze(int[][]maze,int [][]ans,int x,int y){
        int N=maze.length;
        //base case
        if(x==N-1 && y==N-1 && maze[N-1][N-1]==1){
            ans[N-1][N-1]=1;
            printboard(ans);
        }
        //recursion
        if(issafe(maze,ans,x,y)){
            ans[x][y]=1;
            maze(maze,ans,x+1,y);
            maze(maze,ans,x,y+1);
            ans[x][y]=0;
        }
    }

    public static void printboard(int maze[][]){
        System.out.println("---------Rat Maze---------");
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
        }
        System.out.println();
        }
    }

    public static void main(String args[]){
        int maze[][] = {{1,1,1,1},
                        {1,1,0,1},
                        {0,1,0,1},
                        {1,1,1,1}};
        int N=maze.length;
        int ans[][]=new int[N][N];
        //function call
        maze(maze,ans,0,0);
    }
}

//Output:-
// ---------Rat Maze---------
// 1 0 0 0 
// 1 1 0 0 
// 0 1 0 0 
// 0 1 1 1 
// ---------Rat Maze---------
// 1 1 0 0 
// 0 1 0 0 
// 0 1 0 0 
// 0 1 1 1 
// ---------Rat Maze---------
// 1 1 1 1 
// 0 0 0 1 
// 0 0 0 1
// 0 0 0 1
