package binaryTree;

public class BinaryTree {
	public BinaryNode<String> root;
	
	public BinaryTree(){
		this.root=null;
	}
	//构造二叉树，prelist数组指定二叉树标明空子树的先根遍历序列
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
		return p;
	}
	
	public boolean isEmpty(){
		return this.root==null;
	}
	public BinaryNode<String> insert(String x){
		return this.root=new BinaryNode<String>(x,this.root,null);
	}
	//层次遍历
	public void levelorder(){	
		System.out.print("层次遍历：");
		LinkedQueue que=new LinkedQueue();			//创建空队列
		BinaryNode<String> p=this.root;
		while(p!=null){
			System.out.print(p.data+" ");
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
	//中根遍历
	public void inorderTraverse(){
		System.out.print("中根遍历：");
		LinkedStack stack=new LinkedStack();			//创建空队列
		BinaryNode<String> p=this.root;
		while(p!=null||!stack.isEmpty()){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}
			else{
				p=stack.pop();
				System.out.print(p+" ");
				
				p=p.right;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] prelist={"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
		BinaryTree bitree=new BinaryTree(prelist);
//		System.out.println(bitree.root);
		bitree.levelorder();
		bitree.inorderTraverse();
		
	}

}
