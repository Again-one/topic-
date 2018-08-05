package ji_suan_ke_2018_5;

import java.util.ArrayList;
import java.util.Scanner;

//https://nanti.jisuanke.com/t/91
public class Test2 {
	boolean marked[];
	int size;
	static Scanner scan=new Scanner(System.in);
	public static void main(String args[]){
		
		Test2 test=new Test2();
		int sum=scan.nextInt();
		for(int i=1;i<=sum;i++){
			test.start(sum);
		}
		
		
	}
	public void start(int sum){
		
		
		
		//N，M，K开始。N表示地铁站的数目，M表示原有的地铁线路总数，K表示至少保留线路数目
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();
		Graph g=new Graph(n);
		marked=new boolean[n];
		
		for(int i=0;i<m;i++){
			int s=scan.nextInt();
			int e=scan.nextInt();
			
			g.list[s-1].add(e-1);
		}
		for(int i=0;i<n;i++){
			dfs(0,g);
		}
		System.out.println("Case "+sum+": "+this.size);
	}
	private void dfs(int s,Graph g) {
		
		marked[s]=true;
		int t=1;
		int size=0;
		for(int i=0;i<g.list[s].size();i++){
			int e=g.list[s].get(i);
			if(marked[e]==false){
				if(t==0){
					size++;
				}
				t=0;
				dfs(e,g);
			}
			
		}
		if(size>this.size){
			this.size=size;
		}
		
	}
	class Graph{
		ArrayList<Integer> list[];
		public Graph(int n){
			list=new ArrayList[n];
			for(int i=0;i<n;i++){
				list[i]=new ArrayList<Integer>();
				
			}
		}
		public void addEdge(int s,int e){
			list[s].add(e);
		}
	}
}
