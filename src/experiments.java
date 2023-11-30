
import java.util.HashMap;

class experiments{
   public static void main(String args[]){
    int arr[]={ 10, 2, -2, -20, 10};
    int k=-100;
     HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int sum = 0;
      for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
           
            if (map.containsKey(sum-k))
                res += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
 
        System.out.println(res);
   }
}