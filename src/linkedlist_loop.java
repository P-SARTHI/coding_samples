public class linkedlist_loop {
    public static void main(String args[]){
       list1<Integer> l=new list1<Integer>();
       l.add(1);
        l.add(2);
         l.add(3);
          l.add(4);
           l.add(5);
            l.add(6);
           l.addloop_tohead(7);
           System.out.println( l.detect_cycle_remove());
           l.print();

      
          
           
    }
}

class list1<T>{
    Node head=null;
    int size=0;
    
    class Node<T>{
        T data;
        Node next;
        Node(T data){
             this.data=data;
             this.next=null;
             size++;
        }
    }
    public void addloop_tohead(T data){
        Node newnode=new Node(data);
        Node curNode=head.next;
        Node prev=head;
        while(curNode!=null){
            curNode=curNode.next;
            prev=prev.next;
        }
        prev.next=newnode;
        newnode.next=head;
        
    }
    public void add(T data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        
    }
    public void print(){
    Node current=head;

     while(current !=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.print("null");
    System.out.println();
    
}
public void getsize(){
    System.out.println(size);
    if(size==0){
        System.out.println("list is empty");
    }
}
public boolean detect_cycle_remove(){
    if(head==null || head.next==null){
        return false;
    }
    Node slow_pointer=head;
    Node fast_pointer=head;
    while(fast_pointer!=null ){
      
        slow_pointer=slow_pointer.next;
        fast_pointer=fast_pointer.next.next;
          if(slow_pointer==fast_pointer){
            remove_loop(slow_pointer);
            return true;
        }
    }
    return false;
}
public void remove_loop(Node loop){
    Node ptr1=loop;
    Node ptr2=loop;
    Node prevnode=ptr1;
    while(ptr1.next!=ptr2){
       
        ptr1=ptr1.next;
         prevnode=ptr1;

    }
    prevnode.next=null;
}


}
