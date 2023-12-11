import java.util.ArrayList;

public class graph_cycle_directed { //time comelpexity =O(V+E)
    public static void main (String args[]){
        ArrayList<Edge> graph[]=new ArrayList[6];
           boolean visited[]=new boolean[6];
           boolean is_instack[]=new boolean[6];
           createGraph(graph);
          System.out.println(iscycle_allnodes(graph, visited, is_instack));

    }
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
        }
        static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 1));
      //  graph[3].add(new Edge(3, 0));
        
        }
    public static boolean iscycle_DFS(ArrayList<Edge> graph[],int curr, boolean visited[],boolean is_instack[]){
        visited[curr]=true;
       is_instack[curr]=true;
        
       for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
            if( iscycle_DFS(graph, e.dest, visited, is_instack)){
                return true;
            }
            }
            else if(visited[e.dest]==true && is_instack[e.dest]==true){
               
                return true;
            }
            
            else if (visited[e.dest]==true && is_instack[e.dest]==false){
                continue;
            }

       }
       
       is_instack[curr]=false;
      return false;
       

    }
    public static boolean iscycle_allnodes(ArrayList<Edge> graph[], boolean visited[],boolean is_instack[]){
        for(int i=0;i<graph.length;i++){
           if( iscycle_DFS(graph, i, visited, is_instack)){
                return true;
           }
        }
        return false;     
    }

}
