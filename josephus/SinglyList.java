package josephus;

public class SinglyList<String> extends Object{
	public String data;							 //数据域
	public SinglyList<String> next;				 //地址域
	public SinglyList<String> head;               //头指针
	
	public SinglyList(String data,SinglyList<String> next){  //构造结点
		this.data=data;
		this.next=next;
	}
	
	//构造函数
	public SinglyList(){                          //构造空单链表
		this.head=new SinglyList<String> (null,null);		      //创造头结点，data和next的值均为null	
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
	//存取
	public String get(int i){					  //返回第i个元素，若i越界，则返回null
		SinglyList<String> p=this.head.next;	  
		for(int j=0;p!=null&&j<i;j++){			  //遍历单链表，返回第i个元素
			p=p.next;
		}
		return (i>=0 && p!=null)?p.data:null;
	}
	public void set(int i,String x){
		
	}
	public int size(){
		SinglyList<String> p=head;
		int n=0;
		while(p!=null){
			n++;
			p=p.next;
		}
		return n;
	}
	
	//覆盖Object类的toString方法
	public java.lang.String toString(){
		java.lang.String str="(";
		for(SinglyList<String> p=this.head.next; p!=null; p=p.next){
			str=str+p.data.toString();
			if(p.next!=null){
				str+=",";
			}
		}
		return str+")";
	}
	
	
	//插入
	public SinglyList<String> insert(int i,String x){
		if(x==null){
			throw new NullPointerException("x==null");      //抛出空对象异常
		}
		SinglyList<String> front=this.head;					//指向头结点
		for(int j=0;(front.next!=null)&&j<i;j++){
			front=front.next;
		}
		front.next=new SinglyList<String>(x,front.next);
		return front.next;
	}
	public SinglyList<String> insert(String x){
		return insert(Integer.MAX_VALUE,x);
	}
	
	//删除
	public String remove(int i){							//删除第i个元素，若i越界，则返回null
		SinglyList<String> front=this.head;
		for(int j=0;front.next!=null&&j<i;j++){
			front=front.next;
		}
		if(i>=0&&front.next!=null){
			String old=front.next.data;
			front.next=front.next.next;
			return old;
		}
		return null;
	}
}
