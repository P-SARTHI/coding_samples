
import java.util.*;
public class binary_tree {

   public static void main(String args[]){
              
  int  nodes[] = {1, 2, 4, -1, -1, 5, -1, -1,3, -1, 6, -1, -1 };
    tree t=new tree();
    Node r=t.tree_creation(nodes);
 //System.out.println(t.height(r));
    
    System.out.println(r.data);
   }
}


   class tree{
     static int  index=-1;
       Node tree_creation(int nodes[]){
      
      index++;
      if(nodes[index]==-1){
        return null;
      }
      Node newnode=new Node(nodes[index]);
      newnode.left=tree_creation(nodes);
      newnode.right=tree_creation(nodes);
      
      return newnode;

    }
    public void preorder_traversal(Node root){
        if(root==null){
            System.out.print(" -1 ");
            return;
        }
        System.out.print(" "+root.data+" ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);

    }
    public void postorder_traversal(Node root){
        if(root==null){
            System.out.print(" -1 ");
            return;
        }
        
        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(" "+root.data+" ");

    }

     public void inorder_traversal(Node root){
        if(root==null){
           // System.out.print(" -1 ");
            return;
        }
        
        inorder_traversal(root.left);
         System.out.print(" "+root.data+" ");
        inorder_traversal(root.right);
       

    }

    public void levelorder(Node root){
         Queue<Node> q=new LinkedList<Node>();
     q.add(root);
     q.add(null);
     if(root==null){
        return;
     }
     while(!q.isEmpty()){
        Node current=q.remove();
        if(current==null){
            if(q.isEmpty()){
                break;
            }
            System.out.println();
            q.add(null);

        }
        else{
            System.out.print(current.data);
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
     }
    
     

  }

  public int countnodes(Node root){
    if(root==null){
       return 0;
    }
    int l=countnodes(root.left);
    int r=countnodes(root.right);
    return l+r+1;
  }
  public int sumof_nodes(Node root){
    if(root==null){
        return 0;
    }
    
   int left= sumof_nodes(root.left);
    
    int right=sumof_nodes(root.right);

     
    return left+right+root.data;
  }

  public int height(Node root){
    if(root==null){
        return 0;
    }
    int left= height(root.left);
    int right=height(root.right);
    return Math.max(left, right)+1;
  }

  public int diametre(Node root){  //aka width of tree
    if(root==null){
    return 0;
    }
   int left_dia=diametre(root.left);
   int right_dia=diametre(root.right);
   int height=height(root.left)+height(root.right)+1;
   return Math.max(Math.max(right_dia, left_dia), height);

}


public treeinfo diamtre2(Node root){
   if(root==null){
    return new  treeinfo(0,0);
   }

    treeinfo left=diamtre2(root.left);
    treeinfo right=diamtre2(root.right);

    int total_height=left.height+right.height +1;

    int d1=left.diamtre;
    int d2=right.diamtre;
    int d3=left.height+right.height+1;

    int total_dia= Math.max(Math.max(d1, d2), d3);
    treeinfo myinfo=new treeinfo(total_height, total_dia);
    return myinfo;
}

 
}
 

class treeinfo{
    int height;
    int diamtre;
    treeinfo(int height, int diamtre){
        this.height=height;
        this.diamtre=diamtre;
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


     


