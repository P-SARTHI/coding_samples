import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quick_sort {
    public static void main(String arg[]){
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {0,44,2,5,1});
        System.out.println("unsorted array is : ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        qsort( arr,0,arr.size()-1);
          System.out.println("sorted array is : ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
    public static void qsort(List <Integer> arr, int low, int high){
        if(low> high)
        return;
        else{
        int partition=setpivot_and_arrange(arr,low,high);
        qsort(arr, low, partition-1);
        qsort(arr, partition+1, high);}

    }
    public static int setpivot_and_arrange(List<Integer> arr, int low, int high){
            int pivot=arr.get(low);
            int i=low;
            int j=high;

            while(i<j){
                
                while(arr.get(i)<=pivot && i<=high-1){ //look out for high -1
                    i++;  

                }
                while(arr.get(j)>pivot && j>=low+1){// look out for low+1
                    j--;
                }
                if(i<j)//swap only if i and j are in thier own teritorry
                {int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);}
                 

            }
            if(i>=j)//if i and j enter others terittory swap the pivot with j
             {int temp1=arr.get(low);
             arr.set(low,arr.get(j));
             arr.set(j,temp1);}
             return j;


                              

    }
}
