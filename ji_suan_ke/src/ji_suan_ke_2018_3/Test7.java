package ji_suan_ke_2018_3;

import java.util.Scanner;

public class Test7 {

	public static void main(String args[]){
		
		Test7 test=new Test7();
		test.start();
		
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
		}
		for(int i=0;i<n-1;i++){
			int is1=Math.abs(array[i]-array[i+1]);
			System.out.println(is1);
			if(is1==1){
				if(array[i+1]>array[i]){
					array[i+1]=array[i];
					
				}
				sum++;
			}
			
		}
		System.out.println(sum);
		
	}
	
}
