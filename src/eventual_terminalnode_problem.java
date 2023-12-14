import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class eventual_terminalnode_problem {
     List<Integer> ans=new ArrayList<>();
    public static void main (String args[]){
           int graph[][]={{},{0,2,3,4},{3},{4},{}};
                System.out.println(eventualSafeNodes(graph)) ;
    }
    public static List<Integer> eventualSafeNodes(int[][] graph){
        List<Integer> ans=new ArrayList<>();
        ArrayList<Integer> adj[]=new ArrayList[graph.length];
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj[i].add(graph[i][j]);
            }
        }
        HashSet<Integer> terminal_nodes=new HashSet<>();
       // for(int i=0;i<adj.length;i++){
         //   if(adj[i].isEmpty()){
           //     terminal_nodes.add(i);
            //}
        //}
        
        for(int x: dfs_allnodes(adj,terminal_nodes)){
            ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
    public static HashSet<Integer> dfs_allnodes(ArrayList<Integer> adj[],HashSet<Integer> terminal_nodes){
        boolean visited[]=new boolean[adj.length];
            
        for(int i=0;i<adj.length;i++){
         if(visited[i]==false){
            dfs(adj,visited,terminal_nodes,i);
         }
        }
        return terminal_nodes;
    }
   
    public static void dfs(ArrayList<Integer> adj[],boolean visited[],HashSet<Integer> terminal_nodes,int node){
        visited[node]=true;
        HashSet<Integer> neighbours=new HashSet<>();
        for(int i=0;i<adj[node].size();i++){
            neighbours.add(adj[node].get(i));
          //  if(adj[node].size()==1 && terminal_nodes.contains(adj[node].get(i))){
            //    terminal_nodes.add(node);
          //  } 
             if(visited[adj[node].get(i)]==false ){
                dfs(adj, visited, terminal_nodes,adj[node].get(i) );
            }
           
        }
          if(terminal_nodes.containsAll(neighbours)){
                terminal_nodes.add(node);
            }
        
    }
}
