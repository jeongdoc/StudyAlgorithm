import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        char[] getChar = pattern.toCharArray();
        
        pattern = p(pattern);
        
        List<String> find = new ArrayList<>();
        for(int i = 0; i < words.length; ++i) {
            
            if(pattern.equals(p(words[i]))) {
                find.add(words[i]);
            }
            
        }

        return find;
    }
    
    public String p(String word) {
        
        Map<Character, Integer> findPattern = new HashMap<>();
        StringBuilder address = new StringBuilder();

        for(int i = 0; i < word.length(); ++i) {
            
            // save location
            if(!findPattern.containsKey(word.charAt(i))) {
                findPattern.put(word.charAt(i), findPattern.size());
            }
            
            address.append(findPattern.get(word.charAt(i)));
            
        }
        
        return address.toString();
    }
}
