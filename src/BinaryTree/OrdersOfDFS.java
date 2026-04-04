package BinaryTree;

public class OrdersOfDFS {
    public void PreOrder()
    {
        PreOrderRec(root);
    }

    private void PreOrderRec(TreeNode root)
    {
        if(root != null)
        {
            System.out.println(root.val + " ");
            PreOrderRec(root.left);
            PreOrderRec(root.right);
        }
    }

    public void inOrder()
    {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root)
    {
        inOrderRec(root.left);
        System.out.println(root.val + " ");
        inOrderRec(root.right);
    }

    public void postOrder()
    {
        postOrderRec(root);
    }

    private void postOrderRec(TreeNode root)
    {
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.println(root.val + " ");
    }
}
