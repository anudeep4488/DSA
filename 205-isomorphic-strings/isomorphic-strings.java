class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Check s → t mapping
            if (mapST.containsKey(chS)) {               // if key exist that value must be checks 
                if (mapST.get(chS) != chT) return false; // it cheks current key-values is equal it current cht value
            } else {
                mapST.put(chS, chT);
            }

            // Check t → s mapping
            if (mapTS.containsKey(chT)) { //if get true  it  witt check revese char is eual are not 
                if (mapTS.get(chT) != chS) return false;
            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }
}
