package hihoÒ»ÏÂ;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

public static void main(String args[]){
		
		Main test=new Main();
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
		if(a1>5000){
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

