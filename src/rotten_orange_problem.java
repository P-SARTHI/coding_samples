import java.util.*;

public class rotten_orange_problem {
     
    public static void main(String args[]){
       
      int  grid[][]={{0,1,2},{0,1,1},{2,1,1}};
      
     System.out.println(orangesRotting(grid));
    }
    public static int  orangesRotting(int grid[][]){
         class Node{
            int row;
            int columb;
            int time;
            Node(int row,int columb,int time){
                this.row=row;
                this.columb=columb;
                this.time=time;
            }
        }
        int m=grid.length;
        int n=grid[0].length;
       Queue<Node> qu=new LinkedList<>(); 
       int rotten=0;
       int fresh=0;
       int elapsed_time=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                  qu.add(new Node(i, j, 0));

                  rotten++;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(rotten==0 && fresh>=1){
            return -1;
        }
        if(rotten==0 && fresh==0){
            return 0;
        }
        while(!qu.isEmpty()){
            Node curr=qu.remove();
            
            ArrayList<Node> neighbours=new ArrayList<>();
            neighbours.add(new Node(curr.row, curr.columb-1, curr.time+1));
            neighbours.add(new Node(curr.row, curr.columb+1, curr.time+1));
            neighbours.add(new Node(curr.row-1, curr.columb, curr.time+1));
            neighbours.add(new Node(curr.row+1, curr.columb, curr.time+1));

            for(Node neighbour:neighbours){
                if(isvalid(neighbour.row, neighbour.columb, grid)){
                         qu.add(new Node(neighbour.row,neighbour.columb,neighbour.time));
                         grid[neighbour.row][neighbour.columb]=2;
                         elapsed_time=neighbour.time;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                    
                }
            }
        }
        return elapsed_time;
        

    } 
    public static boolean isvalid(int row, int columb,int grid[][]){
              if((row>=0 && row<grid.length) && (columb>=0 && columb<grid[0].length)){
                if(grid[row][columb]==1){
                    return true;
                }
                else{
                    return false;
                }
              }
              return false;
    }
}
