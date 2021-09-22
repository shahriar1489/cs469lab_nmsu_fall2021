class Node{
	Node right; 
	Node left; 
	Node parent; 
	int key; 
}

class BSTree{
	Node root; 
	
	public BSTree() {
		root = null; 
	}
	
	public BSTree(int[] A){
		root =null; 
		
		for(int i =0; i < A.length; i++) {
			// insert each element into tree
			// call insert(i)
			insert(A[i]); 
		}

	}

	/*
	public void insert(int n) {
		Node new_node = new Node(); 
		root
		
		new_node.key = n; 
		new_node.right = null; 
		new_node.left = null; 
		new_node.parent = null; 
		
		if(root == null) {
			root = new_node; 
		}
	
		if(root.key > new_node.key) {
			if(root.left == null) {
				root.left = new_node; 
			}
			insert(n, )
		}
	
	}*/
	
	public void insert(int n) { // iterative function
		Node new_node = new Node(); 
		//root
		
		new_node.key = n; 
		new_node.right = null; 
		new_node.left = null; 
		new_node.parent = null; 
		
		Node x = root; 
		Node y = null; 
		
		while(x!=null) {
			y = x; 
			if(new_node.key < x.key) {
				x = x.left; 
			}
			else {
				x = x.right; 
			}
		}
		
		new_node.parent = y; 
	
		if(y==null) {
			root = new_node; 
		}
		
		else if(new_node.key <= y.key) {
			y.left = new_node; 
		}
		else {
			y.right = new_node; 
		}
	
	}
	
	public Node get_left_node(Node n) {
		return n.left; 
	}
	
	public Node get_right_node(Node n) {
		return n.right; 
	}
	
	public Node get_parent_node(Node n){
		return n.parent; 
	}
	
	public Node get_current_node(Node n) {
		return n; 
	}
	
	public Node get_root() {
		return root; 
	}
	
	public void in_order(Node x){
		// sequence b, a, c
		if(x!= null) {
			in_order(x.left); 
			System.out.print(x.key + " "); 
			in_order(x.right); 
		}
	}
	
	public void pre_order(Node x){
		// sequence a, b, c
		if(x!=null) {
			System.out.print(x.key + " "); 
			pre_order(x.left); 
			pre_order(x.right); 
		}
	}
	
	public void post_order(Node x) {
		// sequence b, c, a
		if(x!=null) {
			post_order(x.left); 
			post_order(x.right); 
			System.out.print(x.key + " "); 
		}
		//System.out.println(); 
	}
	
	
}


public class binarySearchTree {
	public static void main(String[] args) {
	
		int[] A =  {5, 3, 7, 2, 6};
		
		BSTree ob = new BSTree(A); 
		
		
		System.out.println("\t\tIN : "); 
		ob.in_order(ob.get_root());
		
		System.out.println("\n\t\tPRE :");
		ob.pre_order(ob.get_root());
		
		System.out.println("\n\t\tPOST : ");
		ob.post_order(ob.get_root());
	
		ob.insert(10); 
		System.out.println("\nAdded 10 to tree : "); 
		
		System.out.println("\t\tIN : "); 
		ob.in_order(ob.get_root());
		
		System.out.println("\n\t\tPRE : ");
		ob.pre_order(ob.get_root());
		
		System.out.println("\n\t\tPOST : ");
		ob.post_order(ob.get_root());
		
		
		ob.insert(1); 
		System.out.println("\nAdded 1 to tree : "); 
		System.out.println( ); 
		//ob.in_order(ob.get_root());
		System.out.println("\n\t\tIN :");
		ob.in_order(ob.get_root());
		//System.out.println("\n\t\tPRE :");
		
		System.out.println("\n\t\tPRE :");
		ob.pre_order(ob.get_root());
		System.out.println("\n\t\tPOST : ");
		ob.post_order(ob.get_root());
		
	}
}
