import java.util.ArrayList;

public class graph_cycle_undirected {
    public static void main (String args[]){
           ArrayList<Edge> graph[]=new ArrayList[5];
           boolean visited[]=new boolean[5];
           createGraph(graph);
           System.out.println(iscycle_unconnected(graph, visited));

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
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));
    graph[4].add(new Edge(4, 3));
    }
    public static boolean iscycle_DFS(ArrayList<Edge> graph[],int curr,int parent_throgh_whcih_we_came_to_curr,boolean visited[]){
       visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
             if(visited[e.dest]==false){ //1st case
                if (iscycle_DFS(graph, e.dest, curr, visited)){
                    return true;
                }
             }
             else if(visited[e.dest]==true && e.dest!=parent_throgh_whcih_we_came_to_curr){//2nd case
                 // if a cycle is detected then check cycle for all elements in case a graph can be unconnected or a directed graph
                return true;
             }
             
             else { //3rd case where visited[e.dest]==true && e.dest==parent_throgh_whcih_we_came_to_curr
                continue;
             }
             
            
             
             
        }
        return false;
    }
    public static boolean iscycle_unconnected(ArrayList<Edge> graph[],boolean visited[]){
        for(int i=0;i<graph.length;i++){
            if(!iscycle_DFS(graph, i, -1, visited)){
                return false;
            }
        }
        return true;
    }

}
