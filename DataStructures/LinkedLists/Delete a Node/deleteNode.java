/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node headTracer = head;
    if(head==null)
        return null;
    if(position==0)
    {
        head=head.next;
        return head;
    }
    int pos=0;
    while(++pos<position)
    {
       head = head.next; 
    }
    head.next=head.next.next;
    return headTracer;
}


