import java.util.*;
public class cheapestflight_withkstops {
    public static void main(String args[]){
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};

     System.out.println(findCheapestPrice(4,flights, 0, 3, 1));
     
    }
     
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        int dist[]=new int[n];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        
        //now do shortest path by bellman ford
        for(int i=0;i<k+1;i++){
            int[] temp = Arrays.copyOf(dist, n);
           for(int j=0;j<flights.length;j++){
            int u=flights[j][0];
            int v=flights[j][1];
            int wt=flights[j][2];
            if(dist[u]!= Integer.MAX_VALUE && dist[u]+wt<temp[v]){
                temp[v]=dist[u]+wt;
            }
           }
           dist=temp;
         }
         if(dist[dst]!=Integer.MAX_VALUE)
         return dist[dst];
         else return -1;
         
      
    }
   
    
}
