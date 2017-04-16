/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {

    Node current = head;
    Node newHead=null;
    while(current!=null)
    {
        Node prev = current.prev;
        current.prev=current.next;
        current.next=prev;
        newHead = current;
        current=current.prev;
    }
    return newHead;
    
}

