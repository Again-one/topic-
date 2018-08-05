package ji_suan_ke_2017;

import java.util.Scanner;

//https://nanti.jisuanke.com/?page=1&sort=id&kw=&tags=%E5%88%86%E6%B2%BB,%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE,%E4%B8%89%E5%88%86%E6%9F%A5%E6%89%BE,%E5%BD%92%E5%B9%B6,%E5%88%86%E5%9D%97
//∑÷“±
//ºÚµ•
public class Test1 {

	public static void main(String args[]){
		
		Test1 test=new Test1();
		test.start();
		Scanner scan=new Scanner(System.in);
		double d=scan.nextDouble();
		
		System.out.printf("%.3f",Math.sqrt(d));
	}
	
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		double start=scan.nextDouble();
		double max=start;
		double mid=0;
		double min=0;
		double step=0;
		while(step<=1000){
			
			if(max==1){		
				mid=1;
				break;
			}
			mid=(max+min)/2;
			
			
			if((mid*mid)>start){
				
				max=mid;
				
			}else{
				
				if((mid*mid)==start){
					
					break;
					
				}else{
					
					min=mid;
					
				}
				
			}
			
			
			step++;
			
		}
		System.out.println(String.format("%.3f", mid));
		
		
	}
	
}
