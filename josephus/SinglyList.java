package josephus;

public class SinglyList<String>{
	public SinglyList<String> head;               //头指针
	//构造函数
	public SinglyList(){                          //构造空单链表
		this.head=new SinglyList<String> ();      //创造头结点，data和next的值均为null
	}
	public SinglyList(String[] values){           //构造单链表，values数组提供元素
		this();                                   //创建空单链表，只有头结点(调用无参构造方法)
		SinglyList<String> rear=this.head;		  //rear指向单链表最后一个结点
		for(int i=0;i<values.length;i++){
//			rear.next=new SinglyList<String>(values[i],null);
		}
	}
}
