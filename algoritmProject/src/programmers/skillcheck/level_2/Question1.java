package programmers.skillcheck.level_2;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// SkillCheck - Question 1
		
		// N행 4열로 이루어진 땅따먹기. 한 행씩 내려올 때, 같은 열을 연속해서 밟을 수 없음.
		// 1행부터 땅을 밟으며 한행씩 내려올 때, 각 행의 4칸 중 한 칸만 밟으면서 내려와야 함.
		// 마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최댓값 구하기.
		
		// 행의 개수 N:100,000이하의 자연수
		// 열의 개수는 4개, 땅은 2차원 배열로 주어짐
		// 점수 : 100 이하의 자연수
		
		// [[1,2,3,5], [5,6,7,8], [4,3,2,1]] -> 16
		
		int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
	
		int sum = 0;
		int max = 0;
		int firstMax = 0;
		for(int i = 0; i < land.length -1; i ++) {
			for(int j = 0; j < land[i].length; j ++) {
				firstMax = Math.max(0, land[0][j]); 
				max = landMaximum(land[i +1], j);
				
			}
			sum += max;
			//sum += max;
		}
		System.out.println(firstMax + sum);
		//System.out.println(sum);
		
	}
	
	public static int landMaximum(int[] land, int idx) {
		int max = 0;
		
		for(int i = 0; i < land.length; i ++) {
			
			if(i != idx) {
				max = Math.max(max, land[i]);
			}
		}
		
		return max;
	}

}
