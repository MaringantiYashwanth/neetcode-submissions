class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        // ["act","pots","tops","cat","stop","hat"]
        // [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        let map = new Map();
        for (let word of strs) {
            let sorted = word.split('').sort().join('');
            if (!map.has(sorted)) {
                map.set(sorted, []);
            }
            map.get(sorted).push(word);
        }

        let result = []
        for (let [key, value] of map) {
            result.push(value);
        }

        return result;
    }
}
