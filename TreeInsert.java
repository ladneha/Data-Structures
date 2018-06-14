static Node Insert(Node root,int value) {
   Node newNode = new Node();
    newNode.data = value;
    if(root == null){
        return newNode;
    }
    Node curr = root;
    while(curr != null){
        if(value<curr.data){
            if(curr.left == null){
                curr.left = newNode;
                break;
            }
            curr = curr.left;
        }else{
            if(curr.right == null){
                curr.right = newNode;
                break;
            }
            curr = curr.right;
        }
    }
    	return root;
    }