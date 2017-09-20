package josephus;

public class SinglyList<String>{
	public String data;							 //数据域
	public SinglyList<String> next;				 //地址域
	public SinglyList(String data,SinglyList<String> next){  //构造结点
		this.data=data;
		this.next=next;
	}
	public SinglyList<String> head;               //头指针
	//构造函数
	public SinglyList(){                          //构造空单链表
		this.head=new SinglyList<String> ();      //创造头结点，data和next的值均为null
	}
	
	public SinglyList(String[] values){           //构造单链表，values数组提供元素
		this();                                   //创建空单链表，只有头结点(调用无参构造方法)
		SinglyList<String> rear=this.head;		  //rear指向单链表最后一个结点
		for(int i=0;i<values.length;i++){
			rear.next=new SinglyList<String>(values[i],null); //尾插入
			rear=rear.next;						  //指向新的链尾结点
		}
	}
	public boolean isEmpty(){
		return this.head.next==null;
	}
	//存储
}
