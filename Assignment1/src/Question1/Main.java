package Question1;
/*Given the head of a linked list, rotate the list to the right by k places.
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Input: head = [0,1,2], k = 4
Output: [2,0,1]

*/

public class Main {
    public static void main(String[] args) {

        Node head =  null;

        //Insert node in LinkedList
        RotateList rotateList = new RotateList();
        head= rotateList.insertNode(head, 1);
        head= rotateList.insertNode(head, 2);
        head= rotateList.insertNode(head, 3);
        head= rotateList.insertNode(head, 4);
        head= rotateList.insertNode(head, 5);



        System.out.println("List before rotation by k nodes: ");
        rotateList.printLinkedList(head);

        int k = 2;
        Node newHead = rotateList.rotateListByKNodes(head, k);

        System.out.println("List after rotation by k nodes: ");
        rotateList.printLinkedList(newHead);




    }
}