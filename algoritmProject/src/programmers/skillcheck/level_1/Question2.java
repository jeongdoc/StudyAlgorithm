package programmers.skillcheck.level_1;

public class Question2 {

	public static void main(String[] args) {
		// SkillCheck - Question 2
		String s = "123456";
		
		System.out.println(answerFlag(s));

	}
	
	public static boolean answerFlag(String s) {
		boolean answer = true;
		
		int len = s.length();
		
		if(len == 4 || len == 6) {
			for(int i = 0; i < len; i ++) {
				if(!Character.isDigit(s.charAt(i))) return false;
			}
		} else {
			return false;
		}
		
		return answer;
	}
	

}
