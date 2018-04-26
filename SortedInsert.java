/* Insert into sorted order in a doubly linked list */

Node SortedInsert(Node head,int data) {
     
    Node n = new Node();
    n.data = data;
    if (head == null) {
        return n;
    }
    else if (data <= head.data) {
        n.next = head;
        head.prev = n;
        return n;
    }
    else {
        Node rest = SortedInsert(head.next, data);
        head.next = rest;
        rest.prev = head;
        return head;
    }
}
