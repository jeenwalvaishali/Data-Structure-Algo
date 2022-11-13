import java.util.List;

public class BinarySearchTreeQuestion3 {

    public List<Integer> rangeValue(Node node, int low, int high, List<Integer> ans) {
        if (node == null) {
            return ans;
        }
        if (low < node.data) {
            rangeValue(node.left, low, high,ans);
        }
        if (low <= node.data && high >= node.data) {
            ans.add(node.data);
        }
        rangeValue(node.right, low, high,ans);
        return ans;
    }

}