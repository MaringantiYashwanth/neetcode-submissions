class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        // Step1 : remove non-alphanumeric & lowercase
        let cleaned = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
        // Step 2: two-pointer check
        let left = 0, right = cleaned.length - 1;
        while (left < right) {
            if (cleaned[left] != cleaned[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
