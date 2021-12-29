class First_EvaluatetPairsString {
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
                StringBuilder subsb = new StringBuilder();
                for(; s.charAt(j+=1) != right;) {
                    // get String
                    subsb.append(s.charAt(j));
                }
                
                String value = subsb.toString();
                if(knowMap.containsKey(value)) {
                    value = knowMap.get(value);
                } else {
                    value = "?";
                }
                sb.append(value);
        
            }
        }
        
        return sb.toString();
    }
}
