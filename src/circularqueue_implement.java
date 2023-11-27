public class circularqueue_implement {
    public static void main(String args[]){
        cqu_array cq=new cqu_array(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        
    
        
        cq.remove();
        cq.add(6);
        cq.remove();
        cq.add(7);
        cq.print();
        


        
        
  
        
      }
}

class cqu_array{
    int[] ar;
    int front=-1;
    int rear=-1;
    int capacity;
    
    cqu_array(int cap){
       this.ar =new int[cap];
        this.capacity=cap;
    }
    public void add(int data){
        if(front==-1){//if its first element
          
           
           front=0;
           rear=(rear+1)%capacity;
            ar[rear]=data;
           return;

        }
        if((rear+1)%capacity==front){//if its full
            System.out.println("overflow ");
            return;
        }
        else{
            
           
            rear=(rear+1)%capacity;
             ar[rear]=data;
            return;
        }
    }
    public int remove(){
        if(front==-1 && rear==-1){
            System.out.println("que is empty");
            return -1;
        }
        if(front==rear){
            int t=ar[front];
            front=-1;
            rear=-1;
            return t;
        }
        else{
            int t= ar[front];
            front=(front+1)% capacity;
            return t;
        }
    }
    public void print(){
        while(front!=-1 && rear!=-1){
            System.out.print(remove());
        }
    }

}
