import java.util.*;
public class itenary {
    public static void main(String args[]){
      HashMap<String ,String> map=new HashMap<>();
      map.put("chennai", "bengaluru");
      map.put("mumbai", "delhi");
      map.put("goa", "chennai");
      map.put("delhi", "goa");
      path(map);
    }
    public static void path(HashMap<String,String> map){
      
        String start="";
       
        for( String it:map.keySet()){//calculating start=city which exixt only in keys but not in value
            if(!map.containsValue(it)){
                start=it;
            }
        }
       for(Map.Entry<String,String> it:map.entrySet()){
        System.out.print(" "+start+"-->");
                 
                 start=map.get(start);
       }
       System.out.println(start);
       
            
       
          
         
         
          
    }
}
