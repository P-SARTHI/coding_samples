import java.util.*;

public class hash_set {// hashsets dont have any index place
    public static void main(String args[]){
         HashSet<Integer> hs=new HashSet<>();//they store values in jumbled fashion
         hs.add(1);//insertion
         hs.add(2);
         hs.add(3);
         hs.add(3);
         Iterator it= hs.iterator();//iteration
         while(it.hasNext()){
            System.out.println(it.next());
         }
         hs.remove(2);//removal
         System.out.println(hs);
         if(hs.contains(2)){//search
            System.out.println("it has 2");
         }



    }

    
}
