public class trie_problems {
    public static void main(String args[]){
        String words[]={"i","like","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insertion(words[i]);
         }
         System.out.println(word_break_problem("ilikesamsung"));
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
    
    public static boolean word_break_problem(String word){//given a input string and dictionary(trie) find if string can be broken into space separted sub-sequnces of dictionary words
        if(word.length()==0){
            return true;
        }  
        
        for(int i=1;i<=word.length();i++){
                String part1=word.substring(0, i);
                String part2=word.substring(i);
                if(search(part1)==true && word_break_problem(part2)==true){
                    return true;
                }

        }
        return false;
    }  
}
