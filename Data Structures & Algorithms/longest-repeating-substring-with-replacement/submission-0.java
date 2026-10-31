class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character, Integer> freqMap = new HashMap<>();
        int result = 0;
       int left = 0, right = 0, windowLength = 0, replacementNeeded = 0;
       while (right < s.length()) {
        windowLength = right - left + 1;
        freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);
        int maxFreq = 0;
       for (int count: freqMap.values()) {
            maxFreq = Math.max(maxFreq, count);
       }
        replacementNeeded = windowLength - maxFreq;
        if (replacementNeeded <= k) {
            right++;
        } else if (replacementNeeded > k) {
            left++;
            windowLength--;
            freqMap.put(s.charAt(left), freqMap.getOrDefault(s.charAt(left), 0) - 1);
        }
        result = Math.max(result, windowLength);
        
       }
       return result;
    }
}
