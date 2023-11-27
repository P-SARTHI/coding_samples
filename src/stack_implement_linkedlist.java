
public class stack_implement_linkedlist {
    public static void main(String args[]){
       stack s=new stack();
       s.push(1);
        s.push(2);
         s.push(3);
         s.print();
         s.pop();
         s.size();
       
       
       
       
        
       
      
    }
}
class stack{
    int size=0;
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
        public void push(int data){
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }
        public void print(){
            Node curret=head;
            while(curret!=null){
                System.out.print(curret.data+" ");
                curret=curret.next;
                
            }

        }
        public void size(){
            System.out.println(size);
        }
        public void peek(){
           System.out.println(head.data);
        }
        public void pop(){
            System.out.println("popped "+head.data);
            head=head.next;
            size--;
        }
    }
   

        
           
    




