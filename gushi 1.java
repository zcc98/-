import java.util.Random;
class gushi1 {
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
	
	
	public static void main(String[] args) {
		short m=0,n=0,ov=0,sum=0;
		char o='+';
		System.out.println("习题如下：");
		for (int i=0;i<50;){
			ov=shengcheng(2);
			m=shengcheng(101);
			n=shengcheng(101);
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
