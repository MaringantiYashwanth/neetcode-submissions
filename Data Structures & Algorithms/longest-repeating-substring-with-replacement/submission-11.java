class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character, Integer> freqMap = new HashMap<>();
        int result = 0;
       int left = 0, maxFreq = 0;
       for (int right = 0; right < s.length(); right++) {
        freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);
       maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(right)));
        int windowLength = right - left + 1;
        while (windowLength - maxFreq > k) {
            // replacementNeeded = windowLength - maxFreq;
            freqMap.put(
                s.charAt(left),
                freqMap.get(s.charAt(left)) - 1
            );

            left++;
           windowLength = right - left + 1;
        }
        result = Math.max(result, windowLength);
       }
       
       return result;
    }
}
