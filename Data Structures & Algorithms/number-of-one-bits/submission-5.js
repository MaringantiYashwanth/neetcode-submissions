class Solution {
    /**
     * @param {number} n - a positive integer
     * @return {number}
     */
    hammingWeight(n) {
        let result = 0;
        while ( n !== 0 ) {
            result += n % 2;
            result >>= 1;
        }
        return result;
    }
}
