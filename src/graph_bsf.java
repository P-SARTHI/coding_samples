import java.util.*;
public class graph_bsf {
    public static void main(String args[]){
        graph_creation1 g=new graph_creation1(9);
        
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

        g.mapping(7, 8, 0);
       g.mapping(8, 7, 0);
  
  
       g.BSF_order(g.graph,0);

        for(int i=0;i<g.graph.length;i++){ //for disconnectred graphs
              if(g.vis[i]==false){
                g.BSF_order(g.graph, i);
              }
         }
    
       
      
        
       
        
      }
  }
  
class graph_creation1{
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
    graph_creation1(int vertices){
        graph=new ArrayList[vertices];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        this.vertices=vertices;
    }
    
    public static  void mapping(int src,int dest,int weight){
        graph[src].add(new edge(src, dest,weight));
         
    }
     
    public static void BSF_order(ArrayList<edge> graph[], int vertex){// timecpmelxity =O(V+E)
      
        boolean visted[]=new boolean[vertices];
        Queue<Integer> qu=new LinkedList<>();
        qu.add(graph[vertex].get(0).src);
        while(!qu.isEmpty()){
                 int curr=qu.peek();
                if(visted[curr]==false){
                    
                    System.out.print(curr);
                    visted[curr]=true;
                   
                    for(int i=0;i<graph[curr].size();i++){
                        edge e=graph[curr].get(i);
                      qu.add(e.dest);
                    }
                  
                }
                else{
                    qu.remove();
                }
        }   
        vis=visted;

               
        
    
        
            
        
    }
}
