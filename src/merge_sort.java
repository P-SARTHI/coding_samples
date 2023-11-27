

import java.util.ArrayList;

public class merge_sort {
    public static void main(String arg[]){
        int[] a={1,37,15,2,1};
        System.out.println("unsorted array is : ");
           for(int i=0;i<a.length;i++)
        {System.out.print(a[i]+" ");}
        System.out.println();
       sort_divide(a ,0,a.length-1);// it is imp to note that here (n-1)is passed 
        System.out.println("sorted array is : ");
           for(int i=0;i<a.length;i++)
        {System.out.print(a[i]+" ");}

     
    }

    public static void sort_divide(int[] a,int start,int end ){
        if(start>=end){
            return;
        }
        else{
            int mid=start+(end-start)/2;//this is more efficent  then (start+end)/2 as it can begreater than int
           
            sort_divide(a, start, mid);
            sort_divide(a, mid+1, end);
            sort_merge(a,start ,mid, end);
        }

    
    }
    public static void sort_merge(int[] a, int start,int mid, int end){
        ArrayList<Integer> b = new ArrayList<>(); 
        int i=start;
        int j=mid+1;
        
         while(i<=mid && j<=end)
        { if(a[i]<=a[j])
            {b.add(a[i]);
                
                i++;}
            else
            {b.add(a[j]);
                
                j++; }
        }
         while(j<=end)
            { b.add(a[j]);
                j++;
                 }
         while(i<=mid)
            {b.add(a[i]);
                i++;
                }
        
       for (int l = start; l <=end; l++) {
        a[l] = b.get(l - start);
    }

    }

}

// time comlpesity =O(nlogn)
//space complexity=O(n)
