package cgol;

import java.util.Scanner;

// ConwayGameOfLife class is to operate on Board and cells, to make it concrete to PLAY the Game.
//
public class ConwayGameOfLife {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);       
//
//
//        // Reading size of the Board
//        int n = sc.nextInt();
//        
//        // Reading no. of initial live cells
//        int m = sc.nextInt();
//        int[][] l = new int[m][2];
//        int i = 0;
//                
//        // Reading Live cells
//        for(int lc=0; lc<m; lc++)
//        {
//            l[i][0] = sc.nextInt();
//            l[i++][1] = sc.nextInt();
//        }
//        
//        // creating instance to CGLVersion2
//        Board b = new Board();
//        Cell[][] current=b.createBoard(n, l);
//        int nth=sc.nextInt();
//        ConwayGameOfLife cgol=new ConwayGameOfLife();
//        Cell[][] newGen = cgol.nthGen(current,nth);
//        System.out.println(b.printBoard(newGen));      
//        
//
//
//	}
	
    public Cell[][] nthGen(Cell[][] c, int nth)
    {
//    	to generate the given nth generation from the current generation.
//    	1st - Current
//    	2nd - (Current + 1)th Gen and so on....
    	Board b = new Board();   	

    	Cell[][] current=c;
    	for(int N=0; N<nth-1; N++)
    	{
    		current=b.generateNextGeneration(current);
    		
    	}
    	
    	return current;
    	
    }

}
