package ji_suan_ke_2018;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String args[]){
		Test2 test=new Test2();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		String string=scan.next();
		string=string.replaceAll("J", "");
		
		String string2="";
		String a="ABCDEFGHIKLMNOPQRSTUVWXYZ";
		for(int i=0;i<string.length();i++){
			char b=string.charAt(i);
			
			if(string.indexOf(b)>-1){
				if(a.indexOf(b)>-1){
					string2=string2.concat(String.valueOf(b));
					a=a.replaceAll(String.valueOf(b), "");
				}
				
				
			}
			
		}
		string2=string2.concat(a);
		for(int i=0;i<25;i++){
			if(i%5==0&&i!=0){
				System.out.println();
			}
			System.out.print(string2.charAt(i));
		}
				
		
	}
	
}
