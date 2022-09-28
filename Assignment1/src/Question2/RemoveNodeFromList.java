package Question2;

public class RemoveNodeFromList {
    //Function to insert node in the list
    public Node insertNode(Node head, int data) {
        Node new_node = new Node(data);
        if(head == null) {
            head = new_node;
            return head;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        return head;
    }

    //Function to delete given node from list
    public Node deleteNode(Node head, int val) {

        if(head == null){
            return null;
        }

        while (head != null && head.data == val){
            head =  head.next;
        }

        Node temp = head;

        if(temp == null){
           return null;
        }

        while (temp.next != null){
            Node nextNode = temp.next;
            if(nextNode.data == val){
                temp.next = nextNode.next;
            }else {
                temp = temp.next;
            }
        }

        return head;

    }

    //Function to print LinkedList
    public void printLinkedList(Node head) {
        if(head==null)
        {
            return;
        }

        while(head.next !=null ) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }
}
