package ji_suan_ke_2018;

import java.util.Scanner;

//https://nanti.jisuanke.com/t/48
public class Test4 {
	
	public static void main(String args[]){
		
		Main test=new Main();
		test.start();
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n+1];
		int sum[]=new int[n+1];
		int gain[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			
			array[i]=scan.nextInt();
			sum[i]+=sum[i-1]+array[i];
			gain[i][i]=array[i];
		}
		for(int i=n-1;i<array.length&&i>0;i--){
			
			for(int j=i;j<array.length;j++){
				gain[i][j]=sum[j]-sum[i-1]-Math.min(gain[i+1][j], gain[i][j-1]);
			}
			
		}
		System.out.println(gain[1][n]+" "+(sum[n]-gain[1][n]));
		
		
	}

}
/*
 * 有如下一个双人游戏：N个正整数的序列放在一个游戏平台上，两人轮流从序列的两端取数，每次有数字被一个玩家取走后，这个数字被从序列中去掉并累加到取走该数的玩家的得分中，当数取尽时，游戏结束。以最终得分多者为胜。

编一个执行最优策略的程序，最优策略就是使自己能得到在当前情况下最大的可能的总分的策略。你的程序要始终为两位玩家执行最优策略。

输入第1行包括一个正整数N（2≤N≤100）, 表示序列中正整数的个数。输入第2行包含用空格分隔的N个正整数（1≤所有正整数≤200）。

只有一行，用空格分隔的两个整数: 依次为先取数玩家和后取数玩家的最终得分。

样例输入
6 
4 7 2 9 5 2
样例输出
18 11*/
