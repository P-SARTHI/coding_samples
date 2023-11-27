import java.util.*;
public class tree_sumat_level {
    public static void main (String arg[]){
        int  nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        treestructrure t=new treestructrure();
       Node root =t.tree_creation(nodes);
        t.sumat_level(root,3);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class treestructrure{
    int index=-1;
    public Node tree_creation(int nodes[]){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newnode =new Node(nodes[index]);
        newnode.left=tree_creation(nodes);
        newnode.right=tree_creation(nodes);
        return newnode;
    }

    public void sumat_level(Node root, int level){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        int k=1;
        int sum=0;
        while(!q.isEmpty()){
             Node current=q.remove();
             if(q.isEmpty()){
                break;
             }
             if(current==null){
                k++;
                q.add(null);
             }
             else{
                if(k==level){
                    sum=sum+current.data;
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
             }

        }
        System.out.println(sum);
    }
} 
