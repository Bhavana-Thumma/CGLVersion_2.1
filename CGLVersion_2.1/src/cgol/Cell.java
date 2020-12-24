package cgol;

/*
 * Cell class is created specifically to keep the properties of a cell, that are position of a cell
 * including row and column and Status of cell(Alive or Dead). 
 */

public class Cell {
	public boolean cellStatus=false; //Dead initially for all the cells.
	public int row;
	public int col;
	public Cell(int row, int col)
	{
		this.row=row;
		this.col=col;
		
	}
	public boolean getStatus()
	{
		return cellStatus;
	}
	public int getRow()
	{
		return this.row;
	}
	public int getCol()
	{
		return this.col;
	}
	public void setStatus(boolean b) {
		this.cellStatus=b;

		
	}

}
