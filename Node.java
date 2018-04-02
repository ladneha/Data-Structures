class Node {
     int data;
     Node next;



// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node head) {
    if(head != null){
  Node current = head;
    
    while(current != null){
        System.out.println(current.data);
        current = current.next;
    }
    }
}

boolean hasCycle(Node head) {
     if(head==null){
         return false;
     }
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(fast==slow){
            return true;
        }
    }
    return false;
}


Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
   Node curr = head;
    Node currn = curr.next;
    while(currn != null){
        if(curr.data == currn.data){
            curr.next = currn.next;
            currn = curr.next;
        }else{
            curr = currn;
            currn = curr.next;
        }
    }
    return head;
}

int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node current = head;
    int count = 0;
    while(current.next != null){
        current = current.next;
        count++;
    }
    int num = count-n+1;
    for(int i=1; i<num; i++){
        head=head.next;
    }
    return head.data;
}


Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
   if (headA == null && headB == null) return null;
    else if (headA == null) return headB;
    else if (headB == null) return headA;
    
    if(headA.data <= headB.data)
        headA.next = mergeLists(headA.next, headB);
    else {
        Node temp = headB;
        headB = headB.next;
        temp.next = headA;
        headA = temp;
        headA.next = mergeLists(headA.next, headB);
    }
    return headA;
    

}
void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head != null){
        ReversePrint(head.next);
        System.out.println(head.data);
    }

}

Node Reverse(Node head) {
    if(head == null || head.next==null){
        return head;
    }else{
        Node remaining = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return remaining;
    }

}

Node Delete(Node head, int position) {
  // Complete this method
   if(head != null){
    if(position == 0){
      head = head.next;
    }
       else{
           Node curr = head;
           int count = 0;
           while(count < position-1){
               curr = curr.next;
               count++;
           }
           curr.next = curr.next.next;
          
       }
   }
 return head;
}

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
    
    Node n = new Node();
    n.data = data;
    Node current = head;
    if(head == null){
         n.next = null;
         n = head;
        return n;
    }
    if(position == 0){
        n.next = head;
        head = n;
        return head;
    }else{
        int cnt = 0;
        while(cnt<position-1 && head.next != null){
            current = current.next;
            cnt++;
        }
        n.next = current.next;
        current.next = n;
        return head;
    }   
}

Node InsertTail(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node n = new Node();
    n.data = data;
    n.next = null;
    Node current = head;
    while(current.next != null){
        current = current.next;
    }
    current.next = n;
  return head;
}

Node InsertHead(Node head,int x) {
    Node n = new Node();
    n.data = x;
    n.next = head;
    head = n;
 return head;   
}

s



}
