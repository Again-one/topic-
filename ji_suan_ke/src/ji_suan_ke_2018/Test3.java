package ji_suan_ke_2018;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *给定包含N个整数的数组A1, A2, ... AN，你可以选择任意一个Ai，将Ai旋转到数组第一项，即将数组变成：

Ai, Ai+1, Ai+2, ... AN, A1, A2, ..., Ai-1  

现在小Hi希望旋转之后的数组满足：

对于任意K(1 ≤ i ≤ N)，前K项的和都是正数。  

例如对于A=[3, -5, 2, -2, 3, 0]，旋转成[3, 0, 3, -5, 2, -2]满足条件。  

请你输出i，代表将Ai旋转到第一项满足条件。  

如果有多解，你可以输出任意一个i。如果无解输出-1。

输入
第一行包含一个整数N。  

第二行包含N个整数A1, A2, ... AN。  

对于50%的数据，1 ≤ N ≤ 1000  

对于100%的数据，1 ≤ N ≤ 100000, -1000000 ≤ Ai ≤ 1000000

输出
一个整数表示答案。

样例输入
6  
3 -5 2 -2 3 0
 */
public class Test3 {

	public static void main(String args[]){
		
		Test3 test=new Test3();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int array[]=new int[num];
		ArrayList<Integer> list=new ArrayList<Integer>();
		int max=0;
		int index=0;
		for(int i=0;i<num;i++){
			int a=scan.nextInt();
			max+=a;
			if(max>=1) {
				if((max-a)==0){
					index=i;
				}
			}
			else {
				list.add(max-a);
				list.add(a);
				max=0;
			}
		}
		if(max<0){
			System.out.println(-1);
			return;
		}else{
			for(int i=0;i<list.size();i++){
				max+=list.get(i);
				if(max<=0){
					System.out.println(-1);
					return;
				}
			}
			System.out.println(index+1);
		}
	}
	
}
