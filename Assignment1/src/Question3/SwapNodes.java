package Question3;


public class SwapNodes {

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

    public Node swapPairs(Node head, int k) {

        Node kthNodeFromStart = head;
        Node kthNodeFromEnd = head;
        Node currentNode =  head;

        if(head == null){
            return null;
        }

        // For getting location of Beginning Node
        for (int i =0; i<k-1 ; i++){
            if (currentNode != null){
                currentNode = currentNode.next;
                kthNodeFromStart = kthNodeFromStart.next;
            }
        }


        // For getting location of End Node
        if (currentNode != null) {
            while (currentNode.next != null){
                kthNodeFromEnd = kthNodeFromEnd.next;
                currentNode = currentNode.next;
            }
        }


        //Swapping data of nodes
        int temp = kthNodeFromStart.data;
        kthNodeFromStart.data = kthNodeFromEnd.data;
        kthNodeFromEnd.data = temp;

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
