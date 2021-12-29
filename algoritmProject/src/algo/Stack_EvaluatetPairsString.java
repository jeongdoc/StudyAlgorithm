class Stack_EvaluatetPairsString {
    public String evaluate(String s, List<List<String>> knowledge) {
        char left = '(';
        char right = ')';

        Map<String, String> knowMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        for(List<String> keys : knowledge) {
            knowMap.put(keys.get(0), keys.get(1));
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder subsb = new StringBuilder();
        for(int j = 0; j < s.length(); ++j) {
            char ch = s.charAt(j);
            if(ch == left) {
                stack.push(ch);
                subsb = new StringBuilder();
                continue;
            } else if(ch == right) {
                if(knowMap.containsKey(subsb.toString())) {
                    sb.append(knowMap.get(subsb.toString()));
                } else {
                    sb.append("?");
                }
                subsb = new StringBuilder();
                stack.pop();
                continue;
            } else {
                subsb.append(ch);

                if(stack.isEmpty()) {
                    sb.append(ch);
                }
            }

        }
        
        return sb.toString();
    }
}
