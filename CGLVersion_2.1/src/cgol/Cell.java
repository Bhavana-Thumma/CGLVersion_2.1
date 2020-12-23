package cgol;

public class Cell {
	public boolean cellStatus=false;
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
