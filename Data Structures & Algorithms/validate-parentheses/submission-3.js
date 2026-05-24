class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let bracketsMap = {
            ')': '(',
            ']': '[',
            '}': '{'
        };
        let n = s.length;
        let stack = [];
        for (let ch of s) {
            if (ch === '(' || ch === '[' || ch === '{') {
                stack.push(ch);
            } else {
                if (stack.length === 0 || stack.pop() !== bracketsMap[ch]) {
                    return false;
                }
            }
        }
        return stack.length === 0;
    }
}
