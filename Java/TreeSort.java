import java.util.*;
public class TreeSort {	
	public static void main(String args[]) {
		Random r=new Random();
		ArrayList<Integer> arr = new ArrayList(10);
		for (int i=0;i<10;i++) {
			arr.add(r.nextInt(30));}
		System.out.println(arr);
		Tree t = new Tree();
		t.treeins(arr);
		t.inorderRec(t.root);
		//ReUnderstand tree stuff later
	}
}
class Tree{
	class Node{
		int key;
		Node left, right;
		public Node(int key) {
			this.key=key;
			left=right=null;
		}
	}
	Node root;
	Tree(){
		root = null;
	}
	void insert(int key) {
		root=insertRec(root,key);
	}
	Node insertRec(Node root, int key) {
		if (root ==null) {
			root = new Node(key);
			return root;
		}
		if(key <root.key) root.left=insertRec(root.left, key);
		else if (key > root.key) root.right = insertRec(root.right, key);
		return root;
	}	
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	void treeins(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size();i++) {
			insert(arr.get(i));
		}
	}
}
