package Question2;

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

    public boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null) {
            return true;
        }
        else if(left == null || right == null) {
            return false;
        }
        else if(left.value != right.value) {
            return false;
        }
        else {
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
}

