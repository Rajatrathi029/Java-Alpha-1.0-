//(0,0) to (n-1,m-1)
public class grid_ways {
    public static int grid(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;//target cell to target cell
        } 
        else if(i==n||j==m) {
            return 0;//grid edge case
        }
        //kaam
        int w1=grid(i, j+1, n, m);//right 
        int w2=grid(i+1, j, n, m);//down
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(grid(0, 0, n, m));
    }
}
//Output(3x3):-
//6
