package cgol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testConwayGameOfLife {

	@Test
	public void testNthGen() {
		String s="....\n.*..\n..**\n....\n";
		
		Board b=new Board();
		ConwayGameOfLife cgol=new ConwayGameOfLife();
		int n=4;
		int l[][]= {{0, 0}, {3, 3}, {2, 2}, {1, 2}};
		Cell[][] current= b.createBoard(n, l);
		Cell[][] nextGen= cgol.nthGen(current, 2);
		String s1=b.printBoard(nextGen);
		System.out.println("======== Nth Generation Passed ============");
		Assertions.assertEquals(s, s1);
		
		
	}

}
