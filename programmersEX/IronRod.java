package programmersEX;

public class IronRod {

	public static void main(String[] args) {
		//프로그래머스 - 쇠막대기
		//22칸
		String arrangement = "()(((()())(())()))(())".replace("()", "T");
		int lazer = 0;
		int cut = 0;
		int leftParenthesis = 0;
		for(int i = 0; i < arrangement.length(); i ++) {
			String findChar = String.valueOf(arrangement.charAt(i));
			String c = findChar.equals("(") ? "left" : (findChar.equals(")") ? "right" : "T");
			switch(c) {
			case "left" :
				leftParenthesis++;
				cut++;
			break;
			case "right" : 
				leftParenthesis --;
			break;
			case "T" :
				lazer ++;
				cut += leftParenthesis * lazer;
				lazer = 0;
			}
		}
		System.out.println("결과 : " + cut);
	}

}
