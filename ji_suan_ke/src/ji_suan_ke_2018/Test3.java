package ji_suan_ke_2018;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *��������N������������A1, A2, ... AN�������ѡ������һ��Ai����Ai��ת�������һ����������ɣ�

Ai, Ai+1, Ai+2, ... AN, A1, A2, ..., Ai-1  

����СHiϣ����ת֮����������㣺

��������K(1 �� i �� N)��ǰK��ĺͶ���������  

�������A=[3, -5, 2, -2, 3, 0]����ת��[3, 0, 3, -5, 2, -2]����������  

�������i������Ai��ת����һ������������  

����ж�⣬������������һ��i������޽����-1��

����
��һ�а���һ������N��  

�ڶ��а���N������A1, A2, ... AN��  

����50%�����ݣ�1 �� N �� 1000  

����100%�����ݣ�1 �� N �� 100000, -1000000 �� Ai �� 1000000

���
һ��������ʾ�𰸡�

��������
6  
3 -5 2 -2 3 0
 */
public class Test3 {

	public static void main(String args[]){
		
		Test3 test=new Test3();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int array[]=new int[num];
		ArrayList<Integer> list=new ArrayList<Integer>();
		int max=0;
		int index=0;
		for(int i=0;i<num;i++){
			int a=scan.nextInt();
			max+=a;
			if(max>=1) {
				if((max-a)==0){
					index=i;
				}
			}
			else {
				list.add(max-a);
				list.add(a);
				max=0;
			}
		}
		if(max<0){
			System.out.println(-1);
			return;
		}else{
			for(int i=0;i<list.size();i++){
				max+=list.get(i);
				if(max<=0){
					System.out.println(-1);
					return;
				}
			}
			System.out.println(index+1);
		}
	}
	
}
