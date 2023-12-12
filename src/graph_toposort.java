import java.util.ArrayList;
import java.util.Stack;

public class graph_toposort {// time complexity O(V+E), most of tha algo same as of DFS butwith some modifications called KAhns algo
    public static void main (String args[]){
        int v=6;
    ArrayList<Edge> graph[]=new ArrayList[v];
    boolean visited[]=new boolean[v];
    Stack<Integer> st=new Stack<>();
    createGraph(graph);
    for(int i=0;i<graph.length;i++){
      if(!visited[i]){
        topological(graph, i, visited, st);
      
       } 
    }
     while(!st.isEmpty()){
           System.out.print(st.pop());
        }
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        }
    public static void topological(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> st){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                topological(graph, e.dest, visited, st);
            }
        }
        st.push(curr); //pushing the current node before pushing its children
    }
}
