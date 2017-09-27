package expression;

public class SeqList<String> extends Object {
	protected Object[] element; 									//��������洢˳��������Ԫ�أ�������Ա
	protected int n;												//˳���Ԫ�ظ��������ȣ�
	public SeqList(int length){										//���쳤��Ϊlength�Ŀձ�
		this.element=new Object[length];							//��������洢�ռ䣬Ԫ��Ϊnull
		this.n=0;													
	}
	public SeqList(){												//�޲ι���
		this(64);													//������һ�����췽��
	}
	public SeqList(String[] values){
		this(values.length);
		for(int i=0;i<values.length;i++){							//��������Ԫ��
			this.element[i]=values[i];
		}
		this.n=element.length;
	}
	
	public boolean isEmpyt(){										//�ж��б��Ƿ�Ϊ��
		return this.n==0;
	}
	public int size(){												//˳���Ԫ�ظ���
		return this.n;
	}
	public String get(int i){										//��ȡ��i��Ԫ�أ����±�Խ�磬����null
		if(i>=00&&i<this.n){
			return (String)this.element[i];
		}
		return null;
	}
	
}
