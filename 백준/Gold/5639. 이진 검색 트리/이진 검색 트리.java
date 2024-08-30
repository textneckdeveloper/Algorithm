import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    
    static class TreeNode {
        Comparable key;
        TreeNode left, right;
        
        TreeNode(Comparable newKey) {
            key = newKey;
            left = right = null;
        }
        
        TreeNode(Comparable newKey, TreeNode leftChild, TreeNode rightChild) {
            key = newKey;
            left = leftChild;
            right = rightChild;
        }
    }
    
    static class BinarySearchTree {
        private TreeNode root;
        private PrintWriter pw;
        
        BinarySearchTree() {
            root = null;
        }
        
        public void insert(Comparable newKey) {
            root = insertItem(root, newKey);
        }
        private TreeNode insertItem(TreeNode tNode, Comparable newKey) {
            if (tNode == null) {
                tNode = new TreeNode(newKey);
            }
            else {
                if (newKey.compareTo(tNode.key) < 0) {
                    tNode.left = insertItem(tNode.left, newKey);
                }
                else {
                    tNode.right = insertItem(tNode.right, newKey);
                }
            }
            return tNode;
        }
        
        public void postOrder(TreeNode tNode, PrintWriter pw) {
            if (tNode != null) {
                postOrder(tNode.left, pw);
                postOrder(tNode.right, pw);
                pw.print(tNode.key + "\n");
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        BinarySearchTree bst = new BinarySearchTree();
        
        while (true) {
            try {
                int val = Integer.parseInt(br.readLine());
                bst.insert(val);
            } catch (NumberFormatException e) {
                break;
            }
        }
        
        bst.postOrder(bst.root, pw);
        
        pw.flush();
        br.close();
        pw.close();
    }
}