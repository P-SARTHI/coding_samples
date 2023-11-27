import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=s.nextInt();
        System.out.println("fibonacchi series upto n terms is : ");
        fibo(n);

    }
    public static void fibo(int n)
    {
       int ar[]= new int[n];
       for(int i=0;i<n;i++)
       {
        ar[i]=i;
       }
       for(int j=2;j<n;j++)
       {
        ar[j]=ar[j-1]+ar[j-2];
       }
       for(int k=0;k<n;k++)
       {
        System.out.print(ar[k]);
       }
    }
}
