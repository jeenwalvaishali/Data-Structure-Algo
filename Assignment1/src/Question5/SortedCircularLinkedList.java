package Question5;

public class SortedCircularLinkedList {

    //Function to insert Node
    public Node insertInCircularList(Node head, int insertVal){
        Node new_node = new Node(insertVal);
        if(head == null){
            new_node.next = new_node;
            return new_node;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while (currentNode != head){
            if ((prevNode.data <= insertVal && insertVal <= currentNode.data) ||
                    (prevNode.data > currentNode.data && (insertVal >= prevNode.data || insertVal <= currentNode.data))){
               break;
            }
            prevNode = prevNode.next;
            currentNode = currentNode.next;
        }

        prevNode.next = new_node;
        new_node.next = currentNode;
        return head;

    }

    //Function to print List
    public void printLinkedList(Node head) {
        if(head==null)
        {
            return;
        }
        Node temp = head;

        while(head.next != temp) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }

}
