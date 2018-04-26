/* Reverse doubly linked list function */
Node Reverse(Node head) {
    
    Node forward = head;
    Node newHead = head;
    while(forward != null){
        Node temp = forward.next;
            forward.next = forward.prev;
            forward.prev = temp;
            newHead = forward;
            forward = forward.prev;
    }
    return newHead;
}
