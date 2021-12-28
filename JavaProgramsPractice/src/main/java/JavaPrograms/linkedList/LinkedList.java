package JavaPrograms.linkedList;

import java.util.Scanner;

public class LinkedList {

    ListNode listNode, currentNode, listNode1, headNode, linkList;
    Scanner scanner;
    int i ;
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.populate();
        linkedList.print();
    }

    public ListNode populate(){
        System.out.println("Enter Head!");
        scanner = new Scanner(System.in);
        headNode = new ListNode(scanner.nextInt());
        headNode.next = null;
        while (i!=2)
        linkList = insert();
        return linkList;
    }
    public ListNode populate(int i){
        System.out.println("Enter Head!");
        scanner = new Scanner(System.in);
        headNode = new ListNode(scanner.nextInt());
        headNode.next = null;
        while (this.i!=i)
            linkList = insert();
        return linkList;
    }
    public ListNode insert() {
        System.out.println("Enter rest of nodes!");
        listNode = headNode;
        while (listNode.next!= null){
            listNode = listNode.next;
        }
        listNode1 = new ListNode(scanner.nextInt());
        listNode1.next = null;
        listNode.next = listNode1;
        i++;
        return  headNode;
    }

    public void print() {
        currentNode = headNode;
        while (currentNode.next != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.val);
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}