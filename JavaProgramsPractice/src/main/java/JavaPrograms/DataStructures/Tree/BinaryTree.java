package JavaPrograms.DataStructures.Tree;

import JavaPrograms.inheritancePractice.TypeVisibility.package2.B;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    Node root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(100);
        bt.root.left = new Node(90);
        bt.root.right= new Node(110);
        bt.root.left.left= new Node(80);
        bt.root.left.right= new Node(95);

    }


}
