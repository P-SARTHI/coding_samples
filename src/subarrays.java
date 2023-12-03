import java.util.*;
public class subarrays {
    public static void main(String args[]){
       int arr[]={1,2,3,4};
     LinkedList<Integer> ans=new LinkedList<>();
      // subarrays_without_rcursion(arr);
      // sumof_subarrays_prefixmethod(arr);
       subarrays_without_rcursion(arr);
    }
    public static  void subarrays_without_rcursion(int arr[]){
            int count=0;  
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                   
                }
                 System.out.print(" "+"the sums is "+sum);
                 if(sum>3){
                    count++;
                 }
             System.out.println();   
            }
            
        }
        System.out.println("number of subarays with sum grater than 3 are "+count);
    }
    public static void sumof_subarrays_prefixmethod(int arr[]){

         int prefix[]=new int[arr.length];
         prefix[0]=arr[0];
         System.out.println("sums of subarrays are: ");
         System.out.println(prefix[0]);
         for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            System.out.println(prefix[i]);
         }
         
        for(int i=1;i<prefix.length;i++){
            for(int j=i;j<prefix.length;j++){
                System.out.println(prefix[j]-prefix[i-1]);
            }
        }
         
    }
    public static void subarrays_with_rcursion(int  arr[],String ans){
       
             
        
    }
}
