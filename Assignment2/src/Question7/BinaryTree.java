package Question7;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public TreeNode lowestComAncestor(TreeNode root, TreeNode p, TreeNode q){

        if (root == null)
            return null;

        TreeNode searchLeft = lowestComAncestor(root.left, p, q);
        TreeNode searchRight = lowestComAncestor(root.right, p, q);

        if (root == p || root == q) {
            return root;
        }else if (searchLeft == null && searchRight == null) {
            return null;
        }else if (searchLeft == null) {
            return searchRight;
        }else if (searchRight == null) {
            return searchLeft;
        }else {
            return root;
        }

    }

}
