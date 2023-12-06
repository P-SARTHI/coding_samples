import java.util.ArrayList;

public class graph_all_paths_to_node {
    public static void main (String args[]){
     graph_creation3  g=new graph_creation3(7);
     g.mapping(0, 1,2);
     g.mapping(0, 2,2);

     
     g.mapping(1, 0,0);
     g.mapping(1, 3,0);

     g.mapping(2, 0,2);
     g.mapping(2, 4,0);
     
     

     g.mapping(3, 1,0);
     g.mapping(3, 4,0);
     g.mapping(3, 5,-1);

     g.mapping(4, 2,2);
     g.mapping(4, 3, 0);
     g.mapping(4, 5,2);

     g.mapping(5, 3,2);
     g.mapping(5, 4,2);
     g.mapping(5, 6,2);

     g.mapping(6, 5,2);
     boolean visited[]=new boolean[g.graph.length];
     g.print_allpaths_by_dfs(g.graph, 0, 5, "0", visited);
    }
}
class graph_creation3{
    static class edge{
        int src;
        int dest;
        int weight;
        edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    static ArrayList<edge> graph[];
    static int vertices;
    static boolean vis[]=new boolean[vertices]; //to be used for disconnected graphs
    graph_creation3(int vertices){
        graph=new ArrayList[vertices];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        this.vertices=vertices;
    }
    
    public static  void mapping(int src,int dest,int weight){
        graph[src].add(new edge(src, dest,weight));
         
    }
    public static void print_allpaths_by_dfs(ArrayList<edge> graph[],int curr,int target,String path,boolean visited[]){
         if(curr==target){//time complexity =O(V^V)
            System.out.println(path);
           
            return;
         }
         
         
         
         for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
           if(visited[e.dest]==false){
            visited[curr]=true;
            print_allpaths_by_dfs(graph, e.dest, target, path+e.dest, visited);
            visited[curr]=false;
         }
        }

    }
    
     
   
}
