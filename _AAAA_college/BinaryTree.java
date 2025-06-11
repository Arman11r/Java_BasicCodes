package _AAAA_college;

public class BinaryTree 
{
    static class Node 
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    static int index=-1;
    static Node createbinaryTree(int []node)
    {
        index++;
        if(index==node.length)
        return null;
        
        if(node[index]==-1)
        return null;
        
        Node newNode=new Node(node[index]);
        System.out.print(newNode.data+" ");
        newNode.left=createbinaryTree(node); 
         newNode.right=createbinaryTree(node);
                  return newNode;
    }
    static void printParent(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null || root.right!=null)
        System.out.print(root.data+" ");
        printParent(root.left);
        printParent(root.right);
    }
    static void printsibling(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null && root.right!=null)
        System.out.print(root.left.data+" "+root.right.data+" ");
        printsibling(root.left);
        printsibling(root.right);
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
    static void printchild(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null) 
        System.out.print(root.left.data+" ");
        if(root.right!=null)
        System.out.print(root.right.data+" ");
        printchild(root.left);
        printchild(root.right);
    } 



   
    
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		int []node={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        System.out.println("tree created");
		Node root=tree.createbinaryTree(node);
		System.out.println();
		System.out.println("print parents node");
		printParent(root);
			System.out.println();
		System.out.println("print sibling node");
	 printsibling(root);
	 System.out.println();
		System.out.println("print Leaf node");
	 printLeaf(root);
	  System.out.println();
		System.out.println("print child node");
	 printchild(root);
		
	}
}

    
    

