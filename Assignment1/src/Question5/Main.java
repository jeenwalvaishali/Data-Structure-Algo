package Question5;
/*Given a Circular Linked List node, which is sorted in non-descending order, write a function to insert a value insertVal into the list
such that it remains a sorted circular list. The given node can be a reference to any single node in the list and may not necessarily be the
smallest value in the circular list. If there are multiple suitable places for insertion, you may choose any place to insert the new value.
After the insertion, the circular list should remain sorted. If the list is empty (i.e., the given node is null),
you should create a new single circular list and return the reference to that single node. Otherwise, you should return the originally given node.

Input: head = [], insertVal = 1
Output: [1]

Input: head = [1], insertVal = 0
Output: [1,0]
*/

public class Main {

    public static void main(String[] args) {

        Node head =  null;

        //Insert node in LinkedList
        SortedCircularLinkedList list = new SortedCircularLinkedList();
        head= list.insertInCircularList(head, 1);



        System.out.println("List before inserting node: ");
        list.printLinkedList(head);

        int insertVal = 0;
        head = list.insertInCircularList(head,insertVal);

        System.out.println("List after inserting node: ");
        list.printLinkedList(head);

    }


}
