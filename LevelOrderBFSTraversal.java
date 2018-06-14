void levelOrder(Node root) {
      if(root==null){
          return;
      }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            root = q.poll();
            System.out.print(root.data+" ");
            if(root.left!=null){
                q.add(root.left);
            }
            if(root.right != null){
                q.add(root.right);
            }
        } 
    }