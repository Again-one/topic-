package ji_suan_ke_2017;

import java.util.HashSet;
import java.util.Scanner;

//https://nanti.jisuanke.com/t/11
//ËÑË÷
public class Test2 {
	
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		HashSet<Integer> array=new HashSet<Integer>();
		while(num-->0){
			
			array.add(scan.nextInt());
			
		}
		System.out.println(array.size());
	}
	
}
