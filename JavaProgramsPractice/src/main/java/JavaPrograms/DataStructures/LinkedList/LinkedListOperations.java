package JavaPrograms.DataStructures.LinkedList;

public class LinkedListOperations {
    Node head=null;
    Node pointer = null;

    public Node populateList(int []a){
            for(int i =0; i<a.length;i++){
                Node node = new Node(a[i]);
                if(head==null){
                    head=node;
                }
                else {
                    pointer.next=node;
                }
                pointer = node;
            }
            return head;
    }

    public static void printList(Node head){
        while (head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
