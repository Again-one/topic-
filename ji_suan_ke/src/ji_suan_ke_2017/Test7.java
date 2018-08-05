package ji_suan_ke_2017;

import java.util.Scanner;

public class Test7 {
	int sum=0;
	public static void main(String ars[]){
		
		Test7 test=new Test7();
		test.start();
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int value[]={1,2};
		int array[]=new int[num+1];
		for(int i=0;i<num;i++){
			for(int j=0;j<value.length;j++){
				if(i+value[j]>num)
					continue;
				array[i+value[j]]+=array[i];
				array[i+value[j]]++;
			}
		}
		System.out.println(array[num]);
		
	}
	
}
