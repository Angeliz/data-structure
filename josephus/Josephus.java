package josephus;
import josephus.SinglyList;
public class Josephus {
	int number;
	int start;
	int distance;
	public Josephus(int number,int start,int distance){					//有参构造函数
		this.number=number;
		this.start=start;
		this.distance=distance;
	}
	public void result(){												//用来计算最终结果的方法
		SinglyList<String> list=new SinglyList<String>();               //实例化空的单链表
		for(int i=0;i<number;i++){										//指定犯人个数并插入单链表
			list.insert(i,(char)('A'+i)+"");
		}
		System.out.println(list.toString());							//输出插入完成后的单链表
		int i=start;													//计数起始位置
		while(list.size()>1){											//多于一个元素时，执行此循环
			i=(i+distance-1)%list.size();
//			i=i+distance-1;
//			if(i>list.size()-1){
//				i=i-list.size();
//			}
			System.out.print("删除"+list.remove(i).toString()+", ");
			System.out.println(list.toString());
		}
		System.out.println("被赦免者是"+list.get(0).toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Josephus text=new Josephus(5,0,2);
		text.result();
	}

}
