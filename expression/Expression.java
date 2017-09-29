package expression;

public class Expression {
	public static StringBuffer toPostfix(String infix){
		Stack<String> stack=new SeqStack<String>(infix.length());					//运算符栈，顺序栈
		StringBuffer postfix=new StringBuffer(infix.length()*2);					//后缀表达式字符串
		int i=0;
		while(i<infix.length()){
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
