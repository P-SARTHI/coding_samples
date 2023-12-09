import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class number_of_islands {
    public static void main (String args[]){
        String grid[][] = {{"1","1","1","1","0"},
        {"1","1","0","1","0"},
        {"1","1","0","0","0"},
        {"0","0","0","0","0"}};
            
          
           System.out.println(numIslands(grid));
           
        
    }
    public static int numIslands(String[][] grid){
       
        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=="1"){
                   grid= bfs(i,j,grid);
                    islands++;
                    

                }
            }
        }
        return islands;
    }
    public static String[][] bfs(int row, int columb,String grid[][]){
         class Node{
            int row;
            int columb;
            Node(int row,int columb){
                this.row=row;
                this.columb=columb;
                
            }
        }
            Queue<Node> qu=new LinkedList<>();
            qu.add(new Node(row, columb));
            grid[row][columb]="0";
            int ar_row[]={0,0,0,0};
            int ar_col[]={0,0,0,0};
            while(!qu.isEmpty()){
                Node curr=qu.remove();

                 ArrayList<Node> neighbours=new ArrayList<>();
            neighbours.add(new Node(curr.row, curr.columb-1));
            neighbours.add(new Node(curr.row, curr.columb+1));
            neighbours.add(new Node(curr.row-1, curr.columb));
            neighbours.add(new Node(curr.row+1, curr.columb));
                for(Node neighbour:neighbours){
                    if(isvalid(neighbour.row, neighbour.columb, grid)){
                            qu.add(new Node(neighbour.row,neighbour.columb));
                            grid[neighbour.row][neighbour.columb]="0";
                            
                    }
                }
            }
            return grid;
    }
    public static boolean isvalid(int row, int columb,String grid[][]){
        if((row>=0 && row<grid.length) && (columb>=0 && columb<grid[0].length)){
          if(grid[row][columb]=="1"){
              return true;
          }
          else{
              return false;
          }
        }
        return false;
}
}
