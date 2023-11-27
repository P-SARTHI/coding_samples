
import java.util.Scanner;
public class array_check_asend {
    public static void main(String args[])
    {
        System.out.print("enter the size of array: ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        print(n);

    }
    public static void print(int n)
        {   int  ar[]=new int[n];
             Scanner s= new Scanner(System.in);

            for(int i=0;i<n;i++)
            {
                System.out.println("plz enter "+(i+1)+" number of array");
                int a=s.nextInt();
                ar[i]=a;
            }
            System.out.println();
            System.out.println("entred arrya is : ");
            for(int i=0;i<n;i++)
            {
                System.out.print(ar[i]);
            }
            System.out.println();
            for (int i=0;i<n;i++)
            { if (i==(n-1))
                {
                    System.out.println("the array is sorted in asending !!");
                    break;
                }
                if(ar[i]>ar[i+1] )
                {
                    System.out.println(" array is not in ascending order ,error at index "+i+" and "+(i+1));
                    break;
                    
                }
                
            }

        }
}
