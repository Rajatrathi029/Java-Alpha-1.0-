public class findsubsetbysb {
        public static void fSubset(String str, StringBuilder ans, int i){
            //Base case
            if(i==str.length()){
                if(ans.length()==0){
                    System.out.println("null");
                }
                else{
                    System.out.println(ans);
                }
                return;
            }
            //yes
            fSubset(str, ans.append(str.charAt(i)), i+1);
            ans.deleteCharAt(ans.length()-1); //ans.deleteCharAt(i); -> result error as 
            //when ans="ac" then i=2, hence ans.deleteCharAt(2) doesn't exist. WE CAN ANALYSE BY
            //CALL STACK AND CODE OUTPUT

            //no
            fSubset(str, ans, i+1);
        }
    public static void main(String args[]){
        String str="abc";
        StringBuilder ans=new StringBuilder();
        fSubset(str,ans, 0);
    }
    }
//Output:-
// abc
// ab
// ac
// a 
// bc
// b 
// c
// null