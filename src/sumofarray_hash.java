import java.util.*;
public class sumofarray_hash {
    public static void main(String args[]){
        int arr[]={ 1,1,1,};
    int k=2;
     HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int sum = 0;
      for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
           
            if (map.containsKey(sum-k)){
                res += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
           
        }
 
        System.out.println(res);
    }
}
