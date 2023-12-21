import java.util.ArrayList;
import java.util.Stack;

public class graph_kosaraju {
    public static void main(String args[]){
                int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0, 2));
            graph[0].add(new Edge(0, 3));
            graph[1].add(new Edge(1, 0));
            graph[2].add(new Edge(2, 1));
            graph[3].add(new Edge(3, 4));
    }
    public static void topsort(ArrayList<Edge> graph[],int vertex,Stack<Integer> s,boolean visited[]){
         
         
            visited[vertex]=true;
            for(int i=0;i<graph[vertex].size();i++){
                Edge e=graph[vertex].get(i);
                if(visited[e.dest]==false){
                  topsort(graph, e.dest, s, visited);
                }
            }
            s.push(vertex);
          
    }
    public static void dfs(ArrayList<Edge> graph[],int vertex, boolean visited[]){
              visited[vertex]=true;
              System.out.print(vertex+" ");
              for(int i=0;i<graph[vertex].size();i++){
                Edge e= graph[vertex].get(i);
                if(visited[e.dest]==false){
                    dfs(graph, e.dest, visited);
                }
              }
    }
    public static void kosaraju(ArrayList<Edge> graph[],int V){
        Stack<Integer> s=new Stack<>();//1 step to create topsort stack 
         boolean visited[]=new boolean[V];
         for(int i=0;i<V;i++){
            if(visited[i]==false){
                topsort(graph,i,s,visited);
            }
         }
         // step 2 to traspose the grapgh
           ArrayList<Edge> transpose[] = new ArrayList[V];
            for(int i=0; i<V; i++) {
             transpose[i] = new ArrayList<Edge>();
            }
            for(int i=0;i<V;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                   transpose[e.dest].add(new Edge(e.dest, e.src));
                }
            }
        //to DFS for stack elements on tranpose graph
             boolean vis[]=new boolean[transpose.length];        
               while(!s.isEmpty()){
                    int curr=s.pop();
                    if(vis[curr]==false){
                    dfs(transpose, curr, vis);
                    System.out.println();
                    }
               }
    }
}
