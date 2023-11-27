import java.util.*;
public class hash_map {
    public static void main(String args[]){
       HashMap<Integer, String> hm=new HashMap<>();//first data type will be key which shall be unique,they store value in jumbled fashion
       hm.put(30, "Parth");
       hm.put(31, "VAsu");
       hm.put(33, "PUmmy");
       hm.put(30, "pappu");//if a key exists before it will update its value 
      // System.out.println(hm.containsValue("pappu"));
       //System.out.println(hm.containsKey(30));
       System.out.println(hm.get(36));
       for(Map.Entry<Integer,String> it: hm.entrySet()){//sysntax for iteration
        System.out.println(it.getKey());
       }

       Set<Integer> k= hm.keySet();//a diff way of iterating
       for(int i : k){
        System.out.println(i+" "+ hm.get(i));
       }

       hm.remove(33);//it can remove based on key or based on both key and value
       System.out.println(hm);
    }
}
