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

Node SortedInsert(Node head,int data) {
  
    
    if(head==null)
    {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }
        
    Node temp=head;
    while(head!=null)
    {
        if(head.data>=data)
        {
            Node newNode1 = new Node();
            newNode1.data = data;
            newNode1.prev=head.prev;
            newNode1.next=head;
            if(head.prev==null)
                return newNode1;
            else
            {
                head.prev.next=newNode1;
                head.prev=newNode1;
                return temp;
            }
                
        }
        if(head.next==null)
        {
            Node newNode2 = new Node();
            newNode2.data = data;
            head.next=newNode2;
            newNode2.next=null;
            newNode2.prev=head;
            break;
        }
        head=head.next;
    }
    
    
    return temp;
  
}

