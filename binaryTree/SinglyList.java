package binaryTree;


public class SinglyList {
	public BinaryNode<String> data;													    //������
	public SinglyList next;				 							//��ַ��
	public SinglyList head;               							//ͷָ��
	
	public SinglyList(BinaryNode<String> x,SinglyList next){  				//������
		this.data=x;
		this.next=next;
	}
	
	//���캯��
	public SinglyList(){                          							//����յ�����
		this.head=new SinglyList (null,null);		      			//����ͷ��㣬data��next��ֵ��Ϊnull	
	}
	
	public boolean isEmpty(){
		return this.head.next==null;
	}
	//ȡ��Ԫ��
	public BinaryNode<String> get(int i){					  							//���ص�i��Ԫ�أ���iԽ�磬�򷵻�null
		SinglyList p=this.head.next;	  
		for(int j=0;p!=null&&j<i;j++){			  							//���������������ص�i��Ԫ��
			p=p.next;
		}
		return (i>=0 && p!=null)?p.data:null;
	}
	
	//����size
	public int size(){
		SinglyList p=head;											//pָ��ͷ���
		int n=0;								
		while(p!=null){														//ͨ����������
			n++;
			p=p.next;
		}
		return n-1;															//�����һ��nullҲ���ȥ�����Լ�һ
	}
	
	//����Object���toString����
	public java.lang.String toString(){
		java.lang.String str="(";
		for(SinglyList p=this.head.next; p!=null; p=p.next){		//����������
			str=str+p.data.toString();
			if(p.next!=null){
				str+=",";													//�������һ���ڵ�ʱ�ӷָ���
			}
		}
		return str+")";
	}
	
	
	//����
	public SinglyList insert(int i,BinaryNode<String> x){
		if(x==null){
			throw new NullPointerException("x==null");      				//�׳��ն����쳣
		}
		SinglyList front=this.head;									//ָ��ͷ���
		for(int j=0;(front.next!=null)&&j<i;j++){
			front=front.next;
		}
		front.next=new SinglyList(x,front.next);
		return front.next;
	}
	public SinglyList insert(BinaryNode<String> x){
		return insert(Integer.MAX_VALUE,x);
	}
	
	//ɾ��
	public BinaryNode<String> remove(int i){											//ɾ����i��Ԫ�أ���iԽ�磬�򷵻�null
		SinglyList front=this.head;									//ָ��ͷ���
		for(int j=0;front.next!=null&&j<i;j++){								//����Ѱ��i-1�����
			front=front.next;
		}
		if(i>=0&&front.next!=null){											//��front�ĺ�̽ڵ���ڣ���ɾ��
			BinaryNode<String> old=front.next.data;
			front.next=front.next.next;
			return old;
		}
		return null;
	}
}