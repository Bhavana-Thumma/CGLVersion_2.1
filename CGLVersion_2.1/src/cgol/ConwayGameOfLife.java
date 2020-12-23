package cgol;

import java.util.Scanner;

public class ConwayGameOfLife {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
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
//
//        
//        // creating nextgenratin by calling nextgenration method
//        Cell[][] c=b.createBoard(n, l);
//        
//        Cell[][] bod=b.generateNextGeneration(c);
//        Cell[][] bod1=b.generateNextGeneration(bod);
//        Cell[][] bod2=b.generateNextGeneration(bod1);
//        int al=b.checkAlive(c, 0, 0);
//        System.out.println(b.printBoard(c));
//        System.out.println(b.printBoard(bod));
//        System.out.println(b.printBoard(bod1));
//        System.out.println(b.printBoard(bod2));
//        System.out.println(al);

        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
                
        // Reading Live cells
        for(int lc=0; lc<m; lc++)
        {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        Board b = new Board();
        Cell[][] current=b.createBoard(n, l);
        int nth=sc.nextInt();
        ConwayGameOfLife cgol=new ConwayGameOfLife();
        Cell[][] newGen = cgol.nthGen(current,nth);
        System.out.println(b.printBoard(newGen));      
        


	}
	
    public Cell[][] nthGen(Cell[][] c, int nth)
    {
    	Board b = new Board();   	

    	Cell[][] current=c;
    	for(int N=0; N<nth-1; N++)
    	{
    		current=b.generateNextGeneration(current);
    		
    	}
    	
    	return current;
    	
    }

}
