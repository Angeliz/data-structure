package expression;

public interface Stack <String>{
	public abstract boolean isEmpty();
	public abstract void push(String x);					//Ԫ����ջ
	public abstract String peek();							//����ջ��Ԫ��
	public abstract String pop();							//��ջ������ջ��Ԫ��
	
}
