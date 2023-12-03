public class trie_problem_unique_substrings {/*substrings can be gained by 2 ways
    1.all prefixes of all suffiexes of a string 
    2. all suffixes of all prefixes of a string. 
    To use trie we would use (1)way and find all unique prefixes to find unique substrings.
    by deafault we know trie stores unique prefixes thus we only need to count its nodes.
    algo--
    -find all suffixes
    -store them into trie
    -count number of nodes in trie*/ 
    public static void main(String args[]){
      
         System.out.println(unique_substrings("apple"));
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
    public static int unique_substrings(String word){
      
        String suffix="";//to store suffixes
        for(int i=0;i<word.length();i++){
            suffix=word.substring(i);
            insertion(suffix);//inserting suffixes into trie
        }
        return count_nodes(root);//calcualting number of nodesin trie
       

    }
   
    public static int count_nodes(Node root){
        if(root==null){
            return 0;
        }
       int count=0;
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
           count+= count_nodes(root.children[i]);
            }
        }
        return count+1;

    }
    
}
