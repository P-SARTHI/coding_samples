public class trie_problem_starts_with {
    public static void main(String args[]){
        String words[]={"apple","app","mango","man","woman"};
        for(int i=0;i<words.length;i++){
            insertion(words[i]);
         }
         System.out.println(starts_with_prefix("thor"));
    }

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
    public static void insertion(String word){ // complexity of O(L), where L =lenth of word
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
    public static  boolean search(String word){
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
      public static boolean starts_with_prefix(String prefix){
        Node currentnode=root;
       for(int i=0;i<prefix.length();i++){
           int index=prefix.charAt(i)-'a';
           if(currentnode.children[index]==null){
               return false;
           }
            if(currentnode.children[index]!=null){
               currentnode=currentnode.children[index];
           }
          
           if(i==prefix.length()-1 ){
              
                   return true;
               }
            
   
       }
       return false;
   }
}
