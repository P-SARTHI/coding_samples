import java.util.*;
public class hash_problem_numberfrequency {
    public static void main (String args[]){
         int nums[]={1,3,2,5,1,3,1,5,1};
         
         get_freq(nums);
        
         
    }
    public static void get_freq(int nums[]){
            HashMap<Integer,Integer> hm=new HashMap<>();
          for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
            hm.put(nums[i],hm.get(nums[i])+1);
            else{
                hm.put(nums[i], 1);
            }
         }
         hm.forEach(
            (k,v)->{
                if(v>nums.length/3){
                    System.out.println("number"+" "+k+" "+"freq"+" "+v);
                }
            }
         );
         
    }
}
