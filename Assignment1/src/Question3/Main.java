package Question3;

/*You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node
from the beginning and the kth node from the end (the list is 1-indexed).

Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

*/


public class Main {

    public static void main(String[] args) {

        Node head =  null;

        //Insert node in LinkedList
        SwapNodes list = new SwapNodes();
        head= list.insertNode(head, 7);
        head= list.insertNode(head, 9);
        head= list.insertNode(head, 6);
        head= list.insertNode(head, 6);
        head= list.insertNode(head, 7);
        head= list.insertNode(head, 8);
        head= list.insertNode(head, 3);
        head= list.insertNode(head, 0);
        head= list.insertNode(head, 9);
        head= list.insertNode(head, 5);


        System.out.println("List before swapping node: ");
        list.printLinkedList(head);

        head = list.swapPairs(head,5);

        System.out.println("List after swapping node: ");
        list.printLinkedList(head);

    }

}
