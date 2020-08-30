package programmers.skillcheck.level_1;

public class Question1 {

	public static void main(String[] args) {
		// SkillCheck - Question 1
		String s = "Toreta";
		String answer = "";
		int len = 0;
		len = s.length();
		
		answer = len%2 == 0 ? s.substring(len / 2-1, len / 2+1) : Character.toString(s.charAt(len/2));
		
		System.out.println(answer);

	}

}
