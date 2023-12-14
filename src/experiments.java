
import java.util.*;

class experiments{
   public static void main(String args[]){
    HashSet<Integer> p=new HashSet<>();
    p.add(1);
    p.add(2);
     HashSet<Integer> q=new HashSet<>();
     
     System.out.println(p.containsAll(q));
   }
}