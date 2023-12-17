public class findsubsetbystr {
        public static void fSubset(String str, String ans, int i){
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
            fSubset(str, ans+str.charAt(i), i+1);
            //no
            fSubset(str, ans, i+1);
        }
    public static void main(String args[]){
        String str="abc";
        fSubset(str,"", 0);
    }
    }
