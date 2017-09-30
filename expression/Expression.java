package expression;

public class Expression {
	public static StringBuffer toPostfix(String infix){
		Stack<String> stack=new SeqStack<String>(infix.length());					//运算符栈，顺序栈
		StringBuffer postfix=new StringBuffer(infix.length()*2);					//后缀表达式字符串
		int i=0;
		while(i<infix.length()){
			char ch=infix.charAt(i);
			switch(ch){
			case '+': case'-':														//遇到+-运算符
				while(!stack.isEmpty()&&!stack.peek().equals("(")){					//与栈顶运算符比较
					postfix.append(stack.pop());									//出栈运算符添加到后缀表达式
				}
				stack.push(ch+"");													//当前运算符入栈
				i++;
				break;
			case '*': case'/':														//遇到*/运算符
				while(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/"))){			
					postfix.append(stack.pop());									//栈顶运算符优先级高的出栈
				}
				stack.push(ch+"");													//当前运算符入栈
				i++;
				break;
			case '(':																//遇到左括号
				stack.push(ch+"");													//入栈
				i++;
				break;
			case ')':
				String out=stack.pop();
				while(out!=null && !out.equals("(")){								//直到遇到出栈符为左括号
					postfix.append(out);					
					out=stack.pop();															
				}
				i++;
				break;
			default:																//遇到数字添加到后缀表达式之后
				while(i<infix.length()&&ch>='0'&&ch<'9'){
					postfix.append(ch);
					i++;
					if(i<infix.length()){
						ch=infix.charAt(i);
					}
				}
				postfix.append(" ");												//添加空格作为数值之间的分隔符
			}
		}
		while(!stack.isEmpty()){
			postfix.append(stack.pop());
		}
		return postfix;
	}
	
	public static int toValue(StringBuffer postfix){
		Stack<Integer> stack=new LinkedStack<Integer>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
