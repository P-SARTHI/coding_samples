public class linkedlist_implement {
    public static void main(String args[]){
       list<Integer> l1=new list<Integer>();
          l1.addfirst(1);
          l1.addfirst(2);
          
         
         
        
     
      
      

       
      // l1.getsize();
      l1.print();
      //l1.head= l1.reverseRecursion(l1.head);
    
      System.out.println(l1.checkpalindrome());
      
      
      
      
      
      

      
      
      
       
    }


}

class list<T>{
    int size=0;
    Node head=null;
class Node<T>{
    T data;
    Node next;
    Node(T data){
        this.data=data;
        this.next=null;
        size++;

    }
}
public void getsize(){
    System.out.println(size);
    if(size==0){
        System.out.println("list is empty");
    }
}
public void  addfirst(T data){


    Node newnode=new Node(data);
    
    newnode.next=head;
    head=newnode;

}
public void addend(T data){
    if(size==0){
        addfirst(data);
    }
    else{
    Node newnode=new Node(data);
    Node current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newnode;}
}
public void addAt(T data, int position){
     if(size==0){
        addfirst(data);
        return;
    }
    if(position==0){
        addfirst(data);
        return;
    }
     if (position-size==1){
     addend(data);
     return;
    }
    if(position-size>1){
        System.out.println("list has only "+size+" elements");
    }
    if(position<size){
        Node newnode=new Node(data);
        Node current=head;
        for(int i=0;i<position-2;i++){
            current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;
    }
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
public void removefirst(){
    head=head.next;
    size--;
}
public void removelast(){
   Node current=head.next;
   Node prevNode=head;
    while(current.next!=null){
        current=current.next;
        prevNode=prevNode.next;
    }
    prevNode.next=null;
    size--;
}
public void removeat(int position){
    Node current=head;
    Node forward=head.next;
     while(forward.next!=null){
            current=current.next;
            forward=forward.next;
        }
        current.next=forward.next;
        size--;
}
public void get(int position){
   if(size==0){
    System.out.println("list is empty");
    return;
   }
   if(size<position){
    System.out.println("list has only "+size+" elements");
    return;
   }
   if(size>=position){
     Node current=head;
    for(int i=0;i<position-1;i++){
          current=current.next;
    }
    System.out.println(current.data);
   }
}
public void reverseIterate(){
    if(size==0 || size==1){
        return;
    }
    Node current=head.next;
    Node prev=head;
     
    while(current!=null){
       Node Next=current.next;
       current.next=prev;
       prev=current;
       current=Next; 
    }
    head.next=null;
    head=prev;

}
public Node reverseRecursion(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node newhead=reverseRecursion(head.next);
    head.next.next=head;
    head.next=null;
    return newhead;
}

public void remove_nth_from_end(int position){
    if(size==0){
    System.out.println("list id empty");
    return;
    }
    if(size<position ){
        System.out.println("list contains only "+size+" elements");
        return;
    }
    if(size==position){
        removefirst();
    }
    else{

    Node curretNode=head;
    Node forward=head.next;
   

   for(int i=0;i<(size-position)-1;i++){
     forward=forward.next;
      curretNode=curretNode.next;
      

   }
   
   curretNode.next=forward.next;
    }
}

public void reverse_from_to(int left, int right){
   Node rev_start=null; Node rev_Start_prev=null;
   Node rev_end=null; Node rev_end_next=null;
    if(left==right){
    print();
   }
   if(size<right || size<left){
    System.out.println("oversized inputs");
   }
   if(right-left==size-1){
    reverseIterate();
   }
   if(size==0){
    System.out.println("list is empty");
   }
   if(left==1){
   //need to implement this condition
  }
   Node currNode=head;
   int i=1;
   while(currNode!=null && i<=right){
     
    if(i==(left-1)){
        rev_Start_prev=currNode;
        rev_start=currNode.next;
        }
    if(i==right){
        rev_end=currNode;
        rev_end_next=currNode.next;
         }
         i++;
         currNode=currNode.next;
   }
     rev_end.next=null;

     Node current=rev_start.next;
    Node prev=rev_start;
     
    while(current!=null){
       Node Next=current.next;
       current.next=prev;
       prev=current;
       current=Next; 
    }
    rev_start.next=rev_end_next;
    rev_start=prev;
    
    rev_Start_prev.next=rev_end;

}
public boolean checkpalindrome(){
    if(size==0 || size==1){
        return true;
    }
   Node first_harf_head=head;
   Node middle=head;
   for(int i=1;i<=size/2;i++){
      middle=middle.next;
   }
   Node second_half_head=reverseRecursion(middle);
   while(second_half_head!=null){
    if(second_half_head.data!=first_harf_head.data){
        return false;
    }
    second_half_head=second_half_head.next;
    first_harf_head=first_harf_head.next;
   }
   return true;


  
}
public boolean detect_cycle(){
    if(head==null || head.next==null){
        return false;
    }
    Node slow_pointer=head;
    Node fast_pointer=head;
    while(fast_pointer!=null || fast_pointer.next!=null){
      
        slow_pointer=slow_pointer.next;
        fast_pointer=fast_pointer.next.next;
          if(slow_pointer==fast_pointer){
            return true;
        }
    }
    return false;
}

}

