public class BinTreeQuestion2 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right.right = new Node(10);
        BinTreeQuestion2 binTreeQuestion2 = new BinTreeQuestion2();
        binTreeQuestion2.printValue(root);

        binTreeQuestion2.populateParentNode(root,null);
        binTreeQuestion2.printValue(root);

    }

    public void printValue(Node root) {
        if (root == null) {
            return;
        }
        if(root.parentNode!=null) {
            System.out.println(root.data + "= " + root.parentNode.data);
        }
        else{
            System.out.println(root.data +"= "+ "null");
        }
        printValue(root.left);
        printValue(root.right);
    }

    public void populateParentNode(Node root, Node parent){
        if(root==null)return;
        if(parent!=null){
            if(root.left!=null){
                root.left.parentNode = root;
            }
            if(root.right!=null){
                root.right.parentNode = root;
            }
        }else if(parent==null){
            root.parentNode=null;
            if(root.left!=null){
                root.left.parentNode=root;
            }
            if(root.right!=null){
                root.right.parentNode = root;
            }
        }
        populateParentNode(root.left,root);
        populateParentNode(root.right,root);
    }
}
