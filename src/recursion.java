import java.util.*;;
public class recursion {
    public static void main(String args[])
    {
        //printnums(1);
       // printsum(1, 5, 0);
      // int x= printfact( 5);
       //printfibonormal(2);
       /*int n=7;
        if(n==1) System.out.print("0 ");
       if(n==2) System.out.println("1 ");
       if(n>2) 
       { System.out.print("0 1 ");
         printfiborecur( 0,1,n-2);
        }*/
       
       //int x=printpow(2, 5);
      // int x=printpowlogn(2,5);
         //  System.out.println(x);
        // towerOfHanoi(4 , "Source", "Helper", "destination",0);
        String s="abc";
        //int s1[]={1,2,3,4,5};
       // stringoccurence(s,0,'t');
       // stringreverse(s,s.length()-1);
      //boolean out= strictlyincreasing(s1, 0);
      //System.out.println(out);
      //moveToEnd(s,0 );
     //removedupicate_without_recursion(s);
    //removedupicate_with_recustion(s, 0, "");
     //substrings(s, 0, "");
     //HashSet<String> set=new HashSet<>(); //--for unique substrings
     //uniquesubstrings(s, 0, "", set);
     //System.out.println(Collections.max(set));//-- for longest unique substring
     
     //keycombo("23", 0, "");
     //printpermutation(s,  "");
     //System.out.println(totalpaths(0, 0, 3, 3));
     //System.out.println(tiliingproblem(4, 2));
     //System.out.println(inviting_in_pairs_orsingles(4));
     ArrayList<Integer> subset=new ArrayList<>();
     find_subsets(4, subset);


     
     
     
     
     


       
      

      

    }
    public  static void printnums(int n)
    {
        if(n==6)
        {return;}

        System.out.println(n);
        printnums(n+1);
        
    }

