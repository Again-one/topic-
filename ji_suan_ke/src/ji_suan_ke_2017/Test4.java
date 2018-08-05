package ji_suan_ke_2017;

import java.util.Arrays;
import java.util.Scanner;
//https://nanti.jisuanke.com/t/94
//·ÖÒ±
public class Test4 {
	public static void main(String args[]){
		
		Test4 test4=new Test4();
		test4.start();
		
	}
	
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int arrayM[]=new int[m];
		for(int i=0;i<m;i++){
			arrayM[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		int arrayN[]=new int[n];
		for(int i=0;i<n;i++){
			arrayN[i]=scan.nextInt();
		}
		int num=m+n;
		int array[]=new int[num];
		int k1=0,k2=0;
		for(int i=0;i<num;i++){
			
			if(k1>=m) array[i]=arrayN[k2++];
			else if(k2>=n) array[i]=arrayM[k1++];
			else if(arrayM[k1]>arrayN[k2]) array[i]=arrayN[k2++];
			else array[i]=arrayM[k1++];
			
		}
		double t = 0;
		if(num%2==0){
			
			
			int main=array[num/2]+array[(num-1)/2];
			
			t=main/2d;
			
		}else{
			
			t=array[num/2];
		}
		System.out.printf("%.5f",t);
	}
	
}
