public class sudoku {
    public static void main(String arg[])
    {
        char [][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
      
      sovlesudoku(board,0,0);
      
      
      
        for(int row=0;row<board.length;row++)
       {
        for(int col=0;col<board[0].length;col++)
        {
            System.out.print(board[row][col]+" ");

        }
        System.out.println();
       }
        
    }
    public static boolean sovlesudoku(char [][] board,int row , int col)
    {
        if(row == board.length) {
            return true;
        }
       
        int nrow = 0;
        int ncol = 0;
       
        if(col == board.length-1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
       
        if(board[row][col] != '.') {//if there is a number at given 
            if(sovlesudoku(board, nrow, ncol)) {
                return true;
            }
        } else {
           
            //fill the place
            for(int i=1; i<=9; i++) {
                if(isafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');
                    if(sovlesudoku(board, nrow, ncol))
                        return  true;
                    else
                         board[row][col] = '.';
                }
            }
        }
                      
        return false;
 

    }

    public static boolean isafe(char [][] board, int row, int col, int number)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==(char)(number+'0'))
            {
                return false;
            }
          if(board[i][col]==(char)(number+'0'))
            {
                return false;
            }
        }
        int grid_row_start=(row/3)*3;
        int grid_col_start=(col/3)*3;

        for(int i=grid_row_start;i<grid_row_start+3;i++)
        {
            for(int j=grid_col_start;j<grid_col_start+3;j++)
            {
                if(board[i][j]==(char)(number+'0'))
                {
                    return false;
                }
            }
        }
        return true;

        

    }

    
}
