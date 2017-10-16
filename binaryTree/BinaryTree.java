package binaryTree;

public class BinaryTree {
	public BinaryNode<String> root;
	
	public BinaryTree(){
		this.root=null;
	}
	public boolean isEmpty(){
		return this.root==null;
	}
	//插入x作为根结点，原根结点为x的左孩子；返回插入结点
	public BinaryNode<String> insert(String x){
		return this.root=new BinaryNode<String>(x,this.root,null);
	}
	//插入x为parent结点的左/右孩子，leftChild指定孩子，取值为true（左）、false（右）
	//parent的原左右孩子成为x结点的左右孩子；返回插入结点
	//若x==null，不插入，返回null；若parent==null，Java抛出空对象异常
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
