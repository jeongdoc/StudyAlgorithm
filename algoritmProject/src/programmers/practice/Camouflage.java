package programmers.practice;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		// 프로그래머스  - 위장
		//String [][] clothes 
		//= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String [][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int count = 1;
		//맵에 담기
		HashMap<String, Integer> hm = new HashMap<>();
		for(String []toMap : clothes) {
			if(hm.containsKey(toMap[1])) 
				count = hm.get(toMap[1]) +1;
			
			hm.put(toMap[1], count);
		}
		
		int answer = 1;
		for (Map.Entry<String, Integer> entry : hm.entrySet() ) {
			answer *= (entry.getValue() + 1);
		}

		System.out.println(answer -1);		
	}

}
