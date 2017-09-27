package expression;

public class SeqList<String> extends Object {
	protected Object[] element; 									//对象数组存储顺序表的数据元素，保护成员
	protected int n;												//顺序表元素个数（长度）
	public SeqList(int length){										//构造长度为length的空表
		this.element=new Object[length];							//申请数组存储空间，元素为null
		this.n=0;													
	}
	public SeqList(){												//无参构造
		this(64);													//调用上一个构造方法
	}
	public SeqList(String[] values){
		this(values.length);
		for(int i=0;i<values.length;i++){							//复制数组元素
			this.element[i]=values[i];
		}
		this.n=element.length;
	}
	
	public boolean isEmpyt(){										//判断列表是否为空
		return this.n==0;
	}
	public int size(){												//顺序表元素个数
		return this.n;
	}
	public String get(int i){										//获取第i个元素，若下标越界，返回null
		if(i>=00&&i<this.n){
			return (String)this.element[i];
		}
		return null;
	}
	
}
