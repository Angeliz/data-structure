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
	
	public static int toValue(StringBuffer postfix){								//计算后缀表达式的值
		Stack<Integer> stack=new LinkedStack<Integer>();							//操作数栈，链式栈
		int value=0;
		for(int i=0;i<postfix.length();i++){										//遍历后缀表达式中的字符
			char ch=postfix.charAt(i);
			if(ch>='0' && ch<='9'){													//遇到数字字符
				value=0;
				while(ch!=' '){														//将整数字符串转换为整数值
					value=value*10+ch-'0';
					ch=postfix.charAt(++i);
				}
				stack.push(value);													//整数对象入栈
			}
			else{
				if(ch!=' '){
					int y=stack.pop();												//出栈两个操作符，注意出栈次序
					int x=stack.pop();
					switch(ch){
						case'+': value=x+y; break;
						case'-': value=x-y; break;
						case'*': value=x*y; break;
						case'/': value=x/y; break;
					}
					System.out.print(x+(ch+"")+y+"="+value+",");					//显示运算过程
					stack.push(value);												//运算结果入栈
				}
			}
		}
		return stack.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix="123+10*(45-50+20)/((35-25)*2+10)-11";
		StringBuffer postfix=toPostfix(infix);
		System.out.println("\ninfix="+infix+"\npostfix="+postfix+"\nvalue="+toValue(postfix));
	}

}
