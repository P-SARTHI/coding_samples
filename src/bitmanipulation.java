import java.util.*;
public class bitmanipulation {
    public static void main(String args[])
    {
       binarytodecimal();


    }

    public static void tobinary_inbuilt()
    {
         int a= 5;
        String b=Integer.toBinaryString(a);
        int c=Integer.parseInt(b);
         System.out.println(c);

        System.out.println(c);
    }
    public static void get()//to get required bit(position=required-1) of n,here counting strats from right
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        System.out.println("enter the bit number to get  : ");
        int position =s.nextInt()-1; 
        int bitmask= 1<<position;
        int result= n & bitmask;
        int out=0;
        if(result>0)
        {out=1;
            System.out.println((position+1)+"rd bit  is "+out);

        }
        else
        {
            System.out.println((position+1)+"rd bit  is "+out);
        }


    }
    public static void set()// to set required(postion=required) bit as 1 in given n number 
    {
         Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        System.out.println("enter the bit number to set  : ");
        int position =s.nextInt()-1; 

        int bitmask=1<<position;
        n=bitmask | n;

        System.out.println("changed number after setting bit at "+(position+1)+" place is "+Integer.toBinaryString(n));

    

    }

    public static void clear()//  to set required(postion=required) bit as 0 in given n number 
    {  Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        System.out.println("enter the bit number to clear  : ");
        int position =s.nextInt()-1;

        int bitmask=1<<position;
        int bitmask_complement=~(bitmask);
        n=n & bitmask_complement;
        System.out.println("changed number after clearing bit at "+(position+1)+" place is "+Integer.toBinaryString(n));


    }

    public static void update()//to flip the bits-- 1 to 0 and 0 to 1
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        System.out.println("enter the bit number to update  : ");
        int position =s.nextInt()-1;
        System.out.println("enter the operator: ");
        int op=s.nextInt();

        int bitmask=1<<position;

        if(op==1)
        { n=bitmask | n;

        System.out.println("changed number after updating bit at "+(position+1)+" place is "+Integer.toBinaryString(n));

        }
        else
        {   int bitmask_complement=~(bitmask);
        n=n & bitmask_complement;
        System.out.println("changed number after updating bit at "+(position+1)+" place is "+Integer.toBinaryString(n));
            
        }


    }
    public static int isprime(int n)
    {
       for(int i=2;i<=n/2;i++)
       {
        if(n%i==0)
        {
            return 0;
            
        }
       }
        return 1;

    }

    public static void  two_ki_power()
     {
       /*    System.out.println("ebter the numer : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int counter =0;
        
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if(isprime(i)==1)
                {
                    if(i!=2)
                    {
                        
                        counter=1;

                        break;
                    }
                }
               
            }
        }
        if(counter==1)
        {
            System.out.println("number is not power of 2");
        }
        else
        {
            System.out.println("number is  power of 2");
        }
        
       for(int i=0;i<=n/2;i++)// simple method 
        {
            if(Math.pow(2, i)==n){System.out.println("number is power of 2 ");break;}
            
        }
         System.out.println("number is not power of 2");
        int con=0;//continuos division by 2 method
       while(n>=2)
       {
        if(n%2!=0){con=1;break;}
        n=n/2;
        }
       if(con==1){System.out.println("not a prime");}
       else{System.out.println(" a power");}    */
       Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));

        String numString=Integer.toBinaryString(n);
        int counter=0;
        int c=n & 1<<numString.length();
       for(int i=0;i<numString.length();i++)
       {
        int bitmask=1<<i;
        int result=bitmask & n;
        if(result==0 && (c)>0){counter=1; break;}
       }
       if(counter==1){System.out.println("number is power of 2");}
       else{System.out.println("number is not power of 2");}




       



    }
    public static void toggle()
    {  Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        System.out.println("enter the bit number to toggle  : ");
        int position =s.nextInt()-1; 

        int bitmask=1<<position;

        int result=bitmask & n;
        if(result>0)
        {int bitmaskt_comple=~(bitmask);
            n=n & bitmaskt_comple;
             System.out.println("changed number after updating bit at "+(position+1)+" place is "+Integer.toBinaryString(n));
        }
        else
        {
            n=n | bitmask;
             System.out.println("changed number after updating bit at "+(position+1)+" place is "+Integer.toBinaryString(n));
        }

    }

    public static void count1s_0s()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form= "+Integer.toBinaryString(n));
        String numbeString=Integer.toBinaryString(n);
        int counter1=0;
        int counter0=0;
        for(int i=0;i<numbeString.length();i++)
        {
            int bitmask=1<<i;
            int result=n &  bitmask;
            if(result>0){counter1++;}
            else{counter0++;}
        }
        System.out.println("number of 1s= "+counter1);
        System.out.println("numbre of 0s= "+counter0);


         


    }
    public static void decimaltobinary()
    {
          Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        System.out.println("binary form(inbuilt)= "+Integer.toBinaryString(n));
        String result="";
        

        if(n==0 || n==1){System.out.println("binary form is "+n);}
        
        

        else
        {while(n>=2)
            {
             result=result+n%2;
             n=n/2;
             
            }
        

             result=result+"1";
             StringBuilder b=new StringBuilder(result);
             System.out.println("binary form is "+b.reverse());
             
        }
  
        
    }

    public static void binarytodecimal()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n= s.nextInt();
        String n1=Integer.toString(n);
        System.out.println("decimal form(inbuilt)= "+Integer.parseUnsignedInt(n1));
        double result=0;int j=0;

        for(int i=n1.length()-1;i>=0;i--)
        {
            if(n1.charAt(i)=='1')
           {result=result+Math.pow(2, j);}
            j++;


        }
        System.out.println(result);
    }

    
}
