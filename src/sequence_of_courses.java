import java.util.ArrayList;
import java.util.Stack;

public class sequence_of_courses {
    public static void main(String args[]){
      int prerequisites[][]={{1,0},{0,1}};
      System.out.println(canFinish(2, prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites){
        ArrayList<Integer> adj[]=new ArrayList[numCourses];
        boolean visited[]=new boolean[numCourses];
        boolean is_instack[]=new boolean[numCourses];
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        
        }
        for(int i=0;i<prerequisites.length;i++){
           adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }
      for(int i=0;i<adj.length;i++){
        if(visited[i]==false){
            if(iscyclic(adj,i,visited,is_instack)){
                return false;
            }
        }
      } 
      return true;
        
        
        
    }
    public static boolean iscyclic(ArrayList<Integer> adj[],int start,boolean visited[], boolean is_instack[]){
                visited[start]=true;
                is_instack[start]=true;

                for(int i=0;i<adj[start].size();i++){
                    if(visited[adj[start].get(i)]==false){
                        if(iscyclic(adj, adj[start].get(i), visited, is_instack))
                        return true;
                    }
                    if(visited[adj[start].get(i)]==true && is_instack[adj[start].get(i)]==true){
                         return true;
                    }
                }
                is_instack[start]=false;
                return false;
    }
   
   
}
