package binaryTree;

public class LinkedStack {
	private SinglyList list;										//ʹ�õ�����洢ջԪ��
	public LinkedStack(){													//�����ջ
		this.list=new SinglyList();									//����յ�����
	}
	public boolean isEmpty(){												//�ж�ջ�Ƿ��
		return this.list.isEmpty();
	}
	public void push(BinaryNode<String> x){												//��ջ
		this.list.insert(0, x);
	}
	public BinaryNode<String> peek(){													//��ȡջ��Ԫ��
		return this.list.get(0);
	}
	public BinaryNode<String> pop(){													//��ջ
		return this.list.remove(0);
	}
}
