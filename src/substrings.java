import java.util.*;
public class substrings {
    public static void main (String args[]){
        print("abc");
    }
    public static void print(String word){
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=0;j<word.length();j++){
                String s="";
                for(int k=i;k<=j;k++){
                    s=s+word.charAt(k);
                    

                }
                if(s!=""){
               temp.add(s);
                }
            }
        }
        System.out.println(temp);
    }
    public static void print_recur(String word, String ans){
       
          
          
    }
}
