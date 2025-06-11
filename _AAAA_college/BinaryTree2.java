package _AAAA_college;

public class BinaryTree2 {
    static class Node 
    {
        int data;
        Node root;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    static Node createBST(Node root, int val)
    {
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=createBST(root.left, val);
        }
        else{
            root.right=createBST(root.right, val);
        }
        return root;
    }
    static void inOrder(Node root)
    {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void printLeaf(Node root)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        System.out.print(root.data+" ");
        printLeaf(root.left);
        printLeaf(root.right);
    }

    public static void main(String[] args){
        int[] node = {30,55,77,-50,22,99};
        Node root=null;
        for(int i =0; i<node.length;i++){
            root=createBST(root, node[i]);

        }
        System.out.println("Done!");
        printLeaf(root);
        System.out.println();
        System.out.println("inorder ");
        inOrder(root);
    }
    
}
