import java.util.*;
class Result {

    // 해커랭크
  
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        // megazine 비교대상
        // note 얘로 비교함

        // note가 더 길면 return
        if(note.size() > magazine.size()) {
            System.out.printf("%s", "No");
            return;
        }

        // megazine 데이터 체크
        HashMap<String, Integer> magazineMap = new HashMap<>();
        for(int i = 0; i < magazine.size(); ++i) {
            String key = magazine.get(i);
            if(magazineMap.containsKey(key)) {
                magazineMap.put(key, (magazineMap.get(key) +1));
            } else {
                magazineMap.put(key, 1);
            }
        }

        // 비교
        for(int i = 0; i < note.size(); ++i) {
            String key = note.get(i);
            if(magazineMap.containsKey(key)) {
                magazineMap.put(key, magazineMap.get(key) -1);

                if(magazineMap.get(key) < 0) {
                    System.out.printf("%s", "No");
                    return;    
                }

            } else {   
                System.out.printf("%s", "No");
                return;
            }
        }

        System.out.printf("%s", "Yes");
    }
}
