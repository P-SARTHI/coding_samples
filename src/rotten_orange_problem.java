import java.util.*;

public class rotten_orange_problem {
    public static void main(String args[]){
       
    }
    public static void orangeRotting(int grid[][]){
        class Node{
               int row;
               int columb;
               Node(int i,int j){
                this.row=row;
                this.columb=columb;
               }
        }
        int rows=grid.length;
        int colmbs=grid[0].length;
        Node start=new Node(0, 0);
        int vertices=0;
        HashSet<Node> blockade=new HashSet<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colmbs;j++){
                if(grid[i][j]==2){
                  start=new Node(i, j);
                  
                } 
                if(grid[i][j]==0){
                  blockade.add(new Node(i,j));
                }
            }
        }
      boolean visited[][]=new boolean[grid.length][grid[0].length];
      Queue<Node> qu=new LinkedList<>();
      qu.add(new Node(start.row, start.columb));
      visited[start.row][start.columb]=true;
      while(!qu.isEmpty()){

      }
    }
    public static boolean inbounds(int row,int columb,int grid[][]){
          if((row>=0 && row<=grid.length-1) && (columb>=0 && columb<=grid[0].length-1)){
            return true;
          }
          else{
            return false;
          }
    }
    
}

