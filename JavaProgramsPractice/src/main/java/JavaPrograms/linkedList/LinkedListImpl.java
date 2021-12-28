package JavaPrograms.linkedList;

public class LinkedListImpl {

    LinkedList listNode1;
    ListNode l1, l2, l3, l4;

    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListImpl();
        linkedListImpl.populateLists();
        linkedListImpl.print(linkedListImpl.merge());
    }

    protected void populateLists() {
        System.out.println("Enter First LinkList");
        listNode1 = new LinkedList();
        l1 = listNode1.populate(2);
        System.out.println("Print Started");
        listNode1.print();
        System.out.println("Enter Second LinkList");
        listNode1 = new LinkedList();
        l2 = listNode1.populate(1);
        System.out.println("Print Started II ");
        listNode1.print();
    }

    protected ListNode merge() {
        l3 = new ListNode(0);
        l4 = l3;
        while (l1 != null && l2!=null) {
            if (l1 != null && l1.val < l2.val) {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
                l3 = l3.next;
            } else {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        if(l2 == null && null!=l1){
            l3.next=l1;
        }
        else if(null == l1 && null!= l2){
            l3.next= l2;
        }
        return l4.next;
    }

    protected void print(ListNode l4) {
        System.out.println("Merged List");
        while (l4!= null) {
            System.out.println(l4.val);
            l4 = l4.next;
        }
    }
}
