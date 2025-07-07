class Solution {
    int max = 0; // Global diameter tracker

    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return max;
    }

    // Returns height of subtree rooted at node
    public int traverse(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = traverse(node.left);
        int rightHeight = traverse(node.right);

        // Update max diameter at this node
        max = Math.max(max, leftHeight + rightHeight);

        // Return height to parent
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
