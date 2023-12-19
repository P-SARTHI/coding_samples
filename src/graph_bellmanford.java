import java.util.*;

public class graph_bellmanford {
    public static void main (String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellman(graph, 0, V);
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellman(ArrayList<Edge> graph[],int src,int V){
            int dist[]=new int[V];
            for(int i=0;i<dist.length;i++){
                if(i!=src){
                    dist[i]=Integer.MAX_VALUE;
                }
            }

            for(int i=0;i<V-1;i++){ //outer loop V times complexity of O(V)
                 for(int j=0;j<graph.length;j++){//both of these inner loops have combined complexity of O(E)
                    for(int k=0;k<graph[j].size();k++){
                        Edge e=graph[j].get(k);
                        int u=e.src;
                        int v=e.dest;

                        if(dist[u]!= Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){//perform relaxation 
                            dist[v]=dist[u]+e.wt;
                        }
                    }
                 }
            }
            //checking for negative weight cycles--copy the same code and if values change it means it exist
             for(int i=0;i<V-1;i++){ //outer loop V times complexity of O(V)
                 for(int j=0;j<graph.length;j++){//both of these inner loops have combined complexity of O(E)
                    for(int k=0;k<graph[j].size();k++){
                        Edge e=graph[j].get(k);
                        int u=e.src;
                        int v=e.dest;

                        if(dist[u]!= Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){//perform relaxation 
                            //dist[v]=dist[u]+e.wt;
                            System.out.println("negative weight cycle");
                            break;
                        }
                    }
                 }
            }

            for(int i=0;i<dist.length;i++){
                System.out.println(dist[i]+" ");
            }
    }
}
