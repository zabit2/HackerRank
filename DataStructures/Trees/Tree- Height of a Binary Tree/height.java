	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        
        int leftHeight = 0;
        int rightHeight = 0;
        
        if(root.left!=null)
            leftHeight = 1+height(root.left);
        if(root.right!=null)
            rightHeight = 1+height(root.right);
        
        return leftHeight>rightHeight?leftHeight:rightHeight;
    }

