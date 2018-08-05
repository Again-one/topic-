package ji_suan_ke_2018;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String args[]){
		Main test=new Main();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int K=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int array[]=new int[N+2];
		for(int i=0;i<M;i++){
			int a=scan.nextInt();
			array[a]=-1;
		}
		Queue<B> queue=new PriorityQueue<B>();
		int isK=0;
		int start=0;
		for(int i=1;i<N+2;i++){
			
			if(array[i]==-1){
				
					
				int end=i-start-1;
				if(end>0){
					queue.offer(new B(start,end));
				}
				
					
				
				start=i;
				
			}
			if(i==N+1&&array[N+1]==0){
				int end=i-start-1;
				if(end>0){
					queue.offer(new B(start,end));
				}
			}
			
		}
		for(int i=0;i<K;i++){
			B b=queue.poll();
			int index2=(int) (b.start+Math.ceil(b.length/(double)2));
			
			System.out.println(index2);
			int end1=index2-b.start-1;
			
			int end2=(b.start+b.length+1)-index2-1;
			
			if(end1>0){
				queue.offer(new B(b.start,end1));
			}
			if(end2>0){
				queue.offer(new B(index2,end2));
			}
		}
	}
	class B implements Comparable<B>{
		
		public B(int start, int length) {
			super();
			this.start = start;
			this.length = length;
			
		}
		int start;
		int length;
		@Override
		public int compareTo(B o) {
			if(length>o.length){
				return -1;
			}else{
				if(length<o.length){
					return 1;
				}else{
					if(start<o.start){
						return -1;
					}else{
						return 1;
					}
				}
			}
			
		}
		
	}
}
