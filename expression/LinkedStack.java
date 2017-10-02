package expression;
import josephus.SinglyList;

public final class LinkedStack<String> implements Stack<String>{
	private SinglyList<String> list;										//使用单链表存储栈元素
	public LinkedStack(){													//构造空栈
		this.list=new SinglyList<String>();									//构造空单链表
	}
	public boolean isEmpty(){												//判断栈是否空
		return this.list.isEmpty();
	}
	public void push(String x){												//入栈
		this.list.insert(0, x);
	}
	public String peek(){													//获取栈顶元素
		return this.list.get(0);
	}
	public String pop(){													//出栈
		return this.list.remove(0);
	}
}
