package josephus;
import josephus.SinglyList;
public class Josephus {
	int number;
	int start;
	int distance;
	public Josephus(int number,int start,int distance){					//�вι��캯��
		this.number=number;
		this.start=start;
		this.distance=distance;
	}
	public void result(){												//�����������ս���ķ���
		SinglyList<String> list=new SinglyList<String>();               //ʵ�����յĵ�����
		for(int i=0;i<number;i++){										//ָ�����˸��������뵥����
			list.insert(i,(char)('A'+i)+"");
		}
		System.out.println(list.toString());							//���������ɺ�ĵ�����
		int i=start;													//������ʼλ��
		while(list.size()>1){											//����һ��Ԫ��ʱ��ִ�д�ѭ��
			i=(i+distance-1)%list.size();
//			i=i+distance-1;
//			if(i>list.size()-1){
//				i=i-list.size();
//			}
			System.out.print("ɾ��"+list.remove(i).toString()+", ");
			System.out.println(list.toString());
		}
		System.out.println("����������"+list.get(0).toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Josephus text=new Josephus(5,0,2);
		text.result();
	}

}
