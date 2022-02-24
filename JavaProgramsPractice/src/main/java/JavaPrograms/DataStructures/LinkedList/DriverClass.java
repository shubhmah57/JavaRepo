package JavaPrograms.DataStructures.LinkedList;

public class DriverClass {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,12,13,14};
        int [] b = {6,7,8,9,10};
        LinkedListOperations list1 = new LinkedListOperations();
        LinkedListOperations list2 = new LinkedListOperations();
        Node head =  list1.populateList(a);
        Node head1 = list2.populateList(b);
        Node mergedHead = merge2Lists(head1,head);
        LinkedListOperations.printList(mergedHead);
    }

    public static Node merge2Lists(Node L1, Node L2){

        Node dummyNode = new Node(0);
        Node pointer = dummyNode;
        while (L1!=null && L2!=null){
            if(L1.data<=L2.data){
                pointer.next=L1;
                L1 = L1.next;
            }
            else {
                pointer.next= L2;
                L2 = L2.next;
            }
            pointer = pointer.next;
        }

        if(L1!=null){
            pointer.next =L1;
        }
        if(L2!=null){
            pointer.next=L2;
        }
        return dummyNode.next;
    }

}