    public static void printsum(int i,int n, int sum)
    {
        if(i==n)
        {
            sum+=n;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        printsum(i+1,n, sum);
    }

    public static int printfact(int n)
    {
        if(n==1)
        {
        
        return 1;
        }
        
         return n*printfact(n-1);
    }
     public static void printfibo(int n)
     {
        int n1=0;
        int n2=1;
        int n3=0;
        if(n==1)
        System.out.println("0");
        else if(n==2)
        System.out.println("0 1");
        else
        {System.out.print("0 1 ");
            for(int i=2;i<n;i++)
            {n3=n1+n2;
                 System.out.print(n3+" ");
               
                n1=n2;
                 n2=n3;
               

            }
        }
     }

     public static void printfiborecur(int a,int b,int n)
     {  
        if (n==0)
        {return;}
        
       
        int c=a+b;
        System.out.print(c+ " ");
        printfiborecur(b, c, n-1);
       
       
     }

     public static int  printpow(int x,int n)
     { if(n==0)
        {
            return 1;
        }
        else if(x==0)
        {return 0;

        }
    
       else
       { 
        
        
        return x*printpow(x, n-1);
       }
        



     }

     public static int printpowlogn(int x, int n)
     {
        if(n==0){return 1;}
        else if(x==0){return 0;}

        else 
        {
            if(n%2==0)
            {
                return printpowlogn(x, n/2)* printpowlogn(x, n/2);
            }
            else
            {
                return printpowlogn(x, n/2)*printpowlogn(x, n/2)*x;
            }
        }

        
    
     }
     public static void towerOfHanoi(int n,String src, String helper,String dest,int count)
     {
        if(n==1)
        {
            System.out.println("transferring disk "+n+" from " +src+ " to "+ dest);
            System.out.println(count);
            return;
        }
        else
        {
            towerOfHanoi(n-1, src, dest, helper,count+1);

            System.out.println("transferring disk "+n+" from "+src+" to "+dest);

            towerOfHanoi(n-1, helper, src, dest,count+1);
        }
     }
       public static int  f1=-1;//--for use in below function
       public static int f2=-1;//--for use in below fucntion 

     public static void stringoccurence(String s,int n,char x)
     {
       
        if(n==s.length())
        {if(f1==-1)
            {
                System.out.println("char not in array");
                
            }
            else if(f2==-1)
            {
                System.out.println("char ont occured once");
            }
            System.out.println("last aoocurcne at "+f2);
            return;
        }
        else
        {
            if(s.charAt(n)==x)
            {
               if(f1==-1)
               {
                f1=n+1;
                System.out.println("first occurence at "+f1);
               }
               else
               {
                f2=n+1;
               }
                
            }

            stringoccurence(s, n+1,x);
           
            
           
        }
     }
      public static void stringreverse(String s,int n)
     {
        if(n==-1)
        {
            return;
        }
        else
        {
           System.out.print(s.charAt(n));

            stringreverse(s, n-1);
        }
     }

     
     public static boolean strictlyincreasing(int s1[],int n)
     {
        if(n==s1.length-1)
        { return true;

        }

        if(s1[n+1]<=s1[n])
        {
            return false;
        }
        return strictlyincreasing(s1, n+1);
     }
     
     public static String newString1="";//--for below function
     public static String newsString2="";//--for below fucntion
     public static void moveToEnd(String s, int n )
     { 
        if(n==s.length())
        { System.out.println(newString1+newsString2);
            return;
        }
        if(s.charAt(n)=='x')
        {
            newString1+="x";
        }
        else
        {newsString2=newsString2+s.charAt(n);

        }
        moveToEnd(s, n+1);

     }

     public static void removedupicate_without_recursion(String s)
     { char arr[]=s.toCharArray(); 
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=' ';
                }
            }
            
        }
        s=" ";
        for(int i=0;i<arr.length;i++)
        {if(arr[i]!=' ')
            s+=arr[i];}
        System.out.println(s.trim());

     }
     public static boolean map[]=new boolean[26];
     public static void removedupicate_with_recustion(String s,int n, String newString)
     {

        if(n==s.length())
        {System.out.println(newString);
            return;
        }
        if(map[s.charAt(n)-'a']==false)
        {
            newString+=s.charAt(n);
            map[s.charAt(n)-'a']=true;
        }
       
        removedupicate_with_recustion(s, n+1, newString);


     }

     public static void substrings(String s,int n, String newString)
     {
        if(n==s.length())
        {
            System.out.println(newString);
             return;

        }
        
        substrings(s, n+1, newString+s.charAt(n));
        substrings(s, n+1, newString);
        


      }

      public static void uniquesubstrings(String s, int n, String newString, HashSet<String> set )
      {
        if(n==s.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else
            { System.out.println(newString);
                set.add(newString);
            return;

            }
           
        }
        uniquesubstrings(s, n+1, newString+s.charAt(n), set);
        uniquesubstrings(s, n+1, newString, set);

      }
      public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};
     
      public static void keycombo(String checkit,int n, String combo)
      { if(n==checkit.length())
        {
            System.out.println(combo);
            return;
        }
        
        String mapping =keypad[checkit.charAt(n)-'0'];
        for(int i=0; i<mapping.length();i++)
        {
            keycombo(checkit, n+1, combo+mapping.charAt(i));
        }

      }

      public static void printpermutation(String s,String result)
      { if(s.length()==0)
        {
            System.out.println(result);
            return;
        }
        for(int i=0;i<s.length();i++)
        {char current=s.charAt(i);
            String sub=s.substring(0, i)+s.substring(i+1);
            printpermutation(sub, result+current);
        }
       

      }

      public static int  totalpaths(int i, int j, int n, int m)
      {
        if(i==n && j==m)
        {
            return 0;
            
        }
        if(i==n-1 || j==m-1)
        {
            return 1;
        }
         int d=totalpaths(i+1, j, n, m);
         int r=totalpaths(i, j+1, n, m);
        return d+r;

      }

      public static int tiliingproblem(int n, int m)//--ways to place 1xm size of tile into a bigger tile of nxm size
      {if(n==m)//when a nxn size reamins there are only 2 ways to place tiles, either vertically or horizontally
        {
            return 2;
        }
        if(n<m)// if this happends then only 1 way reamins ; placing tiles horizontly
        {
            return 1;
        }
        int vertical =tiliingproblem(n-m, m);
        int hroizontal=tiliingproblem(n-1, m);
        return vertical+hroizontal;
      }

      public static int inviting_in_pairs_orsingles(int n)//-- ways to invite n people singly or in pairs
      {
        if(n<=1)//this condition is important
        {
            return 1;
        }
        int singly=inviting_in_pairs_orsingles(n-1);
        int pairs=(n-1)*inviting_in_pairs_orsingles(n-2);
        return singly+pairs;

      }
      public static void find_subsets(int n, ArrayList<Integer> subset)
      {
         if(n==0)
         {
            for(int i=0;i<subset.size();i++)
            {
                System.out.print(subset.get(i)+" ");
            }
            System.out.println();
            return;
         }

        subset.add(n);
        find_subsets(n-1, subset);

        subset.remove(subset.size()-1);
        find_subsets(n-1, subset);
      }
}
