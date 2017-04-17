/*
   class Node 
       int data;
       Node left;
       Node right;
*/
static int count = 0;
void top_view(Node root)
{
    
    if(root.left!=null && count<=0)
    {
        --count;
        top_view(root.left);
    }
    
    ++count;
    System.out.print(root.data+" ");
    
    if(root.right!=null && count>0)
    {
        ++count;
        top_view(root.right);
    }
}

