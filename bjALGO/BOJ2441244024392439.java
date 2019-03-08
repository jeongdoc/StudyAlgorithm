package bojEX;

import java.util.Scanner;

public class BOJ2441244024392439 {

	public static void main(String[] args) {
		// boj2441
				/* 
				 		*****
				 		 ****
				         	  ***
				   	           **
				   	            *
				*/
				int star = new Scanner(System.in).nextInt();
				for(int i = 1; i <= star; i ++) {
					for(int j = 1; j <= star; j ++) {
						if(j >= i) 
							System.out.println("*");
						else
							System.out.println(" ");
					}
					System.out.println();
				}
				
				//boj2440
				/*
				 		*****
				 		 ****
				 		  ***
				 		   **
				 		    *
				*/
				for(int i = star; i > 0; i --) {
					for(int j = 1; j <= i; j ++) {
						System.out.println("*");
					}
					System.out.println();
				}
				
				//boj2439
				/*
				 		    *
				 		   **
				 		  ***
				 		 ****
				 		***** 
				 */
				for(int i = 1; i <= star; i ++) {
					for(int j = 1; j <= star; j ++) {
						if(i+j >= star+1)
							System.out.println("*");
						else
							System.out.println(" ");
					}
					System.out.println();
				}
				//boj2439
				/*
				 	        *
				 		**
				 		***
				 		****
				 		*****
				*/
				for(int i = 1; i <= star; i ++) {
					for(int j = i; j > 0; j --) {
						System.out.println("*");
					}
					System.out.println();
				}


	}

}
