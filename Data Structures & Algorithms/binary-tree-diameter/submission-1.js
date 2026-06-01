/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {number}
     */
    diameterOfBinaryTree(root) {
        if (!root) {
            return 0;
        }
        let leftHeight = this.maxHeight(root.left);
        let rightHeight = this.maxHeight(root.right);
        let diameter = leftHeight + rightHeight;
        let sub = Math.max(
            this.diameterOfBinaryTree(root.left),
            this.diameterOfBinaryTree(root.right),
        );
        return Math.max(diameter, sub);
    }
    maxHeight(curr) {
        if (!curr) {
            return 0;
        }
        return 1 + Math.max(this.maxHeight(curr.left), this.maxHeight(curr.right));
    }
}
