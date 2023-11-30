import java.util.HashMap;

public class alternate_hash_sumof_subarrays {
    public static void main(String args[]){
          int arr[]={ 10, 2, -2, -20, 10};
    int k=-10;
     HashMap<Integer, Integer> map = new HashMap<>();
     int ans=0;
     map.put(arr[0], 0);
     for(int i=1;i<arr.length;i++){//creatingprefix array
        arr[i]=arr[i-1]+arr[i];
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
       
        
     }
     
     for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i]-k)){
            ans=ans+map.get(arr[i]-k);
        }
     }
     if(map.containsKey(k)){
        ans=ans+map.get(k);
     }
     System.out.println(ans);

    }
}
