class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);

        for (int i = 1; i < inorderList.size(); i++) {
            if (inorderList.get(i) <= inorderList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
