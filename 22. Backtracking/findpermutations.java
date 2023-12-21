public class findpermutations {
    public static void permutations(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            //"abcd"-> "ab"+"d"
            String newstr=str.substring(0, i)+str.substring(i+1);
            permutations(newstr, ans+str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str="abc";
        permutations(str,"");
    }
}

//Output:-
// abc
// acb
// bac
// bca
// cab
// cba