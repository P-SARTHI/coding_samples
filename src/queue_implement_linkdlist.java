public class queue_implement_linkdlist {
    public static void main(String arg[]){
       qu_linked<Integer> q=new qu_linked<Integer>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.print();
       q.remove();
       q.print();
       q.peek();

    }
}

class qu_linked<T>{
    Node head=null;
    int size=0;
    Node front=null;
    Node rear=null;
    class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void add(T data){
        if(size==0){
            Node newnode=new Node(data);
            head=newnode;
            front=newnode;
            rear=newnode;
            size++;
            return;
        }
        if(size>=1){
              Node newnode=new Node(data);
              rear.next=newnode;
              rear=newnode;
              size++;
              return;
        }

    }

    public void remove(){
        if(size==0){
            System.out.println("que is empty");
            return;
        }
        if(front==rear){
            System.out.println(front.data);
            front=null;
            rear=null;
            size--;
            return;
        }
        else{
            front=front.next;
            head=head.next;
            size--;
            return;
        }

    }
    public void peek(){
        System.out.println(front.data);
    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data);
            current=current.next;
        }
        System.out.println();
    }

}
