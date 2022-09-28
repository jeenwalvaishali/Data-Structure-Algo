package Question4;

import Question3.SwapNodes;

import java.util.Arrays;

/*Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than
or equal to parts occurring later. Return an array of the k parts.

Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but its string representation as a ListNode is [].

Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
Output: [[1,2,3,4],[5,6,7],[8,9,10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.


*/
public class Main {

    public static void main(String[] args){

        Node head =  null;

        //Insert node in LinkedList
        SplitLinkedList list = new SplitLinkedList();
        head= list.insertNode(head, 1);
        head= list.insertNode(head, 2);
        head= list.insertNode(head, 3);
        head= list.insertNode(head, 4);
        head= list.insertNode(head, 5);
        head= list.insertNode(head, 6);
        head= list.insertNode(head, 7);
        head= list.insertNode(head, 8);
        head= list.insertNode(head, 9);
        head= list.insertNode(head, 10);


        Node[] splitArr = list.splitLinkedList(head, 3);

        for(int i=0; i<splitArr.length; i++){
            Node n = splitArr[i];
            list.printLinkedList(n);
        }

    }
}
