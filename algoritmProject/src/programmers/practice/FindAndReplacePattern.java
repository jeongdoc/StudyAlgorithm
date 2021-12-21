import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        int[] patternArr = p(pattern);
        
        List<String> find = new ArrayList<>();

        for(int i = 0; i < words.length; ++i) {
            int[] temp = p(words[i]);
            if(Arrays.equals(patternArr, temp)) {
                find.add(words[i]);
            }
        }
        return find;
    }
    
     public int[] p(String word) {
        
        Map<Character, Integer> findPattern = new HashMap<>();
        int[] address = new int[word.length()];

        for(int i = 0; i < word.length(); ++i) {
            
            char temp = word.charAt(i);
            // save location
            if(!findPattern.containsKey(temp)) {
                findPattern.put(temp, i);
            }
            
            address[i] = findPattern.get(word.charAt(i));
            
        }
        
        return address;
    }
}
