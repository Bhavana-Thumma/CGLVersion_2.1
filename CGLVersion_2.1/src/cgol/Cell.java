package cgol;

public class Cell {
	private boolean cellStatus=true;
	private int row;
	private int col;
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

}
