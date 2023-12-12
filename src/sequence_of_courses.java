import java.util.Stack;

public class sequence_of_courses {
    public static void main(String args[]){
    int prerequisites[][]={{1,0},{0,1}};
    System.out.println(canFinish(0,prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites){
            if(iscyclic(prerequisites)){
                return true;
            }
            return false;
    }
   
    public static boolean iscyclic(int prerequisites[][]){
        boolean visited[][]=new boolean[prerequisites.length][prerequisites[0].length];
         boolean is_instack[][]=new boolean[prerequisites.length][prerequisites[0].length];
         for(int i=0;i<prerequisites.length;i++){
            for(int j=0;j<prerequisites[0].length;j++){
                if(visited[i][j]==false){
                    if(!iscyclic_ut(prerequisites,i,j,visited,is_instack))
                    return false;
                }
            }
         }
         return true;

    }
    public static boolean iscyclic_ut(int prerequisites[][], int start_row,int start_col,boolean visited[][],boolean is_instack[][]){
       
            visited[start_row][start_col]=true;
            is_instack[start_row][start_col]=true;

            if(isvalid(start_row,start_col,prerequisites)&& !visited[start_row][start_col-1]  ){
              if(iscyclic_ut(prerequisites, start_row, start_col-1, visited,is_instack))
              return true;
            }
            else if(visited[start_row][start_col] && is_instack[start_row][start_col]){
                return true;
            }
            is_instack[start_row][start_col]=false;
            return false;
           

         
    }
    public static boolean isvalid(int start_row,int start_col,int prerequisites[][]){
        if((start_row>=0 && start_row<prerequisites.length)&& (start_col-1>=0 && start_col-1<prerequisites[0].length)){
            return true;
        }
        else {
            return false;
        }
    }
}
