public class stack_implement_array {
    public static void main(String args[]){
      st_array s=new st_array();
      s.push(1);
      s.push(2);
      s.push(3);
      s.pop();
      System.out.println("-------");
      s.print();
    }
}

class st_array{
    int[] ar=new int[10];
    int size=0;
    

    public void push(int data){
     ar[size]=data;
     size++;
    }
    public void peek(){
      if(size==0){
        System.out.println("stack is empty");
      }
      else{
      System.out.println(ar[size-1]);
      }
    
    }
    public void pop(){
      int t=ar[size-1];
      ar[size-1]=000;
      System.out.println(t);
      size--;
    }
    public void print(){
      int i=size;
      while(i!=0){
        System.out.println(ar[i-1]);
        i--;
      }
    }



}
