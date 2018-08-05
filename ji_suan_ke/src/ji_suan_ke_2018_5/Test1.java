package ji_suan_ke_2018_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://nanti.jisuanke.com/t/85  没做出来
public class Test1 {
	boolean[] marked;
	int mid;
	int max;
	public static void main(String args[]){
		
		Test1 test=new Test1();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int v=scan.nextInt();
		Graph g=new Graph(n);
		marked=new boolean[n];
		mid=n-1;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<n;i++){
			map.put(scan.next(), i);
		}
		for(int i=0;i<v;i++){
			int start=map.get(scan.next());
			int end=map.get(scan.next());
			g.addEdge(start, end);
			
		}
		dfs(0,g,0);
		System.out.println(max);
	}
	public void dfs(int s,Graph g,int max){
		if(s==mid){
			if(this.max<max){
				this.max=max;
			}
			return;
		}
		marked[s]=true;
		for(int i=0;i<g.list[s].size();i++){
			int v=g.list[s].get(i);
			if(marked[v]==false){
				dfs(v,g,max+1);
				marked[v]=false;
			}
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
	class Edge{
		int start;
		int end;
		public Edge(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}
		
	}
}
