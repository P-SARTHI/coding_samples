import java.util.*;
public class intersection_array {
    public static void main(String args[]){
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
        instersect(num1,num2);
    }
    public static void instersect(int[] num1,int[] num2){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<num2.length;i++){//chose the larger set to remove duplicates 
            hs.add(num2[i]);
        }
        int count=0;
        for(int i=0;i<num1.length;i++){//compare the other set with hashset 
            if(hs.contains(num1[i])){
                count++;
            }
        }
        System.out.println(count);
    } 
}
