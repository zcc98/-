import java.util.Random;
class gushi3 {
	static int b[]=new int[50];
	static int c[]=new int[50];
	private static short shengcheng(int i) {
		// 生成随机数
		Random random=new Random();
		short s=(short)random.nextInt(i);
		return s;
	}

	private static void shuchusuanshi(int i,short m,char o,short n){
		//输出算式
		System.out.println("第"+(i+1)+"题:\t"+m+o+n+"=");
	}


	private static int bijiao(int a){
		int i;
		for(i=0;i<50;i++){
			if(a==b[i]){
				a=shengcheng(101);
				bijiao(a);
				break;
			}
		}
		return a;
	}
	
	private static int bijiao1(int a){
		int i;
		for(i=0;i<50;i++){
			if(a==c[i]){
				a=shengcheng(101);
				bijiao1(a);
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		short m=0,n=0,ov=0,sum=0;
		char o='+';
		int a[]=new int[50];
		System.out.println("习题如下：");
		for (int i=0;i<50;){
			ov=shengcheng(2);
			m=shengcheng(101);
			b[i]=bijiao(m);
			n=shengcheng(101);
			c[i]=bijiao1(n);
			if(ov==1){                
				o='+';
			}
			else {
				o='-';
			}
			//输出算式
			shuchusuanshi(i,m,o,n);
			i++;
		}

	}

}
