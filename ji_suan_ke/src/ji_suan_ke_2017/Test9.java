package ji_suan_ke_2017;

import java.util.Scanner;

public class Test9 {

	public static void main(String args[]){
		Test9 test=new Test9();
		test.start();
	}
	
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		double a=sum/(double)2;
		
		if(a!=(int)a){
			System.out.println(0);
			return;
		}
		long array[]=new long[(int)a+1];
		array[0]=1;
		for(int i=0;i<=num;i++){
			for(int j=(int) a;j>0;j--){
				if(j-i<0)
					continue;
				//涉及到num是否会小于
				array[j]=array[j-i]+array[j];
						
			}
		}
		double b=array[(int)a]/(double)2;
		if(b==(int)b)
			System.out.println(array[(int)a]/2);
	}
	
	
}
