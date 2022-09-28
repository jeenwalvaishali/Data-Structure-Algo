package Question1;

public class RotateList {

    //Function to insert node in the list
    public Node insertNode(Node head, int data){
        Node new_node = new Node(data);
        if (head == null){
            head = new_node;
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = new_node;
        return head;
    }

    //Function to rotate list by k nodes
    public Node rotateListByKNodes(Node head, int k){
        //Checking if head is null or rotating list by 0 times
        if(head == null || head.next == null){
            return head;
        }

       for (int i = 0; i < k; i++){
           Node temp = head;
           while (temp.next.next != null){
               temp = temp.next;
           }

           Node end = temp.next;
           temp.next = null;
           end.next = head;
           head = end;
       }

       return head;
    }

    //Function to print LinkedList
    public void printLinkedList(Node head){
        while (head.next != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }

}

