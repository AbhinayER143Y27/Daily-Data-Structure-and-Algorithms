package BinaryTree;

public class lowestCommonAncestor {
    public TreeNode lowestCommonThings(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null || p == root || q == root)
        {
            return root;
        }

        TreeNode left = lowestCommonThings(root.left , p , q);
        TreeNode right = lowestCommonThings(root.right, p , q);

        if(left != null || right != null)
        {
            return root;
        }

        return (left != null) ? left : right;
    }
}
