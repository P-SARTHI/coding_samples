


class Arraylist{
    int  capacity;
public int size;
public String data[];
Arraylist(){
    capacity=3;
    size=0;
    data=new String[capacity];
}
Arraylist(int user_given_capacity){
    capacity=user_given_capacity;
    size=0;
    data=new String[capacity];
}

public int getsize(){//number of elements
    return size;//number of elements
}
public void add(String element){
   if(size<=2){
    data[size]=element;
    size++;
   }
   else{

    String temp[]=new String[(size+1)];
    for(int i=0;i<size;i++){
        temp[i]=data[i];
    }
    data=temp;
    data[size]=element;
    size++;
    
   
     

   }
  
}
 public void remove(){
    data[size-1]=null;
   
    size--;

   }
   public void remove(int index){
     for(int i=index;i<data.length-1;i++){
        data[i]=data[i+1];
     }
     data[data.length-1]=null;
     size--;
   }
   public void add(int index, String element){
    
          String temp[]=new String[(size+2)];
         
     for(int i=0;i<=index-1;i++){
        temp[i]=data[i];
    }
    for(int i=index;i<size;i++){
        temp[i+1]=data[i];
    }
    
    temp[index]=element;
    data=temp;
    size++;

    
    

   }
public String get(int index){
    return data[index];
}


}

public class Arrayist_implement {
    public static void main(String arg[]){
       Arraylist Ar1=new Arraylist();
         Ar1.add("parth");
         Ar1.add("sarthi");
        
         
          Ar1.add(1, "***");
          Ar1.remove(1);
          System.out.println(Ar1.getsize());
        

          for(int i=0;i<Ar1.size;i++){
            System.out.println(Ar1.data[i]);
          }

     
       
      
      
    
      
    }
}
