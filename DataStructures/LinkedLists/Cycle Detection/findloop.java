/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
  Node tortoise = head;
  Node hare = head;
  while(hare!=null)
      {
      tortoise = tortoise.next;
      hare = hare.next.next;
      if(tortoise==hare)
          return true;
      }
    return false;
}

