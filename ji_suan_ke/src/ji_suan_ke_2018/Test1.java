package ji_suan_ke_2018;

import java.util.Scanner;
/*
 * 好题
 * http://www.cnblogs.com/kangjianwei101/p/5332451.html
 */
public class Test1 {

	public static void main(String[] args) {
		
		Test1 test=new Test1();
		test.start();
		
	}
	public void start(){
		//首先确定分为两个相等的子集
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double sum=(double)(n*(n+1))/4;
		if(sum!=(int)sum){
			System.out.println(0);
			return;
		}
		int a=(int)(sum+1);
		long array[][]=new long[n+1][a];
		array[0][0]=1;
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				if(i>j){
					array[i][j]=array[i-1][j];
				}else{
					if(i<=j){
						array[i][j]=array[i-1][j]+array[i-1][j-i];
					}
				}
				
			}
		}
		if(array[n][a-1]%2==0)
		System.out.println(array[n][a-1]/2);
		else
			System.out.println(0);
	}
	
}
