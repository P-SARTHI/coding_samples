import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph_dsf {
    public static void main (String args[]){
         graph_creation2 g=new graph_creation2(7);
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
         boolean visited[]=new boolean[g.vertices];

        // g.print_dsf(g.graph, 0, visited);
         for(int i=0;i<g.graph.length;i++)//if disconnected graph is present
         {
            if(visited[i]==false){
                g.print_dsf(g.graph, i, visited);
            }
         }
 

    }
}

class graph_creation2{
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
    graph_creation2(int vertices){
        graph=new ArrayList[vertices];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        this.vertices=vertices;
    }
    
    public static  void mapping(int src,int dest,int weight){
        graph[src].add(new edge(src, dest,weight));
         
    }
    public static void print_dsf(ArrayList<edge> graph[],int vertex,boolean visited[]){ // complexity=O(V+E)
         if(visited[vertex]==true){
            return;
         }
       System.out.println(graph[vertex].get(0).src);
       visited[vertex]=true;
       for(int i=0;i<graph[vertex].size();i++){
        edge e=graph[vertex].get(i);
        print_dsf(graph, e.dest, visited);
       }
    }
     
   
}

