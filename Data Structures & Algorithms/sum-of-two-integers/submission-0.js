class Solution {
    /**
     * @param {number} a
     * @param {number} b
     * @return {number}
     */
    getSum(a, b) {
        let carry = a & b;
        let result = a ^ b;
        while (carry !== 0) {
            let shiftedCarry = carry << 1;
            carry = shiftedCarry & result;
            result ^= shiftedCarry;
        }
        return result;
    }
}
