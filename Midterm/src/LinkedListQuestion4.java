public class LinkedListQuestion4 {
    public static void main(String args[])
    {
        LinkedListQuestion4 linkedList = new LinkedListQuestion4();
        int [] array ={5,7,10,14,18};
        Node node;
        for(int i:array){
            node = linkedList.newNode(i);
            linkedList.insert(node);

        }
        linkedList.printLinkedList();
    }

    Node head;

    public void insert(Node new_node)
    {
        Node current;
        if (head == null || head.data
                >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {

            current = head;

            while (current.next != null
                    && current.next.data < new_node.data)
                current = current.next;

            new_node.next = current.next;
            current.next = new_node;
        }
    }

    public Node newNode(int data)
    {
        Node node = new Node(data);
        return node;
    }

    public void printLinkedList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
