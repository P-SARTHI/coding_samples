

import java.util.*;
public class union_of_arrays {
    public static void main (String args[]){
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
        union( num1,num2);
    }
    public static void union(int num1[],int num2[]){
          HashSet<Integer> hs=new HashSet<>();
         for(int i=0;i<num1.length;i++){
            hs.add(num1[i]);
         }
         for(int i=0;i<num2.length;i++){
            hs.add(num2[i]);
         }
         System.out.println(hs.size());

        }

    
}
