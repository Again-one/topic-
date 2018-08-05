package hihoÒ»ÏÂ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/**
 * http://hihocoder.com/contest/offers51/problem/1
 * @author d
 *
 */
public class Test2 {

	public static void main(String args[]){
		
		Test2 test=new Test2();
		test.start();
		
	}
	
	public void start(){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int X=scan.nextInt();
		int Y=scan.nextInt();
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int D=scan.nextInt();
		int[] c={A,B,C,D};
		Queue<Lamp> queue=new LinkedList<Lamp>();
		queue.offer(new Lamp(X,Y));
		long sum=1;
		int array[][]=new int[N+1][M+1];
		ArrayList<Integer> al[]=new ArrayList[4];
		for(int i=0;i<al.length;i++){
			al[i]=new ArrayList<Integer>();
			for(int j=c[i];j>=-1000000&&j<=1000000;j+=c[i]){
				al[i].add(j);
			}
		}
		int start1=al[0].size()>al[1].size()?al[1].size():al[0].size();
		int start2=al[2].size()>al[3].size()?al[3].size():al[2].size();
		while(!queue.isEmpty()){
			Lamp la=queue.poll();
			int x1,y1,x2,y2;
			for(int i=0;i<start1;i++){
				x1=la.X+al[0].get(i);
				y1=la.Y+al[1].get(i);
				
				if(!(x1>N||x1<=0||y1>M||y1<=0)){
					if(array[x1][y1]==0){
						array[x1][y1]=1;
						queue.offer(new Lamp(x1,y1));
						sum++;
					}
					
				}
			}
			for(int i=0;i<start2;i++){
				x2=la.X+al[2].get(i);
				y2=la.Y+al[3].get(i);
				if(!(x2>N||x2<=0||y2>M||y2<=0)){
					if(array[x2][y2]==0){
						array[x2][y2]=1;
						queue.offer(new Lamp(x2,y2));
						sum++;
					}
					
				}
			}
			
			
		}
		System.out.println(sum);
	}
	class Lamp{
		int X;
		int Y;
		public Lamp(int x, int y) {
			super();
			X = x;
			Y = y;
		}
		
	}
}
