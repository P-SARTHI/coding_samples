public class recurwithinloop {
    public static void main(String ars[])
    {
        pp(2);
    }
     
    public static void pp(int s)
    { 
        if(s==0)
        { 
            return;
            
        }
        
          for(int i=0;i<2;i++)
             {  
             System.out.println(s+" ");
                     pp(s-1);
              }
              
  }
}
