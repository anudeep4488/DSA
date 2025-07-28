import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); // sorted values will be as keys becaz to make unikkeness and same words will add to it value
            String sorted = new String(chars);
            // if key not contains in hashmap it put key and values into it
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            // if it contains it get values of specific key and add value to existing key
            map.get(sorted).add(word);
        }
        // it returns value which are there in the fporn\m of arraylist in value,entaire values in map will return 
        return new ArrayList<List<String>>(map.values()); // fixed line ✅
    }
}
