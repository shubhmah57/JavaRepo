package JavaPrograms.DataStructures.LinkedList;


import java.util.HashMap;
import java.util.Map;

public class LinkedListImpl {
    Node headNode = null;
    Node tailNode = null;

    class Node{
        Node next;
        int data;
        Node(int i){
            data = i;
            next = null;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,13,14};
        int []b = {6,7,8,9,10,11,12};
        LinkedListImpl list1 = new LinkedListImpl();
        for(int p: a){
            list1.addElement(p);
        }
        LinkedListImpl list2 = new LinkedListImpl();
        for(int p: b){
            list2.addElement(p);
        }
        System.out.println("-------List1--------");
        list1.traverseList();
        System.out.println();
        System.out.println("-------List2--------");
        list2.traverseList();
        //list1.findMid();
        mergeList(list1,list2);


    }

    private void findMid() {
        Node traverseNode = headNode;
        int length =0;
        Map<Integer, Integer> listMap= new HashMap<>();
        while (traverseNode!=null){
            listMap.put(length,traverseNode.data);
            length = length+1;
            traverseNode = traverseNode.next;
        }
        int mid = length/2;
        System.out.println("The mid:" + listMap.get(mid));
    }

    private void traverseList() {
        Node traverseNode = headNode;
        System.out.println("The elements are:");
        while(traverseNode!=null){
            System.out.print(traverseNode.data + " ");
            traverseNode = traverseNode.next;
        }
    }

    private Node findGreatest(Node headNode) {
        int max = Integer.MIN_VALUE;
        Node greatestNode = headNode;
        Node finalNode = null;
        while (greatestNode!= null){
            if(greatestNode.data< 0 && Math.abs(greatestNode.data) %2 ==0){
                if(max < greatestNode.data){
                    max = greatestNode.data;
                    finalNode = greatestNode;
                }
            }
            greatestNode = greatestNode.next;
        }
        return finalNode;
    }

    public  void addElement(int i){
      Node node = new Node(i);
      if(headNode == null){
          headNode = node;
      }
      else{
          tailNode.next = node;
      }
        tailNode = node;
    }

    public static void mergeList(LinkedListImpl list1, LinkedListImpl list2){



    }
}
