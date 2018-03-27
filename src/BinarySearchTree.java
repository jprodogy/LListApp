import javafx.scene.Node;

public class BinarySearchTree {
    private TreeNode root;

    public class TreeNode{
        private int value;
        private LinkedList.Node right;
        private LinkedList.Node left;

        public TreeNode(int v){
            value = v;
            left = null;
            right = null;
        }
    }

    public BinarySearchTree(int v){
        root = new TreeNode(v);
    }

    
}
