package JavaPrograms.DataStructures.LinkedList;

import JavaPrograms.collections.HashingBasedDS.HashMapPractice;

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
        int[] a = {5,-12,1,43,51};
        LinkedListImpl list1 = new LinkedListImpl();
        for(int p: a){
            list1.addElement(p);
        }
        list1.traverseList();

        list1.findMid();

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
        while(traverseNode!=null){

            traverseNode = traverseNode.next;
        }
        System.out.println(findGreatest(headNode).data);
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
}
