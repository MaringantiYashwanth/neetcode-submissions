class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // optimized approach
        Map<String, List<String>> res = new HashMap<>();
        for (String str: strs) {
            char[] chArray = new char[26];
            for (char c: str.toCharArray()) {
                chArray[c - 'a']++;
            }
            String key = Arrays.toString(chArray);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
