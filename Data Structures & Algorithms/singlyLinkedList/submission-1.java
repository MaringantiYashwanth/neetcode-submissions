class LinkedList {

    private ListNode head;
    private ListNode tail;

    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
           this(val, null); 
        } 
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1; // Index out of bounds or list is empty
    }

    public void insertHead(int val) {
       ListNode newNode = new ListNode(val);
       newNode.next = head.next;
       head.next = newNode;
       if (newNode.next == null) {
        // If list was empty before insertion
        tail = newNode;

       } 
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        ListNode curr = this.head;
        int i = 0;
        while (i < index && curr!= null) {
            i++;
            curr= curr.next;
        }
        // remove the node ahead of curr
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;

    }
}
