public class Trie_implement {
    public static void main(String args[]){
        String word[]={"the","a","there","their","any"};
        retreival_tree tr=new retreival_tree();
    }
}
class retreival_tree{
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
    static Node root=new Node();
}
