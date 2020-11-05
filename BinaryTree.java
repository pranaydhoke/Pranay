package com.pranay;

public class BinaryTree {
	public static void main(String[] args) {
		
	}

}
class Node{
	public Node(int i) {
		this.value=i;
	}
	int value;
	Node left=null;
	Node right=null;
}
class Tree{
	Node root=null;
	
	public Tree(int val) {
		Node node=new Node(val);
	}
	
	public void insert(int val)
	{
		if(val < root.value)
		{
			if(root.left ==null)
			{
			Node node=new Node(val);
			}
			else
			{
				revursiveInsert(root.left,val);
			}
		}
		else
		{
			if(val >root.value)
			{	
			 root.right= new Node(val);
			}
			else
			{
				revursiveInsert(root.right, val);
			}
		}
	}

	private void revursiveInsert(Node n, int val) {
		if(val<n.value)
		{
			if(n.left == null)
			{	
				n.left=new Node(val);
			}
			else
			{
				revursiveInsert(n.left,val);
			}
		}
		else
		{
			if(val >n.value)
			{
				if(n.right ==null)
				{
					n.right=new Node(val);
				}
				else
				{
					revursiveInsert(n.right, val);
				}
			}
		}
		
	}
}
