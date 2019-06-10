java.util.Array;
class Programmers_hash1 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int x;
        for(x = 0; x < completion.length; x ++) {
            if(!participant[x].equals(completion[x]))
                return participant[x];
        }
        return participant[x];
    }
}
