import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;;
public class strings {
    public static void main(String arg[])
    {
       Scanner s =new Scanner(System.in);
       System.out.println("enter the emailaddress : ");
       String input=s.next();
       reverse(input);
    }

    public static void reverse(String input)
    { 
        for(int i=input.length()-1;i>=0;i--)
        {
           System.out.print(input.charAt(i));
          
        }
       
         
    }

}
