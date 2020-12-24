package cgol;

// Board class is to maintain all the cells in a grid like structure.
// Board  - Composite of Cells. 

public class Board 
{

	public Cell[][] grid;

	public Cell[][] createBoard(int n, int[][] l) 
	{
		grid=new Cell[n][n];
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				grid[r][c]=new Cell(r, c); //initially setting up all the cells with false values.
				
			}

		}
        for(int i=0;i<l.length;i++)
        {
         int row=l[i][0];
         int col=l[i][1];
         grid[row][col].setStatus(true); //Setting up the alive cells at the mentioned positions.
//         System.out.println(row+" "+col+" "+grid[row][col].getStatus());
         
        }
	    // You can call the printBoard that prints the board.


//	    printBoard(grid);
		return grid;
	}

	public Cell[][] generateNextGeneration(Cell[][] current) 
	{
		int n = current.length;
        Cell[][] nextgen = new Cell[n][n];
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				nextgen[r][c]=new Cell(r, c); // setting up a new board with all the dead cells to generate the next generation.
				
			}

		}
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int alives= checkAlive(current,i,j);
            	//here we are checking the alive cells and updating alive positions of the cells.
                if(current[i][j].getStatus())
                {

                    if(alives>3)
                    { 
                        nextgen[i][j].setStatus(false);
                    }
                    else if(alives==3 || alives==2)
                    {
                    	nextgen[i][j].setStatus(true);
                    }
                    else if(alives<2)
                    {
//                    	System.out.println(i+" "+j+" "+nextgen[i][j].getStatus());
                    	nextgen[i][j].setStatus(false);
                    }
                    
                }
                else
                {
                    if(alives==3)
                    {
                    	nextgen[i][j].setStatus(true);
                    }
                }
                
                
            }
        }
//        printBoard(nextgen);
        return nextgen;

		
	}

	public String printBoard(Cell[][] gen) {
		String s=""; // Updating a string with what has to be printed. In order to check this kept the return type String.
        for(int i=0;i<gen.length;i++)
        {
            for(int j=0;j<gen[i].length;j++)
            {
                if(gen[i][j].getStatus())
                    	s=s+"*";
                else
                    s=s+".";
                
            }
            s=s+"\n";
        }
		return s;
		
	}

	public int checkAlive(Cell[][] current, int row_pos,int col_pos) {
		
//		checking the alive neighbor cells.
		int alive=0;
        int n = current.length;
        for(int i=row_pos-1;i<=row_pos+1;i++)
        {
            for(int j=col_pos-1;j<=col_pos+1;j++)
            {
                // System.out.println(i+" "+j);
                if(i!=row_pos || j!=col_pos)
                {
                    // System.out.println(i+" "+j);
                    if(i>=0 && i<n && j>=0 && j<n && current[i][j].getStatus())
                    {
                        // System.out.println(i+" "+j);
                        alive+=1;
                    }
                }
            }
        }
        // System.out.println(alive);
        return alive;


	}
}



