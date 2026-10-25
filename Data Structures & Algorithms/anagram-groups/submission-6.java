class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freqMap = new HashMap<>();
        for (String str: strs) {
            char[] chArray = new char[26];
            for (int i = 0; i < str.length(); i++) {
                chArray[str.charAt(i) - 'a']++;
            }
            String key = new String(chArray);
            freqMap.putIfAbsent(key, new ArrayList<>());
            freqMap.get(key).add(str);
        }
        return new ArrayList<>(freqMap.values());
    }
}
