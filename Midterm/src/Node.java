public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node next;
    public Node parentNode;



    public Node(int d)
    {
        data = d;
        next = null;
    }

    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
