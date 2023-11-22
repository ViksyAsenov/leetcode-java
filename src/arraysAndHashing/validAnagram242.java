package arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class validAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

//        Map<String, Integer> countByLettersS = new HashMap<>();
//        Map<String, Integer> countByLettersT = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            String letterS = Character.toString(s.charAt(i));
//            String letterT = Character.toString(t.charAt(i));
//
//            if(countByLettersS.containsKey(letterS)) {
//                countByLettersS.put(letterS, countByLettersS.get(letterS) + 1);
//            } else {
//                countByLettersS.put(letterS, 1);
//            }
//
//            if(countByLettersT.containsKey(letterT)) {
//                countByLettersT.put(letterT, countByLettersT.get(letterT) + 1);
//            } else {
//                countByLettersT.put(letterT, 1);
//            }
//        }
//
//        return Objects.equals(countByLettersS, countByLettersT);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
