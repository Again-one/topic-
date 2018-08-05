package ji_suan_ke_2017;

import java.util.Arrays;
import java.util.Scanner;
//https://nanti.jisuanke.com/t/27
public class Test5 {
	
	public static void main(String args[]){
		
		Test5 test=new Test5();
		test.start();
		
	}
	
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int count=0;//¼ÇÂ¼×ÜÊı
		int num=scan.nextInt();
		int array[]=new int[num];
		int a=0,b=0,c=0;
		
		for(int i=0;i<num;i++){
			array[i]=scan.nextInt();
			if(array[i]==1)
				a++;
			else if(array[i]==2)
				b++;
			else 
				c++;
				
		}
		for(int i=0;i<a;i++){
			if(array[i]!=1)
				count++;
		}
		int b1=0,c1=0;
		for(int i=a;i<a+b;i++){
			if(array[i]!=2&&array[i]!=1)
				b1++;
		}
		for(int i=a+b;i<a+b+c;i++){
			if(array[i]!=3&&array[i]!=1)
				c1++;
		}
		
		System.out.println(count+Math.max(b1, c1));
		
		
	}
	
	
}
