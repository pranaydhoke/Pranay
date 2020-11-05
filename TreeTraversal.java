package com.pranay;

public class TreeTraversal {
	public TreeTraversal() {
		root=null;	
	}
	Node1 root;
	public static void main(String[] args) {
		TreeTraversal binaryTree=new TreeTraversal();
		binaryTree.root=new Node1(1);
		binaryTree.root.left=new Node1(2);
		binaryTree.root.right=new Node1(3);
		binaryTree.root.left.left=new Node1(4);
		binaryTree.root.left.right=new Node1(5);		
		binaryTree.root.right.left=new Node1(6);
		binaryTree.root.right.right=new Node1(7);
		
		System.out.println("the elements inbinart tree is"+binaryTree.toString());
		
		 System.out.println("Inorder traversal of binary tree is "); 
		 binaryTree.Inorder();
		 
		 System.out.println("postorder traversal of binary tree is "); 
		 binaryTree.postOrder();
	}
	private void postOrder() {
		printPostOrder(root);
		
	}
	private void printPostOrder(Node1 node) {
		
		if(node==null)
			return;
		printPostOrder(node.right);	
		System.out.println("key is"+node.key+"");
		printPostOrder(node.left);
	}
	private void Inorder() {
		 printInorder(root);
		
	}
	private void printInorder(Node1 node) {
		if(node ==null)
			return ;
		printInorder(node.left);
		System.out.println("key is"+node.key+""	);
		printInorder(node.right);
		
	}

	
}
class Node1
{
	int key;	
	Node1 left,right;
	
	public Node1(int item)
	{
		key=item;
		left=right=null;
	}
}