package Question1;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public boolean isMirror(TreeNode root){
        if(root == null)
            return false;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left1,TreeNode right1){
        if(left1 == null && right1 == null) {
            return true;
        }
        else if(left1 == null || right1 == null) {
            return false;
        }
        else if(left1.val != right1.val) {
            return false;
        }
        else {
            return isMirror(left1.left, right1.right) && isMirror(left1.right, right1.left);
        }
    }
}
