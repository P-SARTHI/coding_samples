import java.util.Scanner;

public class spiral {
     public static void main(String args[])
    {
        int row = 2;
        int col = 3;
        
         int ar[][] = { { 1, 2, 3 },
                      { 4,5,6 }};

 
       
        spiral_print(row,col,ar);
    }

    public static void spiral_print(int r,int c, int ar[][])
    {
        int r_start=0;
        int c_start=0;
        int r_end=r-1;
        int c_end=c-1;

        while(r_start<=r_end && c_start<=c_end)
        {
            for(int i=c_start;i<=c_end;i++)
            {
                System.out.print(ar[r_start][i]+" ");
            }
            r_start++;

            for(int i=r_start;i<=r_end;i++)
            {
                System.out.print(ar[i][c_end]+" ");
            }
            c_end--;

            for(int i=c_end;i>=c_start;i--)
            {
                System.out.print(ar[r_end][i]+" ");
            }
            r_end--;

            for(int i=r_end;i>=r_start;i--)
            {
                System.out.print(ar[i][c_start]+" ");
            }
            c_start++;

        }

    }

}
