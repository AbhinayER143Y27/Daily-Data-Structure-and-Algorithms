package BinaryTree;

import linkedlist.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class breathFirstSearchAlgo {
        public void  breadthFirstSearchAlgoThing()
        {
            if(root == null)return;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty())
            {
                TreeNode current = queue.poll();
                System.out.println(current.val);
                if(current.left != null)
                {
                      queue.add(current.left);
                }
                if(current.right != null)
                {
                    queue.add(current.right);
                }
            }
        }
}
