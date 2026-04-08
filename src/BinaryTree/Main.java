//package BinaryTree;
//
//import com.sun.source.tree.Tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class   TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode (int val)
//    {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//class BinarySearchTree {
//    TreeNode root;
//
//    public BinarySearchTree()
//    {
//        this.root = null;
//    }
//
//    public void insert(int val)
//    {
//        root = insertRec(root,val);
//    }
//
//    private TreeNode insertRec(TreeNode root , int val)
//    {
//        if(root == null){return new TreeNode(val);}
//        else if(root.val < val)
//        {
//            root.right = insertRec(root,val);
//        }
//        else if(root.val > val)
//        {
//            root.left = insertRec(root,val);
//        }
//        return root;
//    }
//
//    public void inorder()
//    {
//        inorderRec(root);
//    }
//    private void inorderRec(TreeNode root)
//    {
//        if(root != null)
//        {
//            inorderRec(root.left);
//            System.out.println(root.val + "  ");
//            inorderRec(root.right);
//        }
//    }
//    public void breadthFirstSearch()
//    {
//        if(root == null) return;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty())
//        {
//            TreeNode current = queue.poll();
//            System.out.println("Current value + " + current.val);
//            if(current .left != null)
//            {
//                queue.add(current.left);
//            } else if (current.right != null) {
//                queue.add(current.right);
//            }
//        }
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        BinarySearchTree tree = new BinarySearchTree();
//
//        System.out.println("Inserting the values: ");
//        tree.insert(22);
//        tree.insert(23);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//
//        System.out.println("This is the order of the tree in inorder : ");
//        tree.inorder();
//
//        System.out.println("Breadth First Search order : ");
//        tree.breadthFirstSearch();
//    }
//}
