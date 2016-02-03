/**
 * Author : Laberat
 * Date   : 16/2/3.
 * Link   : https://leetcode.com/problems/invert-binary-tree/
 * Number : # 226
 * Desc   : Invert a binary tree.
 */
public class InvertBTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
        return root;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}


