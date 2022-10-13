package Question4;


import java.util.*;

public class BinaryTree {

    TreeNode root;

    public BinaryTree(){
        root = null;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
            if (root == null) {
               return new ArrayList<>();
            }
            List<List<Integer>> listOrder = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean reverseFlag = false;

            while (!queue.isEmpty()){
                int size = queue.size();
                List<Integer> zigZagLevelList = new ArrayList<>();
                while (size-- > 0){
                    root = queue.poll();
                    zigZagLevelList.add(root.val);
                    if (root.left != null){
                        queue.add(root.left);
                    }
                    if(root.right != null){
                        queue.add(root.right);
                    }
                }
                if(reverseFlag){
                    Collections.reverse(zigZagLevelList);
                }
                listOrder.add(zigZagLevelList);
                reverseFlag = !reverseFlag;
            }
            return listOrder;
        }
}
