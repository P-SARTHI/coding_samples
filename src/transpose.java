import java.util.Scanner;

public class transpose {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter columbs : ");
        int col=s.nextInt();
        System.out.println("enter rows : ");
        int rows=s.nextInt();
       
        trans(rows,col);
    }
    public static void trans(int r, int c)
    {
        Scanner s=new Scanner(System.in);
        int ar[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("enter the number at "+i+j+" positon");
                ar[i][j]=s.nextInt();
            }
        }
        System.out.println("entered matrix is :");
        for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               System.out.print(ar[i][j]);
               
           }
           System.out.println();
       }
       
      
      System.out.println("transpose matrix is :");
      int ar1[][]=new int[c][r];
       for(int i=0;i<c;i++)
       {
           for(int j=0;j<r;j++)
           {
               System.out.print(ar[j][i]);
               ar1[i][j]=ar[j][i];
               
           }
           System.out.println();
       }
       System.out.println("stores 2d array is ::");
        for(int i=0;i<c;i++)
       {
           for(int j=0;j<r;j++)
           {
               System.out.print(ar1[i][j]);
               
               
           }
           System.out.println();
       }






    }
}
