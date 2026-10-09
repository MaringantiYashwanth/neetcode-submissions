class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String str: strs) {
            StringBuilder key = new StringBuilder();
            int[] freq = new int[26];
            // count chars
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
            // build key
            for (int i = 0; i < 26; i++) {
                key.append(freq[i]);
                key.append("#");
            }
            String finalKey = key.toString();
            // key doesn't exist then create an empty array
            if (!hashMap.containsKey(finalKey)) {
                hashMap.put(finalKey, new ArrayList<>());
            } 
            List<String> group = hashMap.get(finalKey);
            group.add(str);
            // hashMap.put(finalKey, group);
        }
        // List<List<String>> result = new ArrayList<>();
        // for (List<String> words: hashMap.values()) {
        //     result.add(words);
        // }
        // return result;
        return new ArrayList<>(hashMap.values());
    }
}
