package ji_suan_ke_2018_3;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String args[]){
		
		Test10 test=new Test10();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		long dp[][]=new long[n+1][m+1];
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(i==1||j==1){
					dp[i][j]=1;
				}else if(j>i){
					dp[i][j]=dp[i][i];
				}else if(i==j){
					dp[i][j]=dp[i][j-1]+1;
				}else if(i>j){
					dp[i][j]=dp[i][j-1]+dp[i-j][j];
				}
			}
		}
		
	}
	public int sort(int m,int n){
		if(n==1||m==0) return 1;
		if(n>m) return sort(m,m);
		return sort(m,n-1)+sort(m-n,n);
	}
}
