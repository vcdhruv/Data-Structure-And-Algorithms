import java.util.Stack;

public class Implement_Binary_searchTree{
    public BinaryTreeNode root;
    public class BinaryTreeNode{
        public int data;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int data){
            this.data = data;
        }
    }

    public void insertInBinaryTreeNode(int data){
        BinaryTreeNode newNode = new BinaryTreeNode(data);
        if(root == null){
            root = newNode;
        }
        else{

        BinaryTreeNode temp = root , parent = null;
        while(temp !=  null){
            parent = temp;
            if(data > temp.data){
                temp = temp.right ;
            }
            else{
                temp = temp.left ;
            }
        }
        if(data > parent.data){
            parent.right = newNode;
        }
        else{
            parent.left = newNode;
        }
    }
    }

    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<BinaryTreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            BinaryTreeNode current;
            current = st.pop();
            System.out.print(current.data + " ");
            //since stack is used so first in preorder left will come and than right but we have to first right right because LIFO
            if (current.right != null) {
                st.push(current.right);
            }
            if (current.left != null) {
                st.push(current.left);
            }
        }
    }


    public static void main(String[] args) {
        Implement_Binary_searchTree bst = new Implement_Binary_searchTree();
        bst.insertInBinaryTreeNode(10);
        bst.insertInBinaryTreeNode(-5);
        bst.insertInBinaryTreeNode(-8);
        bst.insertInBinaryTreeNode(7);
        bst.insertInBinaryTreeNode(6);
        bst.insertInBinaryTreeNode(16);
        bst.insertInBinaryTreeNode(18);
        bst.preOrder();
    }
}