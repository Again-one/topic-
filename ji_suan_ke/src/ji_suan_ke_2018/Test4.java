package ji_suan_ke_2018;

import java.util.Scanner;

//https://nanti.jisuanke.com/t/48
public class Test4 {
	
	public static void main(String args[]){
		
		Main test=new Main();
		test.start();
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n+1];
		int sum[]=new int[n+1];
		int gain[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			
			array[i]=scan.nextInt();
			sum[i]+=sum[i-1]+array[i];
			gain[i][i]=array[i];
		}
		for(int i=n-1;i<array.length&&i>0;i--){
			
			for(int j=i;j<array.length;j++){
				gain[i][j]=sum[j]-sum[i-1]-Math.min(gain[i+1][j], gain[i][j-1]);
			}
			
		}
		System.out.println(gain[1][n]+" "+(sum[n]-gain[1][n]));
		
		
	}

}
/*
 * ������һ��˫����Ϸ��N�������������з���һ����Ϸƽ̨�ϣ��������������е�����ȡ����ÿ�������ֱ�һ�����ȡ�ߺ�������ֱ���������ȥ�����ۼӵ�ȡ�߸�������ҵĵ÷��У�����ȡ��ʱ����Ϸ�����������յ÷ֶ���Ϊʤ��

��һ��ִ�����Ų��Եĳ������Ų��Ծ���ʹ�Լ��ܵõ��ڵ�ǰ��������Ŀ��ܵ��ֵܷĲ��ԡ���ĳ���Ҫʼ��Ϊ��λ���ִ�����Ų��ԡ�

�����1�а���һ��������N��2��N��100��, ��ʾ�������������ĸ����������2�а����ÿո�ָ���N����������1��������������200����

ֻ��һ�У��ÿո�ָ�����������: ����Ϊ��ȡ����Һͺ�ȡ����ҵ����յ÷֡�

��������
6 
4 7 2 9 5 2
�������
18 11*/
