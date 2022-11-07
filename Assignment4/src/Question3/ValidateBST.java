package Question3;
/*Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Input: root = [2,1,3]
Output: true

Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
* */
public class ValidateBST {
    public boolean validate(TreeNode root, Integer negInfinity, Integer posInfinity){
        if(root == null){
            return true;
        }

        if((negInfinity != null &&  root.val <= negInfinity) || (posInfinity != null && root.val>= posInfinity)){
            return false;
        }

        return validate(root.left, negInfinity, root.val) && validate(root.right, root.val, posInfinity);
    }

    public boolean isValidBST(TreeNode root){
        return validate(root, null, null);
    }
}
