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
		
		int min=0;//最小索引
		int max=0;
		int size1=0;
		int size2=0;
		for(int i=0;i<N;i++){
			array[i]=scan.nextInt();
		}
		//在两条序列中，删除最短的那条
		for(int i=0;i<array.length;i++){
			//确定一开始是否应该是嘴该减掉的。
			if(array[i]>array[i]){
				min=;
				max=i;
			}else{
				size++;
			}
		}
		//如果只有一段
		
		//如果有多段
		
	}
	
}
