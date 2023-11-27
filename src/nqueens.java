import java.util.*;
class nqueens {
   public static void main(String args[])
   {
   // System.out.println(solveNQueens(4));
   print(4);
   }


  /*  public  static boolean isSafe(int row, int col, char[][] board) {
       //horizontal
 for(int j=0; j<board.length; j++) {
           if(board[row][j] == 'Q') {
               return false;
           }
       }
      
       //vertical
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == 'Q') {
               return false;
           }
       }
      
       //upper left
       int r = row;
       for(int c=col; c>=0 && r>=0; c--, r--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //upper right
       r = row;
       for(int c=col; c<board.length && r>=0; r--, c++) {
           if(board[r][c] == 'Q') {
               return false;
        }
       }
      
       //lower left
       r = row;
       for(int c=col; c>=0 && r<board.length; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower right
       for(int c=col; c<board.length && r<board.length; c++, r++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       return true;
   }
  
   public static  void saveBoard(char[][] board, List<List<String>> allBoards) {
       String row = "";
       List<String> newBoard = new ArrayList<>();
      
       for(int i=0; i<board.length; i++) {
  row = "";
           for(int j=0; j<board[0].length; j++) {
               if(board[i][j] == 'Q')
                   row += 'Q';
               else
                   row += '.';
           }
           newBoard.add(row);
       }
      
       allBoards.add(newBoard);
   }
  
   public static void helper(char[][] board, List<List<String>> allBoards, int col) {
       if(col == board.length) {
           saveBoard(board, allBoards);
           return;
       }
      
       for(int row=0; row<board.length; row++) {
           if(isSafe(row, col, board)) {
               board[row][col] = 'Q';
               helper(board, allBoards, col+1);
               board[row][col] = '.';
           }
       }
 }
  
   public  static List<List<String>> solveNQueens(int n) {
       List<List<String>> allBoards = new ArrayList<>();
       char[][] board = new char[n][n];
      
       helper(board, allBoards, 0);
       return allBoards;
   } */
//--- from here my own code starts 
   public static  boolean isafe(char[][] board,int row,int col)
   {for(int i=0;i<board[0].length;i++)//horizontal check
    {
        if(board[row][i]=='Q')
        {
            return false;
        }
    }

    for(int i=0;i<board.length;i++)//vertical check
    {
        if(board[i][col]=='Q')
        {
            return false;
        }
    }
    int j=col;
    for(int i=row;i<board.length && j<board[0].length;i++,j++)//--for lower right
    {
        if(board[i][j]=='Q')
        {
            return false;
        }
    }
    j=col;
    for(int i=row;i>=0 && j<board[0].length;i--,j++)//--for upper right
    {
        if(board[i][j]=='Q')
        {
            return false;
        }
    }
    j=col;
    for(int i=row;i<board.length && j>=0;i++,j--)//--lower  left
    {
        if(board[i][j]=='Q')
        {
            return false;
        }
    }
    j=col;
    for(int i=row;i>=0 && j>=0;i--,j--)// upper left
    {
        if(board[i][j]=='Q')
        {
            return false;
        }
    }
     return true;

   }

   public static void saveBoard(List<List<String>> allboards,char [][] board)
   {  String tosave="";
   List<String> temp=new ArrayList<String>();

    for(int i=0;i<board.length;i++)
    {
         tosave="";
        for(int j=0;j<board.length;j++)
        {
            if(board[i][j]=='Q')
            {tosave+="Q";

            }
            else
            tosave+=".";
        }
        temp.add(tosave);
    }
    allboards.add(temp);


   }

   public static void  traverse(int col,List<List<String>> allboards, char [][] board)
   {  if(col==board[0].length)
    {saveBoard(allboards,board);
        
        return  ;

    }

    for(int row=0;row<board.length;row++)
    { if(isafe(board,row,col))
        {
           board[row][col]='Q';
           traverse(col+1, allboards, board);
            board[row][col]='.';
          

            
        }
         
    }

   }
   public static void print(int n)
   {
    List<List<String>> allboards =new ArrayList<>();
    char [][] board =new char[n][n];
    traverse(0, allboards, board);
     System.out.println(allboards);
   }

}
