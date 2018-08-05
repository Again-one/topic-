package ji_suan_ke_2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://nanti.jisuanke.com/t/30
//ËÑË÷
public class Test6 {

	public static void main(String args[]){
		
		Test6 test=new Test6();
		test.start();
		
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num1=(num*(num-1))/2;
		
		Test6_T array[]=new Test6_T[num1];
		int index=0;
		for(int i=num;i>0;i--){
			
			for(int j=num;j>0;j--){
				double fraction=((double)j)/i;
				if(fraction>=1)
					continue;
				array[index]=new Test6_T(fraction,i,j);
				index++;
			}
			
		}
		Arrays.sort(array);
		System.out.println("0/1");
		for(int i=0;i<array.length;i++){
			if(array[i].c!=-1){
				
					
				System.out.println(array[i].y+"/"+array[i].x);
			}
		}
		System.out.println("1/1");
		
	}
	class Test6_T implements Comparable<Test6_T>{
		double d;
		int x;//·ÖÄ¸
		int y;//·Ö×Ó
		int c=0;
		@Override
		public int compareTo(Test6_T o) {
			if(d>((Test6_T)o).d){
				return 1;
			}else{
				
				if(d==((Test6_T)o).d){
					
					if(this.x>((Test6_T)o).x){
						this.c=-1;
						return -1;
					}else{
						
						((Test6_T)o).c=-1;
						return 1;
					}
				}
			}
			return -1;
		}
		public Test6_T(double d,int x,int y){
			this.d=d;
			this.x=x;
			this.y=y;
		}
		
	}
	
}
