package Question2;
/*Given the head of a linked list and an integer val,
remove all the nodes of the linked list that has Node.val == val, and return the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Input: head = [], val = 1
Output: []

Input: head = [7,7,7,7], val = 7
Output: []

*/

public class Main {
    public static void main(String[] args) {

        Node head =  null;

        //Insert node in LinkedList
        RemoveNodeFromList list = new RemoveNodeFromList();
        head= list.insertNode(head, 1);
        head= list.insertNode(head, 2);
        head= list.insertNode(head, 6);
        head= list.insertNode(head, 3);
        head= list.insertNode(head, 4);
        head= list.insertNode(head, 5);
        head= list.insertNode(head, 6);

        System.out.println("List before removing node: ");
        list.printLinkedList(head);

        head = list.deleteNode(head, 1);

        System.out.println("List after removing node: ");
        list.printLinkedList(head);

    }
}
