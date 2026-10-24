class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // brute force approach
        Map<String, List<String>> res = new HashMap<>();
        for (String str: strs) {
            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);
            String sortedStr = new String(chArray);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
