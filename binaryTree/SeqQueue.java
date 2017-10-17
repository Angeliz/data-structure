package binaryTree;

public class SeqQueue<String> {
	private Object element[];
	private int front,rear;
	public SeqQueue(int length){
		if(length<64){
			length=64;
		}
		this.element=new Object[length];
		this.front=this.rear=0;
	}
	public SeqQueue(){
		this(64);
	}
	public boolean isEmpty(){
		return this.front==this.rear;
	}
	public boolean add(String x){
		if(x==null){
			return false;
		}
		if(this.front==(this.rear+1)%this.element.length){						//若队列满，则扩充数组
			Object[] temp=this.element;
			this.element=new Object[temp.length*2];
			int j=0;
			for(int i=this.front; i!=this.rear; i=(i+1)%temp.length){
				this.element[j++]=temp[i];
			}
			this.front=0;
			this.rear=j;
		}
		this.element[this.rear]=x;
		this.rear=(this.rear+1)%this.element.length;
		return true;
	}
	public String peek(){
		return this.isEmpty()?null:(String)this.element[this.front];
	}
	public String poll(){
		if(this.isEmpty()){
			return null;
		}
		String temp =(String)this.element[this.front];
		this.front=(this.front+1)%this.element.length;
		return temp;
	}
}
