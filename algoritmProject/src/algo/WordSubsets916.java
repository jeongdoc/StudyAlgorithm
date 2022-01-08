import java.util.*;

public class WordSubsets916 {
    public static void main(String[] args) {
        
        String[] words1 = new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] words2 = new String[]{"lo","eo"};
        
        
        List<String> result = wordSubsets(words1, words2);
        System.out.println(result);
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> result = new ArrayList<>();
        int[] word2Arr = new int[26];
        for(int i = 0; i < words2.length; ++i) {
            int[] temp = new int[26];
            temp = getFrequency(words2[i]);

            for(int ii = 0; ii < 26; ++ii) {
                word2Arr[ii] = word2Arr[ii] > temp[ii] ? word2Arr[ii] : temp[ii];
            }

        }

        System.out.println();
        for(int i = 0; i < words1.length; ++i) {
            int[] word1Arr = new int[26];
            word1Arr = getFrequency(words1[i]);

            int ii = 0;
            for(; ii < 26; ++ii) {
                if(word2Arr[ii] > word1Arr[ii]) {
                    break; 
                }
            }
            if(ii == 26) {
                result.add(words1[i]);
            }
        }
        
        return result;
    }
    
    public static int[] getFrequency(String word) {

        int[] ch = new int[26];
        for(int i = 0; i < word.length(); ++i) {
            ch[word.charAt(i) - 97] ++;
        }

        return ch;
    }
}
