package algo.day1.day2.day3;

public class Day123_Questions {//gg
	
	public Day123_Questions() {}
	
	//2018.12.14 Day1
	public int[][] multiMethod1() {
		int [][]iar = new int[10][10];
		
		for(int x = 0; x < iar.length; x ++) {
			if(x == 0)
				System.out.print("   |");
			else
				System.out.printf("%2d |", x);
			for(int y = 1; y < iar[x].length; y ++) {
				if(x == 0)
					System.out.printf("%3d", y);
			    else
			    	System.out.printf("%3d",x * y);
			}
			if(x == 0)
				System.out.print("\n" + "---+---------------------------");

			System.out.println();
		 }
		System.out.println();
		
		return iar;
	}
	public int[][] sumMethod2() {
		int [][]iar = new int[10][10];
		
		for(int x = 0; x < iar.length; x ++) {
			if(x == 0)
				System.out.print("   |");
			else
				System.out.printf("%2d |", x);
			for(int y = 1; y < iar[x].length; y ++) {
				if(x == 0)
					System.out.printf("%3d", y);
			    else
			    	System.out.printf("%3d",x + y);
			}
			if(x == 0)
				System.out.print("\n" + "---+---------------------------");

			System.out.println();
		 }
		System.out.println();
		
		return iar;

	}

}