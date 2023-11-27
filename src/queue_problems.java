import java.util.*;
public class queue_problems {
    public static void main(String arg[]){
      sq q=new sq();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      //q.remove();
      q.print();
      

    }
   }

    class sq{
    Stack<Integer> st=new Stack<Integer>();
    Stack<Integer> st1=new Stack<Integer>();
    int size=0;

    public  void push_at_bottom(Stack st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int a =(Integer)st.pop();
        push_at_bottom(st, data);
        st.push(a);

    }
    public  void reverse(Stack st){
        if(st.isEmpty()){
            return;
        }
        int a=(Integer)st.pop();
        reverse(st);
        push_at_bottom(st, a);
    }

    public  void add(int data){
       if(size==0){
        st.push(data);
        size++;
        return;
       }
       if(size>=1){
        while(!st.isEmpty()){
        st1.push(st.pop());
        }
        st.push(data);
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        size++;
        return;
       }
      
        
        

    }

    public  void remove(){
        st.pop();
    }
    public void print(){
        while(!st.isEmpty()){
           System.out.print( st.pop());
        }
        System.out.println();
    }
   }



