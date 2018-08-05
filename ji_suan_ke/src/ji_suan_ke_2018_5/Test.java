package ji_suan_ke_2018_5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String args[]){
		
		Test test=new Test();
		test.start();
		
	}
	public void start(){
		//sum相同递减数列的数目，max最大的序列长度
		int sum=0;
		int max=0;
		Scanner scan =new Scanner(System.in);
		int size=scan.nextInt();
		Long array[]={};
		Set<Long> set=new LinkedHashSet<Long>();
		for(int i=0;i<size;i++){
			set.add(scan.nextLong());
		}
		array=set.toArray(array);
		Arrays.sort(array);
		
		
		for(int i=array.length-1;i>0;i--){
			
			
		}
		
		
		System.out.println(max+" "+sum);
	}
}
