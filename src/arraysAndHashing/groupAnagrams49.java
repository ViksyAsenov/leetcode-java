package arraysAndHashing;

import java.util.*;

public class groupAnagrams49 {
    private static int getLetterHash(String str) {
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        return Arrays.hashCode(charArray);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        for(String s : strs) {
            int hash = getLetterHash(s);

            List<String> value;

            if(map.containsKey(hash)) {
                value = map.get(hash);
            } else {
                value = new ArrayList<>();
            }

            value.add(s);
            map.put(hash, value);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<List<String>> list = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println(list);
    }
}
