public class queue_implement_array {
    public static void main(String args[]){
      qu_array st=new qu_array(3);
      st.add(3);
       st.add(2);
        st.add(1);
        st.add(4);
        st.print();

      

      
    }
}

class qu_array{
    int[] ar;
     int front=-1;
     int rear=-1;
     int size=0;
     int capacity;
    qu_array(int cap){
    this.ar =new int[cap];
     this.capacity=cap;
     }
  
public  void add(int data){
    if(size>=capacity){
        System.out.println("queue is full");
        return;
    }
    if(front==-1){
        ar[size]=data;
      size++;
      front=0;
      rear++;
    }
    else{
      ar[size]=data;
      size++;
      rear++;
    }
    }
    public void peek(){
        if(size==0){
            System.out.println("que is empty");
        }
        else{
        System.out.println(ar[0]);//or instead of size rear can also be used
        }
    }
    public void remove(){
        if(front==-1 && rear==-1){
            System.out.println("que is empty");
        }
        if(size==1){
            System.out.println(ar[front]);
            for(int i=0;i<size;i++){
                ar[i]=ar[i+1];
            }
            
            size--;
            rear--;
            front=-1;

        }
        else{
            System.out.println(ar[front]);
            for(int i=0;i<size;i++){
                ar[i]=ar[i+1];
            }
            
            size--;
            rear--;
            
        }
    }
    public void print(){
        if(front ==-1 && rear==-1){
            System.out.println("que is empty");
        }
        else{
            for( int i=front;i<=rear;i++){
                System.out.print(ar[i]);
            }
            System.out.println();
        }
    }
    public boolean isempty(){
        if(front==-1 && rear==-1 ){
            return true;
        }
        else{
            return false;
        }
    }
}
