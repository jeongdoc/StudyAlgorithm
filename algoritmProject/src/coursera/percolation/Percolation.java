package coursera.percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdRandom;

public class Percolation {
	
	private boolean[][] grid;
	private int n;
	
	private WeightedQuickUnionUF uf;
	
	// creates n-by-n grid, with all sites initially blocked
	public Percolation(int n) {
		this.n = n;
		this.grid = new boolean[n][n];
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; i < n; j ++) {
				grid[i][j] = false;
			}
		}
		
	}
	
	public void open(int row, int col) {}
	
	public boolean isOpen(int row, int col) {
		return false;
	}
	
	public boolean isFull(int row, int col) {
		return false;
	}
	
	public int numberOfOpenSites() {
		return 0;
	}
	
	public boolean perColates() {
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
