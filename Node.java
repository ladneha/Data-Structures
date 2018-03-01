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