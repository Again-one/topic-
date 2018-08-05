package hihoÒ»ÏÂ;

import java.util.Scanner;

//http://hihocoder.com/contest/offers51/problem/3
public class Test4 {
	Scanner scan=new Scanner(System.in);
	public static void main(String args[]){
		Test4 test=new Test4();
		test.start();
	}
	public void start(){
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++){
			array[i]=scan.nextInt();
		}
		circle(array,m);
		
	}
	public void circle(int array[],int m){
		int array2[]=new int[array.length];
		
		int max=0;
		int t=1;
		int sub=0;;
		array2[0]=1;
		for(int i=1;i<array.length;i++){
			
			int first=array[i]-array[i-1];
			if(sub==first){
				t++;
			}else{
				sub=first;
				t=2;
			}
			if(t>max){
				max=t;
			}
			array2[i]=t;
		}
		for(int i=0;i<m;i++){
			int lo=scan.nextInt();
			int high=scan.nextInt();
			int max2=0;
			int isSub=0;
			for(int j=lo-1;j<high;j++){
				
				if(array2[j]==2) isSub=1;
				if(isSub==0){
					int d=array2[j]-array2[lo-1]+1;
					if(max2<d){
						max2=d;
					}
				}else{
					if(max2<array2[j]){
						max2=array2[j];
						
					}
				}
					
				
			}
			System.out.println(max2);
		}
		
		
		
	}
}
