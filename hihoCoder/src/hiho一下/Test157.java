package hihoһ��;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * ����һ��ʮ����С��X���ж�X�Ķ����Ʊ�ʾ�Ƿ�������ȷ���ġ�

����0.5�Ķ����Ʊ�ʾ��0.1��0.75�Ķ����Ʊ�ʾ��0.11��0.3û��ȷ�����޵Ķ����Ʊ�ʾ��
����

��һ�а���һ������ T (1 �� T �� 10)����ʾ�������ݵ�������

����T��ÿ�а���һ��ʮ����С�� X (0 < X < 1)�� Xһ������"0."��ͷ��С�����ֲ�����100λ��
���

����ÿ�����룬��� X �Ķ����Ʊ�ʾ����NO(��� X û��ȷ�����޵Ķ����Ʊ�ʾ����
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
