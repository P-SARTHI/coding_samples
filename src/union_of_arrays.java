

import java.util.*;
public class union_of_arrays {
    public static void main (String args[]){
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
       // union( num1,num2);
       un(num1, num2);
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
    public static void un(int num1[],int num2[]){//brute force style
     
      int n3[]=new int[num1.length+num2.length];
     for(int i=0;i<num1.length;i++){
        n3[i]=num1[i];
     }
     for(int i=0;i<num2.length;i++){
        n3[num1.length+i]=num2[i];
     }
     
     n3=delete_duplicates(n3);
     int count=0;
     for(int i=0;i<n3.length;i++){
        if(n3[i]!=0)
        count++;
     }
     System.out.println(count);

       
       


    } 
    public static int[] delete_duplicates(int arr[]){
       int[] temp = new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   arr[j]=-999;
                   count++;
                }
            }
        } 
        // int[] temp = new int[arr.length-count+1];
        int j=0;
        for(int i=0;i<temp.length;i++){
            if(arr[i]!=-999){
                temp[j++]=arr[i];
            }
        } 
          
        return temp;
    }


    
}
