class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // optimized approach
       Map<String, List<String>> res = new HashMap();
		for (String str: strs) 
		{
			char[] count = new char[26];
			for (char ch : str.toCharArray()) {
				count[ch - 'a']++;
			}
			String key = Arrays.toString(count);
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(str);
		}
		return new ArrayList<>(res.values());
    }
}
