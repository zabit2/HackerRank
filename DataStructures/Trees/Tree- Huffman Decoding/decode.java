/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
{
    Node current = root;
    for(int i=0;i<S.length();++i)
    {
        if(S.charAt(i)=='1')
            current=current.right;
        else
            current=current.left;
        if(current.left==null && current.right==null)
            {
                System.out.print(current.data);
                current = root;
            }
    }
}


