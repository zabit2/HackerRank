   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       Queue<Node> myQueue = new LinkedList<Node>();
       Node current;
       if(root!=null)
       {
         myQueue.add(root);
         while(myQueue.peek()!=null)
         {
             current = (Node)myQueue.poll();
             System.out.print(current.data+" ");
             if(current.left!=null)
                 myQueue.add(current.left);
             if(current.right!=null)
                 myQueue.add(current.right);
         }
       }
       
       
       
       
    }

