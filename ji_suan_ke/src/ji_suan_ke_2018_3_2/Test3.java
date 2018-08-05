package ji_suan_ke_2018_3_2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String args[]) {
		
		Test3 test=new Test3();
		test.start();
		
	}
	public void start() {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
			for(int j=i;j>0;j--){
				if(array[j]<array[j-1]){
					sum++;
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					
				}
			}
		}
		System.out.println(sum);
		
		
	}
}
