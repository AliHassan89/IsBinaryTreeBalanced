/*
Check Balanced: Implement a function to check if a binary tree is balanced. 
For the purposes of this question, a balanced tree is defined to be a tree such 
that the heights of the two subtrees of any node never differ by more than one.
 */
package cci_chap4_balancedtree;

import bst.Node;

/**
 *
 * @author Ali
 */
public class CCI_Chap4_BalancedTree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(10);
        root.right.left = new Node(11);
        root.right.right = new Node(12);
        root.left.left.left = new Node(13);
        root.left.left.right = new Node(14);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(16);
        root.right.left.left = new Node(17);
        root.right.left.right = new Node(18);
        root.right.right.left = new Node(19);
        root.right.right.right = new Node(20);
        root.right.right.right.right = new Node(21);
        root.right.right.right.right.right = new Node(22);
        
        System.out.println(isBalanced(root));
    }
    
    public static boolean isBalanced(Node root)
    {
        if (root == null)
            return true;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;
        
        else
        {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    public static int getHeight(Node root)
    {
        if (root == null)
            return -1;
        
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    
}
