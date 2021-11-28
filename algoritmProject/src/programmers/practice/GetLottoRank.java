import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      // 로또의 최고 순위와 최저 순위 

        int[] answer = new int[2];
        int[] rankNums = new int[]{6, 6, 5, 4, 3, 2, 1}; 
        
        int foundZero = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i : win_nums) {
            set.add(i);
        }
        
        for(int i : lottos) {
            if(i == 0) foundZero ++;
            set2.add(i);
        }

        if(foundZero == 6) return new int[]{1, 6};
        
        set.retainAll(set2);
        int aware = set.size();

        answer[0] = rankNums[foundZero + aware];
        answer[1] = rankNums[aware];

        
        return answer;
        
    }
}
