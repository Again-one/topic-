package _8_5;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Main main=new Main();
		main.start();
	}

	private void start() {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int array[]=new int[N];
		
		int min=0;//��С����
		int max=0;
		int size1=0;
		int size2=0;
		for(int i=0;i<N;i++){
			array[i]=scan.nextInt();
		}
		//�����������У�ɾ����̵�����
		for(int i=0;i<array.length;i++){
			//ȷ��һ��ʼ�Ƿ�Ӧ������ü����ġ�
			if(array[i]>array[i]){
				min=;
				max=i;
			}else{
				size++;
			}
		}
		//���ֻ��һ��
		
		//����ж��
		
	}
	
}
