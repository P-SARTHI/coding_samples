import java.util.*;

class graph_dijkasta{
    public static void main(String args[]){
          int V = 6;
    ArrayList<edge> graph[] = new ArrayList[V];
    createGraph(graph);
    shortestpath(graph, 0, V);
    }
    static class edge{
            int src;
            int dest;
            int wt;
            public edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
            }
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int node, int dist){
            this.node=node;
            this.dist=dist;
        }
        @Override
        public int compareTo(Pair p2){
             return this.dist-p2.dist;//ascending
             //for descending p2.dist-this-dist
        }
    }
    static void createGraph(ArrayList<edge> graph[]) {
            for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
            }
            graph[0].add(new edge(0, 1, 2));
            graph[0].add(new edge(0, 2, 4));
            graph[1].add(new edge(1, 3, 7));
            graph[1].add(new edge(1, 2, 1));
            graph[2].add(new edge(2, 4, 3));
            graph[3].add(new edge(3, 5, 1));
            graph[4].add(new edge(4, 3, 2));
            graph[4].add(new edge(4, 5, 5));
    }
    public static void shortestpath(ArrayList<edge> graph[],int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        boolean visited[]=new boolean[V];
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            
            if(visited[curr.node]==false){
                  visited[curr.node]=true;

                  for(int i=0;i<graph[curr.node].size();i++){
                    edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                    }
                    pq.add(new Pair(v, dist[v]));
                  }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
    }
}
