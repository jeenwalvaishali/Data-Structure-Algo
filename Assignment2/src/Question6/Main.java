package Question6;
/*Given the root of a binary tree, return the maximum width of the given tree.
The maximum width of a tree is the maximum width among all levels.
The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes),
where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that
level are also counted into the length calculation.It is guaranteed that the answer will in the range of a 32-bit signed integer.

Input: root = [1,3,2,5,3,null,9]
Output: 4

Input: root = [1,3,2,5,null,null,9,6,null,7]
Output: 7

Input: root = [1,3,2,5]
Output: 2
* */

public class Main {

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.right = new TreeNode(9);

        int maxWidth = tree.maximumTreeWidth(tree.root);
        System.out.println("Maximum width of Binary Tree  " + maxWidth);
    }
}
