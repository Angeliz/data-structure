package josephus;

public class SinglyList<String>{
	public SinglyList<String> head;               //ͷָ��
	//���캯��
	public SinglyList(){                          //����յ�����
		this.head=new SinglyList<String> ();      //����ͷ��㣬data��next��ֵ��Ϊnull
	}
	public SinglyList(String[] values){           //���쵥����values�����ṩԪ��
		this();                                   //�����յ�����ֻ��ͷ���(�����޲ι��췽��)
		SinglyList<String> rear=this.head;		  //rearָ���������һ�����
		for(int i=0;i<values.length;i++){
//			rear.next=new SinglyList<String>(values[i],null);
		}
	}
}
