package JavaPrograms.DataStructures.BST;

public class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data){
        this.data = data;
        left = right=null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
