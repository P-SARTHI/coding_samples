import java.util.*;
public class stringbuild {
    public static void main(String args[])
    {
       // Scanner s=new Scanner(System.in);
        //System.out.println("enter the string to reverse : ");
        //String st=s.nextLine();
        //reverse(st);
        //replacestring();
        clip();
        

    }
    public static void reverse(String st)
    {
        StringBuilder sb=new StringBuilder(st);

        for(int i=0;i<sb.length()/2;i++)
        {
            int frontend=i;
            int backend=sb.length()-1-i;
            char front=sb.charAt(i);
            char back=sb.charAt(backend);

            sb.setCharAt(frontend,back);
            sb.setCharAt(backend,front);


        }
        System.out.println(sb);
    }

    public static void replacestring()
    {
        System.out.println("entrr  String  : ");
         Scanner s=new Scanner(System.in);
         String s1=s.nextLine();
         StringBuilder sb= new StringBuilder(s1);
         for(int i=0;i<sb.length();i++)
         {
            if(sb.charAt(i)=='e')
            {
                sb.setCharAt(i,'i');
            }
         }
         System.out.println("new strings is :"+sb );

    }
    public static void clip()
    {
         System.out.println("entrr  String  : ");
         Scanner s=new Scanner(System.in);
         String s1=s.nextLine();
         StringBuilder sb= new StringBuilder(s1);
         String s2="";
         for(int i=0;i<sb.length();i++)
         {
            if(sb.charAt(i)=='@')
            {
               sb.delete(i, sb.length());
               break;
            }
         }
         System.out.println(sb);
    }

}
