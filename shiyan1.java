import java.util.Random;
class jisuan {
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
	
	private static void shuchujieguo(int i,int a){
		//输出结果
		System.out.println("第"+(i+1)+"题结果:\t"+a);
	}
	
	public static void main(String[] args) {
		short m=0,n=0,ov=0,sum=0;
		char o='+';
		int a[]=new int[50];
		System.out.println("习题如下：");
		for (int i=0;i<50;){
			ov=shengcheng(2);
			m=shengcheng(101);
			int x=101-m;             //限制m+n在100以内
			n=shengcheng(x);
			if(m-n>=0){              //限制m-n不小于0
				if(ov==1){                
					o='+';
					sum=(short) (m+n);
				}
				else {
					o='-';
					sum=(short) (m-n);
				}
			a[i]=sum;
			//输出算式
			shuchusuanshi(i,m,o,n);
			//输出结果
			shuchujieguo(i,a[i]);
			i++;
			}
		}

	}

}
