package binaryTree;

public class BinaryNode<String> {
	public  String data;
	public BinaryNode<String> left;
	public BinaryNode<String> right;
	public BinaryNode(String data,BinaryNode<String> left,BinaryNode<String> right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public BinaryNode(String data){
		this(data,null,null);
	}
	public java.lang.String toString(){
		return this.data.toString();
	}
	public boolean isLeaf(){
		return this.left==null&&this.right==null;
	}
}
