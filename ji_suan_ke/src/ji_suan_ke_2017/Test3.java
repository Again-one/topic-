package ji_suan_ke_2017;

import java.util.Scanner;

//https://nanti.jisuanke.com/t/21
//贪心:很不错的题
public class Test3 {

	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int mid=0;
		int num=scan.nextInt();
		for(int i=0;i<num;i++){
			int buffer=scan.nextInt();
			if(buffer+mid>max){
				max=buffer+mid;
			}
			if(buffer+mid<0){
				mid=0;
			}else{
				mid+=buffer;
			}
		}
		System.out.println(max);
	}
}
