package JavaPrograms.DataStructures.LinkedList;

import java.util.Scanner;

public class CircularList {

    public static void main(String[] args) {

        System.out.println("Enter Numbers");
        Node headNode = new Node(null,1);
        Node circularNode = populateCircularList(headNode);
        circularNode.next=headNode;
        int key =9;
       // deleteCircuLarList(circularNode, key);

    }

    private static  void deleteCircuLarList(Node circularNode) {

    }

    private static Node populateCircularList(Node headNode) {
        for(int i =0; i <5;i++) {
            System.out.println("Enter Value");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            Node newNode = new Node(null,value);
            if(headNode.next==null){
                headNode.next = newNode;
            }
        }
        return headNode;
    }

}
