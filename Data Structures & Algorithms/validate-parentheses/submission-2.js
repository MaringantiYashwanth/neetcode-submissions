class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const stack = [];
        for (let ch of s) {
            if (ch === "(" || ch === "[" || ch === "{") {
                stack.push(ch);
            } else {
                if (stack.length === 0) {
                    return false;
                }
                const top1 = stack.pop();
                if (ch === ")" && top1 !== "(" || 
                    ch === "]" && top1 !== "[" || 
                    ch === "}" && top1 !== "{") {
                        return false;
                    }
            }
        }
        return stack.length === 0;
    }
}
