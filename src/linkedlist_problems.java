import java.util.*;
public class linkedlist_problems {
    public static void main(String args[]){
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(55);
        l.add(7);
        l.add(3);
        l.add(8);
        l.add(2);
        l.add(34);
     
         
         //l.removeIf(n -> n>25);
         System.out.println(l);
         Collections.reverse(l);
          System.out.println(l);        


    }
}
