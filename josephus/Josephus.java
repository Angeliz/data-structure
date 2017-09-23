package josephus;
import josephus.SinglyList;
public class Josephus {
	int number;
	int start;
	int distance;
	public Josephus(int number,int start,int distance){
		this.number=number;
		this.start=start;
		this.distance=distance;
	}
	public void result(){
		SinglyList<String> list=new SinglyList<String>();             //ʵ�����յĵ�����
		for(int i=0;i<number;i++){
			list.insert(i,(char)('A'+i)+"");
		}
		System.out.println(list.toString());
		int i=start;
		while(list.size()>1){
			i=(i+distance-1)%list.size();
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
