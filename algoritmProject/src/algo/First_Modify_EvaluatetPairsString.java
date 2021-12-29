class First_Modify_EvaluatetPairsString {
    public String evaluate(String s, List<List<String>> knowledge) {
        char left = '(';
        char right = ')';

        Map<String, String> knowMap = new HashMap<>();

        for(List<String> keys : knowledge) {
            knowMap.put(keys.get(0), keys.get(1));
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < s.length(); ++j) {
            
            if(s.charAt(j) != left) {
                sb.append(s.charAt(j));
            } else {
                int rightIdx = j;
                for(; s.charAt(rightIdx) != right; ) {
                    rightIdx+=1;
                }
                // System.out.println(s.substring(j+1, rightIdx));
                String value = s.substring(j+1, rightIdx);
                if(knowMap.containsKey(value)) {
                    sb.append(knowMap.get(value));
                } else {
                    sb.append("?");
                }
                j = rightIdx;
            }
        }
        return sb.toString();
    }
}
