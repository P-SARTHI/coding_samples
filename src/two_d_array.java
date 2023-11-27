import java.util.*;
public class two_d_array {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter columbs : ");
        int col=s.nextInt();
        System.out.println("enter rows : ");
        int rows=s.nextInt();
        System.out.println("enter number to be searched : ");
        int x=s.nextInt();

        print(rows,col,x);
    }

    public  static void  print(int r, int c, int x)
    { Scanner s=new Scanner(System.in);
        int ar[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("enter the number at "+i+j+" positon");
                ar[i][j]=s.nextInt();
            }
        }
        System.out.println("enter matrix is :");
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ar[i][j]);
                
            }
            System.out.println();
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(ar[i][j]==x)
                {
                    System.out.println(" the item is found at "+i+j+" location");
                }
                
            }
            
        }

        

    }
}
