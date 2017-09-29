package expression;

public class SeqStack<String> implements Stack<String> {
	private SeqList<String> list;						//ʹ��˳���洢ջԪ��
	public SeqStack(int length){						//��������Ϊlength�Ŀ�ջ
		this.list=new SeqList<String>(length);			
	}
	public SeqStack(){
		this(64);
	}
	public boolean isEmpty(){							//�ж�ջ�Ƿ�Ϊ��
		return this.list.isEmpyt();
	}
	public void push(String x){							//Ԫ��x��ջ
		this.list.insert(x);							//β����
	}
	public String peek(){								//����ջ��Ԫ��
		return this.list.get(list.size()-1);
	}
	public String pop(){								//��ջ
		return list.remove(list.size()-1);
	}
	
}
