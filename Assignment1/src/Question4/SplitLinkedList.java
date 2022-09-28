package Question4;


public class SplitLinkedList {

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

    //Function to split LinkedList
    public Node[] splitLinkedList(Node head, int k){
        Node[] splitArr = new Node[k];
        if(head == null || k<1){
            return splitArr;
        }

        //For Finding Length
        Node currentNode = head;
        int nodeCount = 0;
        while(currentNode != null){
            nodeCount++;
            currentNode = currentNode.next;
        }

        if(nodeCount == 0){
            return splitArr;
        }

        int kPartCount = nodeCount / k;
        int remainder = nodeCount % k;

        currentNode = head;
        int index = 0;
        while (currentNode != null){
            Node previousNode = null;
            splitArr[index++] = currentNode;
            for (int i=0; i< kPartCount; i++){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            if (remainder > 0 && index <= remainder){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            if (previousNode != null){
                previousNode.next = null;
            }
        }

        return splitArr;

    }


    //Function to print LinkedList
    public void printLinkedList(Node head) {
        if(head == null)
        {
            return;
        }

        System.out.print("{");
        while(head.next !=null ) {
            System.out.print(head.data+",");
            head = head.next;

        }
        System.out.print(head.data);
        System.out.print("} ");
    }

}
