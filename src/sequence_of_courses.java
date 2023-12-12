import java.util.Stack;

public class sequence_of_courses {
    public static void main(String args[]){
    int prerequisites[][]={{1,0},{0,1}};
    boolean visited[][]=new boolean[prerequisites.length][prerequisites[0].length];
    boolean is_instack[][]=new boolean[prerequisites.length][prerequisites[0].length];
    
    System.out.println(iscyclic(prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites){
        
        boolean visted[][]=new boolean[prerequisites.length][prerequisites[0].length];
          //  if(iscyclic(prerequisites)){
          //      return false;
          //  }
            for(int i=0;i<prerequisites.length;i++){
                for(int j=0;j<prerequisites[0].length;j++){
                    Stack<Integer> st=new Stack<>();
                    dfs(prerequisites, i, j, visted,st);
                    if(st.size()==numCourses){
                        return true;
                    }
                }
            }
            return  false;
            
    }
   
    public static boolean iscyclic(int prerequisites[][]){
        boolean visited[][]=new boolean[prerequisites.length][prerequisites[0].length];
        
         for(int i=0;i<prerequisites.length;i++){
            for(int j=0;j<prerequisites[0].length;j++){
                if(visited[i][j]==false){
                     boolean is_instack[][]=new boolean[prerequisites.length][prerequisites[0].length];
                    if(iscyclic_ut(prerequisites,i,j,visited,is_instack))
                    return true;
                }
            }
         }
         return false;

    }
    public static boolean iscyclic_ut(int prerequisites[][], int start_row,int start_col,boolean visited[][],boolean is_instack[][]){
       
            visited[start_row][start_col]=true;
            is_instack[start_row][start_col]=true;

            if(isvalid(start_row,start_col-1,prerequisites)&& !visited[start_row][start_col-1]  ){
              if(iscyclic_ut(prerequisites, start_row, start_col-1, visited,is_instack))
              return true;
            }
             else if(isvalid(start_row,start_col-1,prerequisites)){
               if((visited[start_row][start_col-1]) && (is_instack[start_row][start_col-1])){
                return true;}
            }
            is_instack[start_row][start_col]=false;
            return false;
           

         
    }
    public static boolean isvalid(int start_row,int start_col,int prerequisites[][]){
        if((start_row>=0 && start_row<prerequisites.length)&& (start_col>=0 && start_col<prerequisites[0].length)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void  dfs(int prerequisites[][],int start_row,int start_col,boolean visited[][],Stack<Integer> st){
               visited[start_row][start_col]=true;

                if(isvalid(start_row,start_col-1,prerequisites)&& !visited[start_row][start_col-1]){
                    dfs(prerequisites, start_row, start_col-1, visited, st);
                }
                st.push(prerequisites[start_row][start_col]);
    }
}
