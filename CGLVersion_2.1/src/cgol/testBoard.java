package cgol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testBoard {

	@Test
	public void testCreateBoard() {
		Board b=new Board();
		int w=4;
		int h=4;
		int l[][]= {{0, 0}, {1, 1}};
		Cell[][] grid = new Cell[h][w];
		for(int r=0; r<h; r++)
		{
			for(int c=0; c<w; c++)
			{
				grid[r][c]=new Cell(r, c);
			}

		}
		grid[0][0].setStatus(true);
		grid[1][1].setStatus(true);
        Cell[][] grid1= b.createBoard(w, h, l);
        System.out.println("======== CreateBoard Passed ========");
        for(int i=0; i<grid.length; i++)
        {
        	for(int j=0; j<grid.length; j++)
        	{
        		
        		Assertions.assertEquals(grid[i][j].getStatus(), grid1[i][j].getStatus() );
        		
        	}
        }     

	}
	@Test
	public void testPrint()
	{ 
		String s="**..\n..**\n....\n....\n";
		
		Board b=new Board();
		int h=4;
		int w=4;
		int l[][]= {{0, 0}, {0, 1}, {1, 2}, {1, 3}};
		Cell[][] grid1= b.createBoard(w, h, l);
		String s1=b.printBoard(grid1);
        System.out.println("======== Print Passed ========");
        Assertions.assertEquals(s, s1);        	
		 
	}
	

	
	
	@Test
	public void testCount()
	{
		Board b=new Board();
		int h=4;
		int w=4;
		int l[][]= {{0, 0}, {0, 1}, {1, 2}, {1, 3}};
		Cell[][] grid1= b.createBoard(w, h, l);
		int count =3;
		int cnt= b.checkAlive(grid1, 1,1);
        System.out.println("======== CheckAlive Passed ========");
        Assertions.assertEquals(count, cnt);
		
	}
	
	
	@Test
	public void testGenerateNextGen() {
		Board b=new Board();
		int h=4;
		int w=4;
		int c[][]= {{0, 0}, {0, 1}, {1, 2}, {1, 3}};
		int l[][]= {{0, 1}, {0, 2}, {1, 1}, {1, 2}};
		Cell[][] next = new Cell[h][w];
		for(int row=0; row<h; row++)
		{
			for(int col=0; col<w; col++)
			{
				next[row][col]=new Cell(row, col);
			}

		}
		next[0][1].setStatus(true);
		next[0][2].setStatus(true);
		next[1][1].setStatus(true);
		next[1][2].setStatus(true);     
		
		Cell[][] Curgrid= b.createBoard(w, h, c);
		Cell[][] newgrid= b.generateNextGeneration(Curgrid);
        
        System.out.println("======== GenerateNextGen Passed ========");
        for(int i=0; i<next.length; i++)
        {
        	for(int j=0; j<next[0].length; j++)
        	{
        		
        		Assertions.assertEquals(next[i][j].getStatus(), newgrid[i][j].getStatus() );
        		
        	}
        }     

	}
	
	@Test
	public void testGenerateNextGen1() {
		Board b=new Board();
		int h=4;
		int w=4;
		int c[][]= {{0, 2}, {0, 1}, {0, 3}, {1, 2}, {1, 3}, {1, 1}};
		int l[][]= {{0, 1}, {0, 3}, {1, 1}, {1, 3}, {2, 2}};
		Cell[][] next = new Cell[h][w];
		for(int row=0; row<h; row++)
		{
			for(int col=0; col<w; col++)
			{
				next[row][col]=new Cell(row, col);
			}

		}
		next[0][1].setStatus(true);
		next[0][3].setStatus(true);
		next[1][1].setStatus(true);
		next[1][3].setStatus(true);
		next[2][2].setStatus(true);
		
		Cell[][] Curgrid= b.createBoard(w, h, c);
		Cell[][] newgrid= b.generateNextGeneration(Curgrid);
        
        System.out.println("======== GenerateNextGen Passed ========");
        for(int i=0; i<next.length; i++)
        {
        	for(int j=0; j<next[0].length; j++)
        	{
        		
        		Assertions.assertEquals(next[i][j].getStatus(), newgrid[i][j].getStatus() );
        		
        	}
        }     

	}

}
