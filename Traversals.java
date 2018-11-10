class Node
{
	int key;
	Node left,right;

	public Node(int item)
	{
		key = item;
		left=right=null;

	}
}

class Traversals
{
	Node root;

	Traversals()
	{
		root=null;
	}

	void inorder(Node node)
	{
		if(node == null)
			return;

		inorder(node.left);
		System.out.print(node.key+" ");
		inorder(node.right);
	}

	void preorder(Node node)
	{
		if(node == null)
			return ;
		System.out.print(node.key+" ");
		preorder(node.left);
		preorder(node.right);


	}

	void postorder(Node node)
	{
		if(node == null)
			return ;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.key+" ");
	}

	void postorder(){ postorder(root); }
	void inorder(){ inorder(root); }
	void preorder(){ preorder(root); }

	public static void main(String[] args) {
		Traversals tree = new Traversals();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		System.out.println("Preorder");
		tree.preorder();

		System.out.println("Inorder");
		tree.inorder();

		System.out.println("PostOrder");
		tree.postorder();
	
	
	}
}