import java.util.Random;
class jisuan {
	private static short shengcheng(int i) {
		// ���������
		Random random=new Random();
		short s=(short)random.nextInt(i);
		return s;
	}

	private static void shuchusuanshi(int i,short m,char o,short n){
		//�����ʽ
		System.out.println("��"+(i+1)+"��:\t"+m+o+n+"=");
	}
	
	private static void shuchujieguo(int i,int a){
		//������
		System.out.println("��"+(i+1)+"����:\t"+a);
	}
	
	public static void main(String[] args) {
		short m=0,n=0,ov=0,sum=0;
		char o='+';
		int a[]=new int[50];
		System.out.println("ϰ�����£�");
		for (int i=0;i<50;){
			ov=shengcheng(2);
			m=shengcheng(101);
			int x=101-m;             //����m+n��100����
			n=shengcheng(x);
			if(m-n>=0){              //����m-n��С��0
				if(ov==1){                
					o='+';
					sum=(short) (m+n);
				}
				else {
					o='-';
					sum=(short) (m-n);
				}
			a[i]=sum;
			//�����ʽ
			shuchusuanshi(i,m,o,n);
			//������
			shuchujieguo(i,a[i]);
			i++;
			}
		}

	}

}
