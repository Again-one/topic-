package hiho一下;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 给定一个十进制小数X，判断X的二进制表示是否是有限确定的。

例如0.5的二进制表示是0.1，0.75的二进制表示是0.11，0.3没有确定有限的二进制表示。
输入

第一行包含一个整数 T (1 ≤ T ≤ 10)，表示测试数据的组数。

以下T行每行包含一个十进制小数 X (0 < X < 1)。 X一定是以"0."开头，小数部分不超过100位。
输出

对于每组输入，输出 X 的二进制表示或者NO(如果 X 没有确定有限的二进制表示）。
 * @author d
 *
 */
public class Test157 {

	public static void main(String args[]){
		
		Test157 test=new Test157();
		test.start();
		
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		for(int i=0;i<num;i++){
			
			calculate(new BigDecimal(scan.next()),0);
			if(result.equals("NO")){
				System.out.println(result);
			}else
			System.out.println("0."+result.substring(1));
			result="";
			
		}
		
	}
	String result="";
	public void calculate(BigDecimal a,int a1){
		if(a1>1000){
			result="NO";
			return;
		}
		if(a.compareTo(BigDecimal.ZERO)==0){
			return;
		}
		if(a.compareTo(BigDecimal.ONE)>=0){
			a=a.subtract(BigDecimal.ONE);
			result+=1;
		}else{
			result+=0;
		}
		calculate(a.multiply(BigDecimal.valueOf(2)),++a1);
		
	}
}
