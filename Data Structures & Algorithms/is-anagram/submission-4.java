class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ch_arr = new char[26];
        for (int i = 0; i < s.length(); i++) {
            ch_arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            ch_arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ch_arr.length; i++) {
            if (ch_arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
