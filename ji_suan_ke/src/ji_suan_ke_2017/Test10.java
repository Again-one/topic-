package ji_suan_ke_2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Test10 {
	public static void main(String args[]){
		Test10 test=new Test10();
		test.start();
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int town=scan.nextInt();
		int road=scan.nextInt();
		int start=scan.nextInt();
		int end=scan.nextInt();
		int array[]=new int[town+1];
		Arrays.fill(array, Integer.MAX_VALUE);
		Queue<Integer> s=new LinkedList<Integer>();
		s.offer(start);
		array[start]=0;
		Graph g=new Graph(town);
		for(int i=0;i<road;i++){
			g.add(new Edge(scan.nextInt(),scan.nextInt(),scan.nextInt()));
		}
		while(!s.isEmpty()){
			
			int v=s.poll();
			
			for(int i=0;i<g.array[v].size();i++){
				Edge v2=g.array[v].get(i);
				int w2=0;
				if(v2.v!=v){
					w2=v2.v;
				}else{
					w2=v2.w;
				}
				
				if((array[v]+v2.value)<array[w2]){
					array[w2]=(array[v]+g.array[v].get(i).value);
					s.offer(w2);
				}
			}
		}
		System.out.println(array[end]);
	}
	class Graph{
		ArrayList<Edge> array[];
		public Graph(int V){
			array=new ArrayList[V+1];
			for(int i=0;i<V+1;i++){
				array[i]=new ArrayList<Edge>();
			}
			
		}
		public void add(Edge e){
			array[e.v].add(e);
			array[e.w].add(e);
		}
		
	}
	class Edge {
		int v;
		int w;
		int value;
		public Edge(int v,int w,int value){
			this.v=v;
			this.w=w;
			this.value=value;
		}
		
		
		
	}
}
