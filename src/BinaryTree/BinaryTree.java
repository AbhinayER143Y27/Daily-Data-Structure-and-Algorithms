//package BinaryTree;
//
//import com.sun.source.tree.Tree;
//
//class TreeNode
//{
//    int val;
//    TreeNode leftNode;
//    TreeNode rightNode;
//
//    TreeNode(int val)
//    {
//        this.val = val;
//        this.leftNode = null;
//        this.rightNode = null;
//    }
//}
//public class BinaryTree
//{
//    TreeNode root;
//
//    public BinaryTree()
//    {
//        this.root = null;
//    }
//    public void insert(int val)
//    {
//        root = insertRec(val, root);
//    }
//
//    private TreeNode insertRec(int val , TreeNode root)
//    {
//        if(root == null)
//        {
//            root = new TreeNode(val);
//            return root;
//        }
//
//        else if(val < root.val)
//        {
//            root.leftNode = insertRec(val,root.leftNode);
//        }
//
//        else if(val > root.val)
//        {
//            root.rightNode = insertRec(val,root.rightNode);
//        }
//
//        return root;
//    }
//
//
//
//}