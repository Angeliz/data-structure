package expression;

public class Expression {
	public static StringBuffer toPostfix(String infix){
		Stack<String> stack=new SeqStack<String>(infix.length());					//�����ջ��˳��ջ
		StringBuffer postfix=new StringBuffer(infix.length()*2);					//��׺���ʽ�ַ���
		int i=0;
		while(i<infix.length()){
			char ch=infix.charAt(i);
			switch(ch){
			case '+': case'-':														//����+-�����
				while(!stack.isEmpty()&&!stack.peek().equals("(")){					//��ջ��������Ƚ�
					postfix.append(stack.pop());									//��ջ�������ӵ���׺���ʽ
				}
				stack.push(ch+"");													//��ǰ�������ջ
				i++;
				break;
			case '*': case'/':														//����*/�����
				while(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/"))){			
					postfix.append(stack.pop());									//ջ����������ȼ��ߵĳ�ջ
				}
				stack.push(ch+"");													//��ǰ�������ջ
				i++;
				break;
			case '(':																//����������
				stack.push(ch+"");													//��ջ
				i++;
				break;
			case ')':
				String out=stack.pop();
				while(out!=null && !out.equals("(")){								//ֱ��������ջ��Ϊ������
					postfix.append(out);					
					out=stack.pop();															
				}
				i++;
				break;
			default:																//����������ӵ���׺���ʽ֮��
				while(i<infix.length()&&ch>='0'&&ch<'9'){
					postfix.append(ch);
					i++;
					if(i<infix.length()){
						ch=infix.charAt(i);
					}
				}
				postfix.append(" ");												//��ӿո���Ϊ��ֵ֮��ķָ���
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
