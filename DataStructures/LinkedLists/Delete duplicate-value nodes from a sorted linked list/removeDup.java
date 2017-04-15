/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
  Node headTracer = head;
  while(head.next!=null)
  {
      Node nextNode = head.next;
      if(head.data==nextNode.data)
      {
          head.next=nextNode.next;
      }
      else
      {
        head=head.next;    
      }
   }
   return headTracer;
}

