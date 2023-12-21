//(0,0) to (n-1,m-1)
public class grid_ways_trick {
    public static int fact(int n){
        //base case
        if(n==1){
            return 1;
        } 
        //kaam
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int total= fact(n+m-2)/(fact(n-1)*fact(m-1));
        System.out.println(total);
    }
}
//Output(3x3):-
//6
