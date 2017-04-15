/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node temp=head;
    int size=0;
    while(temp!=null)
    {
      temp=temp.next;
      ++size;
    }
    for(int i=0;i<size-n-1;++i)
    {
        head=head.next;
    }
    return head.data;

}

