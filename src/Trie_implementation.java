public class Trie_implementation{
    public static void main(String args[]){
        String words[]={"i","like","samsung","mobile","ice"};
         retreival_tree tr=new retreival_tree();
     for(int i=0;i<words.length;i++){
        tr.insertion(words[i]);
     }
     
     

    }
    
}
class retreival_tree{
    static Node root=new Node();
    static class Node{
        Node children[];
        boolean eow;
        Node(){
            children=new Node[26];
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
 
  public  void insertion(String word){ // complexity of O(L), where L =lenth of word
     Node currentnode=root;
    for(int i=0;i<word.length();i++){
        int index=word.charAt(i)-'a';
        if(currentnode.children[index]==null){
           currentnode.children[index]=new Node();
            currentnode=currentnode.children[index];
        }
        if(currentnode.children[index]!=null){
            currentnode=currentnode.children[index];
        }
        if(i==word.length()-1){
              currentnode.eow=true;
        }
        
    }
  }
  public  boolean search(String word){
    Node currentnode=root;
    for(int i=0;i<word.length();i++){
        int index=word.charAt(i)-'a';
        if(currentnode.children[index]==null){
            return false;
        }
         if(currentnode.children[index]!=null){
            currentnode=currentnode.children[index];
        }
       
        if(i==word.length()-1 && currentnode.eow==true){
           
                return true;
            }
         

    }
    return false;
  }

}



