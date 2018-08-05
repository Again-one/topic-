package _8_5;

import java.util.Scanner;

public class Test1 {
	long max=0;
	public void init(){
		max=0;
	}
	public void start(){
		init();
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int array[]=new int[N];
		for(int i=0;i<N;i++){
			array[i]=scan.nextInt();
		}
		int size=0;
		for(int j=0;j<N;j++){
			
			if(array[j]%K==0){
				size++;
				
			}
		}
		//如果K为奇数，因为无法平分，所以确定是两个
		if(size==0&&K%2!=0){
			int isover=0;
			for(int i=0;i<N;i++){
				if(isover==1){break;}
				for(int j=i+1;j<N;j++){
					if((array[i]+array[j])%K==0){
						System.out.println(2);
						isover=1;
						break;
					}
				}
			}
		}
		int size2=0;
		if(K%2==0){
			int min=K/2;
			
			for(int i=0;i<N;i++){
				if((array[i]+min)%K==0){
					size2++;
					
				}
			}
		}
		if(size2>size){
			if(size2==1){
				System.out.println(-1);
			}else{
				System.out.println(size2);
			}
			
		}else{
			if(size2<size){
				if(size==1){
					System.out.println(-1);
				}else{
					System.out.println(size);
				}
			}else{
				System.out.println(-1);
			}
			
		}
		
		
		
	}
}
