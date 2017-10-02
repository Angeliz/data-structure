package expression;
import josephus.SinglyList;

public final class LinkedStack<String> implements Stack<String>{
	private SinglyList<String> list;										//ʹ�õ�����洢ջԪ��
	public LinkedStack(){													//�����ջ
		this.list=new SinglyList<String>();									//����յ�����
	}
	public boolean isEmpty(){												//�ж�ջ�Ƿ��
		return this.list.isEmpty();
	}
	public void push(String x){												//��ջ
		this.list.insert(0, x);
	}
	public String peek(){													//��ȡջ��Ԫ��
		return this.list.get(0);
	}
	public String pop(){													//��ջ
		return this.list.remove(0);
	}
}
