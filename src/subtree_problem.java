public class subtree_problem {
    public static void main(String args[]){
        int  nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int nodes1[]={2,4,-1,-1,5,-1,-1};
      tree_structure t1=new tree_structure();
      tree_structure t2=new tree_structure();
      Node root=t1.tree_creation(nodes);
      Node subroot=t2.tree_creation(nodes1);
      System.out.println(issubtree(root,subroot));
      

      
    }
    public static boolean issubtree(Node root, Node subroot){
      if(subroot==null){
        return true;
      }
      if(root==null){
        return false;
      }
     if(isequal(root, subroot)){
       return true;
     }
     return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }

    public static  boolean isequal(Node root, Node subroot){
          if(root==null && subroot==null){
            return true;
          }
          if(root==null || subroot==null){
            return false;
          }
          if(root.data==subroot.data){
            return isequal(root.left, subroot.left) && isequal(root.right, subroot.right);
          }
          return false;



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

class tree_structure{
      int  index=-1;
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

}
