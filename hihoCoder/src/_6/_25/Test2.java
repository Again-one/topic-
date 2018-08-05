package _6._25;

import java.util.Scanner;

/**
 * 
时间限制:40000ms
单点时限:2000ms
内存限制:256MB

描述

给定一个长度为 n 的非负整数序列 a[1..n]。

你每次可以花费 1 的代价给某个 a[i] 加1或者减1。

求最少需要多少代价能将这个序列变成一个不上升序列。
输入

第一行一个正整数 n。

接下来 n 行每行一个非负整数，第 i 行表示 a[i]。

1 ≤ n ≤ 500000

0 < a[i] ≤ 109
输出

一个非负整数，表示答案。
样例解释

[5,3,4,5] -> [5,4,4,4]


样例输入

    4
    5
    3
    4
    5

样例输出

    2


 * @author d
 *
 */

public class Test2 {
	static int array[];
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		array=new int[num];
		
		for(int i=0;i<array.length;i++){
			
			array[i]=scan.nextInt();
			
		}
	
		
		
		
	}
	int max=Integer.MAX_VALUE;
	public void recursion(int index,int num){
		
		if(index==array.length){
			
			max=num>max ? max=num : max;
			
		}
		if(index<array.length-1){
			
			if(array[index]>array[index+1]){
				int d=array[index]-array[index+1];
				if(d==2){
					num++;
					array[index]-=1;
					recursion(index,num);
					array[index]+=1;
				}else{
					if(d>2)return;
				}
			}else{
				
				int d=array[index+1]-array[index];
				if(d==2){
					num++;
					array[index]+=1;
					recursion(index,num);
					array[index]-=1;
				}else{
					if(d>2)return;
					
				}
			}
		}else{
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
