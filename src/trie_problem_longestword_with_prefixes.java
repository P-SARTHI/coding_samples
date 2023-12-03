public class trie_problem_longestword_with_prefixes {
    
    public static void main(String args[]){
        String word[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<word.length;i++){
            insertion(word[i]);
        }
        StringBuilder temp=new StringBuilder();
        
        longest_word_withall_prefixes(root,temp);
        System.out.println(ans);

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
   
     public static String ans="";
    public static void longest_word_withall_prefixes(Node root,StringBuilder temp){
       if(root==null){
        
        return  ;
       }
       for(int i=0;i<root.children.length;i++){
        if(root.children[i]!=null && root.children[i].eow==true){
           temp.append((char)('a'+i));
            if(ans.length()<temp.length()){
                ans=temp.toString();
            }
             longest_word_withall_prefixes(root.children[i],temp);
             temp.deleteCharAt(temp.length()-1);
        }
       }
       
       
       
    }
}
