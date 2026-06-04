//package BinaryTree;
//
//public class lowestCommonAncestor {
//    public TreeNode bottomUpApproach(TreeNode root, TreeNode p, TreeNode q)
//    {
//        if(root == null || p == root || q == root)
//        {
//            return root;
//        }
//
//        TreeNode left = bottomUpApproach(root.left , p , q);
//        TreeNode right = bottomUpApproach(root.right, p , q);
//
//        if(left != null || right != null)
//        {
//            return root;
//        }
//
//        return (left != null) ? left : right;
//    }
//}
