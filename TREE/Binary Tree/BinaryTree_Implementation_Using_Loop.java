import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree_Implementation_Using_Loop {
    public TreeNode root;

    public class TreeNode { 
        public int data;
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
        TreeNode fifth = new TreeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode current;
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

    public void inOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        while (!st.isEmpty() || current != null) {
            if(current != null){
                st.push(current);
                current = current.left;
            }
            else{
                current = st.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }

    public void postOrder(){
        if (root == null) {
            return;
        }
        TreeNode current = root;
        Stack<TreeNode> st = new Stack<>();
            while (current != null || !st.isEmpty()) {
                if(current != null){
                    st.push(current);
                    current = current.left;
                }
                else{
                    TreeNode temp = st.peek().right;
                    if(temp == null){
                        temp = st.pop();
                        System.out.print(temp.data+" ");
                        while (!st.isEmpty() && temp == st.peek().right) {
                            temp = st.pop();
                            System.out.print(temp.data + " ");
                        }
                    }
                    else
                    {
                        current = temp;
                    }
                }
            }
    }

    /**
     * 
     */
    public void maxValueInTree(){
        if(root == null){
            return;
        }
        else{
            Stack<TreeNode> st = new Stack<>();
            TreeNode temp = root;
            int maxData = temp.data;
            int data;
            while (!st.isEmpty() || temp!=null) {
                if (temp!=null) {
                    st.push(temp);
                    temp = temp.left;
                } else {
                    temp = st.pop();
                    data = temp.data;
                    if(data > maxData){
                        maxData = data;
                    } 
                    temp = temp.right;
                }
            }
            System.out.print("Maximum data of given tree is:"+maxData);
        }
    }

    public void levelOrderTree(){
        // so we here we need to use queue as we want first in first out
        if(root == null){
            System.out.print("Tree is empty");
        }
        else{
            TreeNode temp = root;
            Queue<TreeNode> queue = new LinkedList<>(); //these is how queue class is created
            System.out.print("level wise list of tree is:");
            queue.offer(temp); //offer = psuh in queue class
            while (!queue.isEmpty()) {
                temp = queue.poll();    //in queue class pop = poll
                System.out.print(temp.data + " ");
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree_Implementation_Using_Loop bt = new BinaryTree_Implementation_Using_Loop();
        bt.createBinaryTree();
        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
        System.out.println();
        bt.maxValueInTree();
        System.out.println();
        bt.levelOrderTree();
    }
}
