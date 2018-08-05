package _7_29;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public void start(){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		BigInteger big=new BigInteger(num+"");
		String string=big.toString(2);
		int sum=0;
		for(int i=string.length()-1;i>=0;i--){
			sum++;
			if(string.charAt(i)=='1'){
				break;
			}
		}
		System.out.println(sum);
		
	}
}
