/**
 * BinaryTree_Implementation
 */
/*remember 1 preorder 2 inorder 3 postorder gate smasher */
public class BinaryTree_Implementation_Using_Recursion {

    public TreeNode root;
    class TreeNode{
        int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = five;
    }

    public void recursive_preOrder(TreeNode root){
        if(root == null){
            //base casw
            return;
        }
        //since it is recursive no loop will come
        System.out.print(root.data+" ");
        recursive_preOrder(root.left);
        recursive_preOrder(root.right);
    }

    public void recursive_inOrder(TreeNode root){
        if(root == null)
        {
            return; //base case
        }
        recursive_inOrder(root.left);
        System.out.print(root.data+" ");
        recursive_inOrder(root.right);
    }

    public void recursive_postOrder(TreeNode root){
        if(root == null){
            return; //base case
        }
        recursive_postOrder(root.left);
        recursive_postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {
        BinaryTree_Implementation_Using_Recursion bt = new BinaryTree_Implementation_Using_Recursion();
        bt.createBinaryTree();
        System.out.print("preorder:");
        bt.recursive_preOrder(bt.root);
        System.out.println();
        System.out.print("inorder:");
        bt.recursive_inOrder(bt.root);
        System.out.println();
        System.out.print("postorder:");
        bt.recursive_postOrder(bt.root);
    }
}