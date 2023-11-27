import java.util.*;
public class hashmap_implement {
    public static void main(String args[]){
        hm_implement<String ,Integer> hm=new hm_implement<>();
        hm.put("parth",30);
        hm.put("vasu", 25);
      // System.out.println( hm.remove("parth"));
      //System.out.println( hm.constainskey("parth"));
      //System.out.println(hm.isempty());
      ArrayList<String> l=new ArrayList<>();
      l=hm.keyset();
      for(int i=0;i<l.size();i++){
        System.out.println(l.get(i)+" "+hm.get(l.get(i)));
     }
    }
}
@SuppressWarnings("unchecked")
class hm_implement<K,V>{
    class Node{
        K key;
        V value;
        Node(K key, V value){
            this.key=key;
            this.value=value;
        }
    }   
    int N;//number of buckets
    int n;//number of nodes
    LinkedList<Node> buckets[];//array of linked list
    hm_implement(){
        this.N=4;
        this.n=0;
       this.buckets=new LinkedList[4];
       for(int i=0;i<4;i++){
        buckets[i]=new LinkedList<>();
       }

    }
    public int hash_fucntion(K key){
      int a=key.hashCode();

        return Math.abs(a)% N;
    }
    public int search_in_LL(K key , int bucket_index){
       Iterator<Node> it= buckets[bucket_index].iterator();
       int count =0;
       while(it.hasNext()){
        
        if(it.next().key==key){
           return count;
        }
        count++;
       } 
       return -1;
       
    }
    public void rehash(){
      LinkedList<Node> temp_buckets[]=buckets;
      buckets=new LinkedList[N*2];
      for(int i=0;i<N*2;i++){
          buckets[i]=new LinkedList<Node>();
      }
      N=N*2;//so that new hash coud be calculated upto N*2
      for(int i=0;i<temp_buckets.length;i++){
        LinkedList<Node> ll=temp_buckets[i];
        for(int j=0;j<ll.size();j++){
            Node node=ll.get(j);
            put(node.key,node.value);
        }
      }

    }

    public  void put(K key, V value){
        int bucket_index=hash_fucntion(key);
        int data_index=search_in_LL(key, bucket_index);

        if(data_index==-1){// key does not exist
          buckets[bucket_index].add(new Node(key, value));
          n++;
        }
        else{//key exist ,just update
           Node node=buckets[bucket_index].get(data_index);
           node.value=value;
        }
        double lamda=(double)n/N;
        if(lamda>2){
            rehash();
        }

    }
    public V get(K key){
         int bucket_index=hash_fucntion(key);
        int data_index=search_in_LL(key, bucket_index);
        if(constainskey(key)){
             Node d=buckets[bucket_index].get(data_index);
        
            return d.value;
         
        }
        else{
            System.out.println("key does not exist");
            return null;
        }
    }

    public boolean constainskey(K key){
        int bucket_index=hash_fucntion(key);
        int data_index=search_in_LL(key, bucket_index);
        if(data_index==-1){
            return false;
        }
        else{
            return true;
        }

    }
    public V remove(K key){
         int bucket_index=hash_fucntion(key);
        int data_index=search_in_LL(key, bucket_index);
        if(data_index==-1){
            System.out.println("key does not exist");
            return null;
        }
        else{
            Node d=buckets[bucket_index].get(data_index);
            LinkedList<Node> l=buckets[bucket_index];
            l.remove(data_index);
            n--;
            return d.value;
        }
    }

    public boolean isempty(){
       if(n==0){
        return true;
       }
       return false;
    }
    public ArrayList<K> keyset(){
        ArrayList<K> keylist=new ArrayList<>();
        for(int i=0;i<N;i++){
            LinkedList<Node> l=buckets[i];
            for(int j=0;j<l.size();j++){
              keylist.add(l.get(j).key);
            }
        }
        return keylist;
    }
}


