class Solution {
    public int longestKSubstr(String s, int k) {
        int[] freq = new int[26];
        int left = 0, right = 0;
        int distinct = 0;
        int maxLen = -1;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (freq[ch - 'a'] == 0) {
                distinct++;
            }
            freq[ch - 'a']++;

            while (distinct > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;

                if (freq[leftChar - 'a'] == 0) {
                    distinct--;
                }
                left++;
            }

            if (distinct == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }
}