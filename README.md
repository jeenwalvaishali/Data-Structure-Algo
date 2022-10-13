# Fall2022_DataStructureAlgo
# Assignment1:

* ### Question1: 
       * Given the head of a linked list, rotate the list to the right by k places.

* ### Question2: 
      * Given the head of a linked list and an integer val,
        remove all the nodes of the linked list that has Node.val == val, and return the new head.

* ### Question3: 
      * You are given the head of a linked list, and an integer k.
        Return the head of the linked list after swapping the values of the kth node
        from the beginning and the kth node from the end (the list is 1-indexed).

* ### Question4:
      *  Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
         The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
         The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than
         or equal to parts occurring later. Return an array of the k parts.

* ### Question5: 
      * Given a Circular Linked List node, which is sorted in non-descending order, write a function to insert a value insertVal into the list
        such that it remains a sorted circular list. The given node can be a reference to any single node in the list and may not necessarily be the
        smallest value in the circular list. If there are multiple suitable places for insertion, you may choose any place to insert the new value.
        After the insertion, the circular list should remain sorted. If the list is empty (i.e., the given node is null),
        you should create a new single circular list and return the reference to that single node. Otherwise, you should return the originally given node.

# Assignment2:

* ### Question1:
       * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

* ### Question2:
      * Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

* ### Question3:
      * Given the root of a binary tree, imagine yourself standing on the right side of it,
        return the values of the nodes you can see ordered from top to bottom.

* ### Question4:
      * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
        (i.e., from left to right, then right to left for the next level and alternate between).

* ### Question5:
      * Given the root of a binary tree, return the vertical order traversal of its nodes' values. (i.e., from top to bottom, column by column).
        If two nodes are in the same row and column, the order should be from left to right.

* ### Question6:
      * Given the root of a binary tree, return the maximum width of the given tree.
        The maximum width of a tree is the maximum width among all levels.
        The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes),
        where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that
        level are also counted into the length calculation.It is guaranteed that the answer will in the range of a 32-bit signed integer.

* ### Question7:
      * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
        According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T
        that has both p and q as descendants (where we allow a node to be a descendant of itself).”

* ### Question8:
      * Given the root of a binary tree, collect a tree's nodes as if you were doing this:
        Collect all the leaf nodes.
        Remove all the leaf nodes.
        Repeat until the tree is empty.