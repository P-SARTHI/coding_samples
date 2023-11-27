import java.util.*;
public class stack_problems {
    public static void main(String args[]){
          Stack<Integer> st=new Stack<Integer>();
          st.push(1);
          st.push(2);
          st.push(3);
          st.push(4);
          reverse(st);
          while(!st.isEmpty()) {
            System.out.println(st.pop());}
    }
    public static void push_at_bottom(Stack st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int a=(Integer)st.pop();
        push_at_bottom(st, data);
        st.push(a);

    }
    public  static void reverse(Stack st){
        if(st.isEmpty()){
            return;
        }
        int a=(Integer)st.pop();
        reverse(st);
        push_at_bottom(st, a);
    }

}
