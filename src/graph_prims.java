import java.util.ArrayList;
import java.util.PriorityQueue;

public class graph_prims {
    public static void main (String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph, V);
    }
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 10));
            graph[0].add(new Edge(0, 2, 15));
            graph[0].add(new Edge(0, 3, 30));
            graph[1].add(new Edge(1, 0, 10));
            graph[1].add(new Edge(1, 3, 40));
            graph[2].add(new Edge(2, 0, 15));
            graph[2].add(new Edge(2, 3, 50));
            graph[3].add(new Edge(3, 1, 40));
            graph[3].add(new Edge(3, 2, 50));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int wt;
        Pair(int v, int wt){
            this.node=v;
            this.wt=wt;
        }
        @Override
        public int compareTo(Pair p2){
            return this.wt-p2.wt;
        }
    }   
    public static void prims(ArrayList<Edge> graph[],int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();//non mst set
        boolean visited[]=new boolean[V];//mst set
       int mstcost=0;
       
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if(visited[curr.node]==false){
               visited[curr.node]=true;
               mstcost+=curr.wt;
               for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                if(visited[e.dest]==false){
                    pq.add(new Pair(e.dest, e.wt));
                }
               }
            }
        }
        System.out.println( mstcost);
    }    
}
