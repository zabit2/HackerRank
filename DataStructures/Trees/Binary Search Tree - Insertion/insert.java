 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
       if(root==null)
       {
           Node newNode = new Node();
           newNode.data = value;
           newNode.left = null;
           newNode.right = null;
           root = newNode;
       }
    
       if(value<root.data)
           root.left=Insert(root.left,value);
       if(value>root.data)
           root.right=Insert(root.right,value);
       
     return root;
    }



