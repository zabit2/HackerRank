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
    Set<Integer> mySet = new HashSet<Integer>();
    while(a!=null)
    {
        mySet.add(a.data);
        a=a.next;
    }
    Node b = headB;
    while(b!=null)
    {
        if(mySet.contains(b.data))
            return b.data;
        b=b.next;
    }
    return 0;
}

