class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traverse(p, q);
    }

    public boolean traverse(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return traverse(p.left, q.left) && traverse(p.right, q.right);
    }
}
