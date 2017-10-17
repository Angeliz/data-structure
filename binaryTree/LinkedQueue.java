package binaryTree;

public class LinkedQueue {
	private Node<BinaryNode<String>> front,rear;
	public LinkedQueue(){
		this.front=this.rear=null;
	}
	public boolean isEmpty(){
		return this.front==null&&this.rear==null;
	}
	public boolean add(BinaryNode<String> x){
		if(x==null){
			return false;
		}
		Node<BinaryNode<String>> q=new Node<BinaryNode<String>>(x,null);
		if(this.front==null){
			this.front=q;
		}
		else{
			this.rear.next=q;
		}
		this.rear=q;
		return true;
	}
	public BinaryNode<String> poll(){
		if(isEmpty()){
			return null;
		}
		BinaryNode<String> x=this.front.data;
		this.front=this.front.next;
		if(this.front==null){
			this.rear=null;
		}
		return x;
	}
}
