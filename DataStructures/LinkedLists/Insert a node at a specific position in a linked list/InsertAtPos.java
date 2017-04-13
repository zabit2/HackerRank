/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
    Node nodeToInsert = new Node();
    nodeToInsert.data = data;
    Node headTracer = head;
    
        if(head==null)
        return nodeToInsert;
    
        if(position==0)
        {
            nodeToInsert.next=head;
            return nodeToInsert;
        }
    
        int pos=0;
        while(++pos<position)
        {
            head=head.next;
        }
    
        nodeToInsert.next = head.next;
        head.next = nodeToInsert;
        return headTracer;
        
    }

