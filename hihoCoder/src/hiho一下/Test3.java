package hihoÒ»ÏÂ;

import java.util.Scanner;

/*
 * http://hihocoder.com/contest/offers51/problem/2
 */
public class Test3 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int d[]=new int[1000000];
		int sum=0;
		for(int i=0;i<a;i++){
			String b=scan.next();
			int c=b.length();
			if(d[c]==1)
				continue;
			sum++;
			d[c]=1;
		}
		System.out.println(sum);
	}
}
