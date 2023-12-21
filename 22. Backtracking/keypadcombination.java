//0:null  1:null  2:a,b,c  3:d,e,f
public class keypadcombination {
    public static void keypad(String str){
        char list[][]={{},{},{'a','b','c'},{'d','e','f'}};
        combination(str,list,0,"");
        }
    public static void combination(String str, char[][]list,int i,String ans){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        char list2[]=list[Character.getNumericValue(str.charAt(i))];
        for(int j=0;j<list2.length;j++){
            combination(str, list, i+1,ans+list2[j]);
        }
    }
    public static void main(String args[]){
        String str="23";
        keypad(str);
    }
}

//Output:-
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf