package expression;

public class SeqStack<String> implements Stack<String> {
	private SeqList<String> list;						//使用顺序表存储栈元素
	public SeqStack(int length){						//构造容量为length的空栈
		this.list=new SeqList<String>(length);			
	}
	public SeqStack(){
		this(64);
	}
	public boolean isEmpty(){							//判断栈是否为空
		return this.list.isEmpyt();
	}
	public void push(String x){							//元素x入栈
		this.list.insert(x);							//尾插入
	}
	public String peek(){								//返回栈顶元素
		return this.list.get(list.size()-1);
	}
	public String pop(){								//出栈
		return list.remove(list.size()-1);
	}
	
}
