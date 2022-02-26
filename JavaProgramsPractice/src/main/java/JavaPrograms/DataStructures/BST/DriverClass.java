package JavaPrograms.DataStructures.BST;

public class DriverClass {


    public static void main(String[] args) {
        TreeNode rootNode =null;
        int a[] = {50,30,20,40,70,60,80};
        DriverClass driverClass = new DriverClass();
        for( int i: a)
          rootNode=  driverClass.addNodesToTree(rootNode, i);
        driverClass.inorderRec(rootNode);
        System.out.println();
        System.out.println("Height:" + driverClass.height(rootNode));

    }

    void inorderRec(TreeNode root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }


    private TreeNode addNodesToTree(TreeNode rootNode, int a) {
            if(rootNode ==null){
                rootNode = new TreeNode(a);
                return rootNode;
            }

            if(a> rootNode.data){
                rootNode.right = addNodesToTree(rootNode.right,a);
            }
            if(a< rootNode.data){
                rootNode.left = addNodesToTree(rootNode.left,a);
            }

            return rootNode;
    }

    private int height(TreeNode treeNode){
        if (treeNode==null){
            return 0;
        }
        int left = height(treeNode.left);
        int right = height(treeNode.right);
        if(left>right){
            return left+1;
        }
        else {
            return right+1;
        }
    }
}
