class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            
            if (map1[c1 - 'a'] != map2[c2 - 'a']) {
                return false;
            }

            
            map1[c1 - 'a'] = i + 1;
            map2[c2 - 'a'] = i + 1;
        }

        return true;
    }
}