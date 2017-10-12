package binaryTree;

public interface BinaryTree<String> {
	boolean isEmpty();
	int size();
	int height();
	void preorder();
	void inorder();
	void postorder();
	void levelorder();
	BinaryNode<String> insert(String x);
	BinaryNode<String> insert(BinaryNode<String> p,String x,boolean leftChild);
	void remove(BinaryNode<String> parent,boolean leftChild);
	void clear();
	BinaryNode<String> search(String key);
	boolean contains(String key);
	int level(String key);
}
