package expression;

public interface Stack <String>{
	public abstract boolean isEmpty();
	public abstract void push(String x);					//元素入栈
	public abstract String peek();							//返回栈顶元素
	public abstract String pop();							//出栈，返回栈顶元素
	
}
