import java.util.*;
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        // Leetcode 811
        Map<String, Integer> domainMap = new HashMap<>();
        for(String domain : cpdomains) {
            
            int blankIdx = domain.indexOf(" ");
            int count = Integer.parseInt(domain.substring(0, blankIdx));
            domain = domain.substring(blankIdx);
            
            for(int i = 0; i != -1; i = domain.indexOf(".", i +1)) {
                String subDomain = domain.substring(i+1);
                if(!domainMap.containsKey(subDomain)) {
                    domainMap.put(subDomain, count);
                } else {
                    domainMap.put(subDomain, domainMap.get(subDomain) + count);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> map : domainMap.entrySet()) {
            result.add(map.getValue() + " " + map.getKey());
        }
        
        return result;
    }
}
