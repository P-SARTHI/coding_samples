import java.util.*; 
class bst {
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
    public static void inorder(Node root){
        if(root==null){
            return;
        }
           inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       
    }
    public static boolean search_bst(Node root,int item){
        if(root==null){
            return false;
        }
        else if(root.data==item){
            return true;
        }
        
       else if(root.data>item){
           return search_bst(root.left, item);
           
        }
       else {
           return search_bst(root.right, item);
        }
        
        

       
    }
    public static Node delete_bst(Node root, int item){
        if(root==null){
            return root;
        }
        else if(!search_bst(root, item)){
            System.out.println("item not found");
            return root;
         }
        else if(root.data>item){
           root.left= delete_bst(root.left, item);
           //return root;
          }
        else if(root.data<item){
            root.right= delete_bst(root.right, item);
           // return root;
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
    public static void print_in_range(Node root, int x, int y){
        if(root==null){
            return ;
        }
       else if(root.data<=y && root.data>=x){
             print_in_range(root.left, x, y);
            print_in_range(root.right, x, y);
            System.out.println(root.data);
            
          
        }
       else  if(root.data<x){
           print_in_range(root.right, x, y);
          
             
        }
        else if(root.data>y){
            print_in_range(root.left, x, y);
          
            
        }

    }
    public static void paths_to_leaf(Node root,ArrayList<Integer> paths){
        if(root==null){
          return;
        } 
        paths.add(root.data);
        if(root.left==null && root.right==null){
             for(int i=0;i<paths.size();i++){
            System.out.print(paths.get(i)+"-->");
         }
         System.out.println();
        }
       
         paths_to_leaf(root.left, paths);
         paths_to_leaf(root.right, paths);
        
         paths.remove(paths.size()-1);
         
         
         

    }
    public static int count_nodes(Node root,int count){
          if(root==null){
            return 0;
          }
         int a= count_nodes(root.left,count++);
          int b=count_nodes(root.right, count++);
          return 1+a+b; //1 is added to count root also with left part and right part


    }
    public static void main(String arg[]){
        int nodes[]={8,5,3,6,10,11,14,15};
        ArrayList<Integer> paths=new ArrayList<>();
        Node root=null;
        for(int i=0;i<nodes.length;i++){
        root=bst_creation(root,nodes[i]);
        }
       System.out.println(count_nodes(root, 0));
       
  
    }  


}
