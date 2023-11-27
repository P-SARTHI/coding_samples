import java.util.ArrayList;

class experiments{
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static Node bst_creation(Node root,int data){
        if(root==null){
         root=new Node(data);
         return root;
        }
       else if(root.data>data){
         
         root.left=bst_creation(root.left, data);
         return root;
        }
        else{
         
         root.right=bst_creation(root.right, data);
         return root;
        }
 }
 
 public static void search_bst(Node root,int item){
    
    if(root==null){
        return;
    }
    else if(root.data==item){
        System.out.println("item found ");
        
        return;
    }
    
     else if(root.data>item){
        search_bst(root.left, item);
       
    }
   else if(root.data<item) {
        search_bst(root.right, item);
    }
    else{
     System.out.println("not found");
     
   }
    
    

   
}
public static Node delete_bst(Node root, int item){
    if(root==null){
        return root;
    }
   
     
    else if(root.data>item){
       root.left= delete_bst(root.left, item);
       
      }
    else if(root.data<item){
         root.right= delete_bst(root.right, item);
        
      }
    else{//when root.data=item
         if(root.left==null && root.right==null){//when both child are null
            root=null;
            return root;
         }
         
       else  if(root.left==null && root.right!=null ){ //when left child is null and right child exist
             return root.right;
         }
        else if( root.left!=null && root.right==null){//when right child is null and left child exists 
            return root.left;
         }
         else{
         //when both child exists 
           Node Ins=InorderSuccessor(root.right);
           root.data=Ins.data;
           root.right= delete_bst(root.right, Ins.data);
         }
         
      }
      return root;
}
public static Node InorderSuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}
public static void inorder(Node root){
    if(root==null){
        return;
    }
       inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   
}
public static void path_to_leaf(Node root,ArrayList<Integer> path){
   if(root==null){
    return;
   }
   System.out.print(root.data+" ");
  
   path_to_leaf(root.left,path);
   path_to_leaf(root.right,path);
   
    System.out.print(" # ");
   
}
    public static void main(String args[]){
        int nodes[]={8,5,3,1,4,6,10,11,14};
        ArrayList<Integer> path=new ArrayList<>();
        Node root=null;
        for(int i=0;i<nodes.length;i++){
        root=bst_creation(root,nodes[i]);
        }
      path_to_leaf(root,path);
      
    
        
        
        

    }
}