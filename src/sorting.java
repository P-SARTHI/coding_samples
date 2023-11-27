
import java.util.*;
public class sorting {
    public static void main(String args[])
    { int  ar[]={4,5,3,2,1};
     
    
         
               System.out.println("given array is: ");
       
        for(int i=0;i<ar.length;i++)
        System.out.print(+ar[i]+" ");
       
       System.out.println();
       insertion(ar);
       //small(ar);
      //bubble(ar);
      //selection(ar);
       


        

    }
    public static void bubble(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-1-i;j++)//every iteration of ths loop pushes largest to the end of the array
            {
                if(ar[j]>ar[j+1])
                {int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;

                }
            }

        }
        System.out.println();
        System.out.print("sorted by algo : ");
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");

    }

    public static void small(int ar[])
    {   int smallest=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<smallest)
            {smallest=ar[i];

            }
        }
        System.out.println(smallest);
    }

    public static void selection(int ar[])
    {
        
    for(int i=0;i<ar.length;i++)
    {
        int smallest=i;
        for(int j=i;j<ar.length;j++)
        {
            if(ar[j]<ar[smallest])
            {
                smallest=j;
            }


        }
        int temp=ar[i];
        ar[i]=ar[smallest];
        ar[smallest]=temp;
        
       
    }
 
         System.out.println();
        System.out.print("sorted by algo : ");
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
     
         }

    public static void insertion(int ar[])
    {  for(int i=1;i<ar.length;i++)
        {
           if(ar[i-1]>ar[i])
           {
            for(int j=i;j>0;j--)
            {
                if(ar[j]<ar[j-1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
            
           }
          for(int l=0;l<ar.length;l++)
          {
            System.out.print(ar[l]+" ");
          }
          System.out.println();
          

            
        }
        
        System.out.println();
        System.out.print("sorted by algo : ");
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");

    }

 
    
}
