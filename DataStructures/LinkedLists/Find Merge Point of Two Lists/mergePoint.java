/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node a = headA;
    while(a!=null)
    {
        Node b = headB;
        while(b!=null)
        {
            if(a==b)
                return a.data;
            b=b.next;
        }
        a=a.next;
    }
    return 0;
}

