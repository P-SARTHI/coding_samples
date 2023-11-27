

import java.util.*;
public class hollowbutterfly  {
    public static void main(String[] args) 
    { int n=5;

      for(int i=1;i<=n;i++)
      {
         if(i==1)
         {
            System.out.print("*");
         }
         else
         {
            System.out.print("*");
            for(int l=1;l<=i-2;l++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++)
         {
            System.out.print(" ");

         }
         if(i==1)
         {
            System.out.print("*");
         }
         else
         {
              System.out.print("*");
            for(int l=1;l<=i-2;l++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
         }
         System.out.println();

      }
      
       for(int i=n;i>=1;i--)
      {
         if(i==1)
         {
            System.out.print("*");
         }
         else
         {
            System.out.print("*");
            for(int l=1;l<=i-2;l++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++)
         {
            System.out.print(" ");

         }
         if(i==1)
         {
            System.out.print("*");
         }
         else
         {
              System.out.print("*");
            for(int l=1;l<=i-2;l++)
            {
               System.out.print(" ");
            }
            System.out.print("*");
         }
         System.out.println();

      }
   }
}
     
      
   

     

    
     
      
   