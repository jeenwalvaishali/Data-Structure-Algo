import java.util.LinkedList;
import java.util.Queue;

public class BinTreeQuestion1 {
    public Node root;

    public BinTreeQuestion1() {
       root = null;
    }

    public static Node populateNextLeft(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                Node node = nodeQueue.poll();

                if (i < size - 1) {
                    node.next = nodeQueue.peek();
                }
                if (node.left != null) {
                    nodeQueue.add(node.left);
                }
                if (node.right != null) {
                    nodeQueue.add(node.right);
                }
            }
        }
        return root;
    }

    public static void printValue(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        printValue(root.left);
        printValue(root.right);
    }
}
