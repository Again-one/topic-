package _6._25;

import java.util.Scanner;

/**
 * 
ʱ������:40000ms
����ʱ��:2000ms
�ڴ�����:256MB

����

����һ������Ϊ n �ķǸ��������� a[1..n]��

��ÿ�ο��Ի��� 1 �Ĵ��۸�ĳ�� a[i] ��1���߼�1��

��������Ҫ���ٴ����ܽ�������б��һ�����������С�
����

��һ��һ�������� n��

������ n ��ÿ��һ���Ǹ��������� i �б�ʾ a[i]��

1 �� n �� 500000

0 < a[i] �� 109
���

һ���Ǹ���������ʾ�𰸡�
��������

[5,3,4,5] -> [5,4,4,4]


��������

    4
    5
    3
    4
    5

�������

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
