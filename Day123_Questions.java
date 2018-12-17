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
	//2018.12.16 Day2
	public void triangleLB(int n) {
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void triangleLU(int n) {
		for(int i = 0; i < n; i ++) {
			for(int j = n - 1; j >= i; j --) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void triangleRU(int n) {
		
		for(int i = 0; i <= n; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("  ");
			}
			for(int j = 0; j < n - i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void triangleRB(int n ) {
		for(int i = 0; i <= n; i ++) {
			for(int j = n; i < j; j --) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void starSquare() {
		System.out.println("사각형을 출력합니다.");
		System.out.print("단수 : ");
		int n = sc.nextInt();
		
		String [][]sar = new String[n][n];
		
		for (String[] se : sar) {
			for(String [] sr : sar) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}


}
