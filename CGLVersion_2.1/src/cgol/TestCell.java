package cgol;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCell {
//	public Cell c;
//	@Before
//	public void obj()
//	{
//		c=new Cell(1,2);
//	}
	

	@Test
	public void testCellStatus() {
		Cell c =new Cell(1,2);
		System.out.println("Testcase -1 Passed");
		Assertions.assertEquals(true, c.getStatus());
	}
	@Test
	public void testCellPos() {
		Cell c1=new Cell(1, 2);

		System.out.println("Testcase -2 Passed");
		Assertions.assertEquals(1, c1.getRow());
		Assertions.assertEquals(2, c1.getCol());
	}


}
