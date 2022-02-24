package JavaPrograms.DataStructures.LinkedList;

public class Node {

    Node next;
    int data;
    Node(int i){
        data = i;
        next = null;
    }
    Node(int data, Node node){
        this.data = data;
        this.next = node;
    }

}
