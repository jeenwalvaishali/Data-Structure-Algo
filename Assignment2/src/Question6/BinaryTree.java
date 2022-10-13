package Question6;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public int maximumTreeWidth(TreeNode root){

        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxWidth = 0;
        while(! queue.isEmpty()){
            int n = queue.size();

            if(n > maxWidth) {
                maxWidth = n;
            }

            for(int i=0; i<n; i++){
                TreeNode node = queue.remove(0);

                if(node != null){
                    queue.add(node.left);
                    queue.add(node.right);
                }else{
                    queue.add(null);
                    queue.add(null);
                }
            }

            while(!queue.isEmpty() && queue.get(0) == null){
                queue.remove(0);
            }

            while(!queue.isEmpty() && queue.get(queue.size()-1) == null){
                queue.remove(queue.size()-1);
            }
        }

        return maxWidth;

    }
}
