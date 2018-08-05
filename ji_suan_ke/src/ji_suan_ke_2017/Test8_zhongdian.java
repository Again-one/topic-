package ji_suan_ke_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Test8_zhongdian {

	public static void main(String args[]){
		
		Test8_zhongdian test=new Test8_zhongdian();
		test.start();
		
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int value[]=new int[num];
		Arrays.fill(value, 9999999);
		int array[]=new int[num];
		for(int i=0;i<num;i++){
			array[i]=scan.nextInt();
		}
		value[0]=0;
		for(int i=0;i<num;i++){
			for(int j=1;j<=array[i];j++){
				if(i+j>=num)
					continue;
				value[i+j]=Math.min(value[i+j],value[i]+1);
				System.out.println(i+"+"+j+"="+value[i+j]);
			}
			
		}
		System.out.println(value[num-1]);
		
		
	}
	
}
