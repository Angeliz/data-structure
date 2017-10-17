package binaryTree;

public class BinaryTree {
	public BinaryNode<String> root;
	
	public BinaryTree(){
		this.root=null;
	}
	//�����������prelist����ָ���������������������ȸ���������
	public BinaryTree(String[] prelist){
		this.root=create(prelist);
	}
	private int i=0;
	private BinaryNode<String> create(String[] prelist) {
		// TODO Auto-generated method stub
		BinaryNode<String> p=null;
		if(i<prelist.length){
			String elem=prelist[i];
			i++;
			if(elem!=null){
				p=new BinaryNode<String>(elem);
				p.left=create(prelist);
				p.right=create(prelist);
			}
		}
		return null;
	}
	public boolean isEmpty(){
		return this.root==null;
	}
	public BinaryNode<String> insert(String x){
		return this.root=new BinaryNode<String>(x,this.root,null);
	}
	//��α���
	public void levelorder(){	
		System.out.println("��α�����");
		LinkedQueue que=new LinkedQueue();			//�����ն���
		BinaryNode<String> p=this.root;
		while(p!=null){
			System.out.println(p.data+"");
			if(p.left!=null){
				que.add(p.left);
			}
			if(p.right!=null){
				que.add(p.right);
			}
			p=que.poll();		
		}
		System.out.println();
	}
	//�и�����
	public void inorderTraverse(){
		System.out.println("�и�������");
		LinkedStack stack=new LinkedStack();			//�����ն���
		BinaryNode<String> p=this.root;
		while(p!=null||!stack.isEmpty()){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}
			else{
				System.out.println(stack.pop());
				p=stack.pop();
				p=p.right;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] prelist={"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
		BinaryTree bitree=new BinaryTree(prelist);
		bitree.inorderTraverse();
		bitree.levelorder();
	}

}
