package binaryTree;

public class BinaryTree {
	public BinaryNode<String> root;
	
	public BinaryTree(){
		this.root=null;
	}
	public boolean isEmpty(){
		return this.root==null;
	}
	//����x��Ϊ����㣬ԭ�����Ϊx�����ӣ����ز�����
	public BinaryNode<String> insert(String x){
		return this.root=new BinaryNode<String>(x,this.root,null);
	}
	//����xΪparent������/�Һ��ӣ�leftChildָ�����ӣ�ȡֵΪtrue���󣩡�false���ң�
	//parent��ԭ���Һ��ӳ�Ϊx�������Һ��ӣ����ز�����
	//��x==null�������룬����null����parent==null��Java�׳��ն����쳣
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
