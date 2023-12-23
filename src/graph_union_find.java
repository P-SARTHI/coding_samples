import java.util.*;
public class graph_union_find {
     static List<Integer> rank=new ArrayList<>();
        static List<Integer> parent=new ArrayList<>();
   public static void main (String args[]){
     int edges[][]={{0,1},{1,2},{1,3},{4,5},{0,2}};
     int nodes=6;
     union(edges, nodes);
     if(findparent(0, parent)==findparent(4, parent)){
        System.out.println("connected");
     }
     else {
        System.out.println("disconnected");
     }
   }
   public static void union(int edges[][],int n){
       
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
           
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int ul_parent_u=findparent(u,parent);
            int ul_parent_v=findparent(v,parent);
            if(ul_parent_u==ul_parent_v){//condition for if a redundant edges is added
                System.out.println("reduntdant edge added");
            }
            if(rank.get(ul_parent_u)<rank.get(ul_parent_v)){
                   parent.set(ul_parent_u,ul_parent_v);
                   
            }
            if(rank.get(ul_parent_u)>rank.get(ul_parent_v)){
                parent.set(ul_parent_v,ul_parent_u);
                   
            }
            if(rank.get(ul_parent_u)==rank.get(ul_parent_v)){
                 parent.set(ul_parent_u,ul_parent_v);
                 rank.set(ul_parent_u,rank.get(ul_parent_u)+1);
            }

        }
   }
   public static int findparent(int vertex,List<Integer> parent){
             if(vertex==parent.get(vertex)){
                return vertex;
             }
              return findparent(parent.get(vertex), parent);

   }
}
