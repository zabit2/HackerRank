Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  Node newNode = new Node();
  Node headNode = head;
  newNode.data = data;
    
  while(head.next!=null)
  {
      head=head.next;
  }
  head.next = newNode;
  newNode.next = null;
  return headNode;
}
