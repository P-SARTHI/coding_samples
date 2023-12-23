import java.util.*;


public class graph_removemax_nodes {
    public static void main (String args[]){
          int n=4;
          int edges[][]={{3,2,3},{1,1,2},{2,3,4}};
          maxNumEdgesToRemove(n, edges);
    }
    public static class Edge{
        int type;
        int src;
        int dst;
        Edge(int type,int src,int dst){
            this.type=type;
            this.src=src;
            this.dst=dst;
        }
        
    }
    public static void dfs(ArrayList<Edge> adj[],boolean visited[],int vertex,int for_person){
        visited[vertex]=true;
        
            for(int j=0;j<adj[vertex].size();j++){
                Edge e=adj[vertex].get(j);
                int type=e.type;
                int u=e.src;
                int v=e.dst;
                if(visited[v]==false && (type==3 || type==for_person)){
                    dfs(adj, visited, v, for_person);
                }
            }
        
    }
   
    public static void maxNumEdgesToRemove(int n, int[][] edges){
           //create adjacency list
           ArrayList<Edge> adj[]=new ArrayList[n+1];
           for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
           }
           for(int i=0;i<edges.length;i++){
            
                adj[edges[i][1]].add(new Edge(edges[i][0], edges[i][1], edges[i][2]));
                 adj[edges[i][2]].add(new Edge(edges[i][0], edges[i][2], edges[i][1]));
            
           }
           //if a node is disconnected
           for( int i=1;i<adj.length;i++){
              if(adj[i].isEmpty()){
                System.out.println("-1 for disconnected");
                break;
              }
           }
           //dfs for bob
           boolean visited[]=new boolean[n+1];
           
                dfs(adj,visited,1,2);
            
             for(int i=1;i<visited.length;i++){
                if(visited[i]==false){
                    System.out.println("-1 for bob");
                    break;
                }
             }

             //dfs for Alice 
               visited=new boolean[n+1];
            
                dfs(adj,visited,1,1);
            
             for(int i=1;i<visited.length;i++){
                if(visited[i]==false){
                    System.out.println("-1 Alice ");
                    break;
                }
             }
             

                       
       
    }
}
