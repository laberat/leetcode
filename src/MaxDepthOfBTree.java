/**
 * Author : Laberat
 * Date   : 16/2/2.
 * Link   : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Number : # 104
 * Desc   : Given a binary tree, find its maximum depth.
 */
public class MaxDepthOfBTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
