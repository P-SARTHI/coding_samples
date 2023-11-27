import java.util.Scanner;
public class gcd {
    public static void main(String[] args)
    {
        System.out.print("enter first number : ");
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        System.out.println();
        System.out.print("enter second number : ");
        int b=s.nextInt();
        System.out.println();
        System.out.println("GCD of given numbers is : "+greatestCommonDivisor(a,b));

    }
    public  static int greatestCommonDivisor(int a1, int b1)
    { 
        
        int ans=0;
        for(int i=Math.min(a1, b1);i>=1;i--)
        {
            if(a1%i==0 && b1%i==0)
            {ans= i;
                break;
            
            }

            
            
        }
        return ans;

    }
}
