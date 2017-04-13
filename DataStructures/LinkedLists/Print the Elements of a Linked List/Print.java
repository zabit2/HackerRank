void Print(Node head) {
  if(head==null)
      return;
    else
    {
        System.out.println(head.data);
        Print(head.next);
    }
}
