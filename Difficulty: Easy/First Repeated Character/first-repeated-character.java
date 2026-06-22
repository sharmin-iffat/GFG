class Solution {
    String firstRepChar(String s) {
        // code here
        boolean[] seen = new boolean[26];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(seen[ch - 'a']){
                return String.valueOf(ch);
            }
            seen[ch - 'a'] = true;
        }
        return "-1";
        
    }
}