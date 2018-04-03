int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
   
    if(headA==null || headB==null){
        return 0;
    }
    Result res1 = getTailAndSize(headA);
    Result res2 = getTailAndSize(headB);
    
    if(res1.tail!=res2.tail){
        return 0;
    }
    
    Node shorter = res1.size<res2.size?headA:headB;
    Node longer = res1.size<res2.size?headB:headA;

    longer = getKthNode(longer, Math.abs(res1.size-res2.size));
    while(shorter!=longer){
        shorter = shorter.next;
        longer = longer.next;
    }
    return longer.data;
}
class Result{
    public int size;
    public Node tail;
    
    public Result(Node tail, int size){
        this.tail = tail;
        this.size = size;
    }
}
Result getTailAndSize(Node list1){
        if(list1==null){
            return null;
        }
        int size=1;
        Node current = list1;
        while(current.next!=null){
            size++;
            current=current.next;
        }
    return new Result(current, size);
}
Node getKthNode(Node head, int k){
    Node current = head;
    while(k>0 && current!=null){
        current = current.next;
        k--;
    }
    return current;
}
