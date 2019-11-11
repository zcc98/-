import java.util.Random;
class gushi2 {
	private static short shengcheng(int i) {
		// 生成随机数
		Random random=new Random();
		short s=(short)random.nextInt(i);
		return s;
	}

	private static void shuchusuanshi(int i,short m,char o,short n,int a){
		//输出算式和结果
		int x=i+1;
		if(x%5==0){
			System.out.println("第"+(i+1)+"题:"+m+o+n+"="+a+"\t");
		}
		else System.out.print("第"+(i+1)+"题:"+m+o+n+"="+a+"\t");
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
			//输出算式和结果
			shuchusuanshi(i,m,o,n,a[i]);
			i++;
			}
		}

	}

}
