package ji_suan_ke_2017;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Test8 {
	int con[];
	public static void main(String args[]){
		Test8 test=new Test8();
		test.start();
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		con=new int[num];
		for(int i=0;i<num;i++){
			con[i]=i;
			
		}
		int value[]=new int[num];
		Queue<Edge> queue=new PriorityQueue<Edge>();
		for(int i=0;i<num;i++){
			
			for(int j=0;j<num;j++){
				int w=scan.nextInt();
				if(w!=0)
					queue.offer(new Edge(i,j,w));
			}
			
		}
		int min=0;
		while(queue.size()!=0){
			
			Edge a=queue.poll();
			int i1=a.s;
			int j1=a.e;
			
			
			if(find(i1)==find(j1))
				
					continue;
			min+=a.w;
			union(i1,j1);
			
		}
		
		System.out.println(min);
	}
	public void union(int i,int j){
		int i1=find(i);
		int j1=find(j);
		
		if(i1==j1) return;
		con[i1]=j1;
		
	}
	public int find(int i){
		if(con[i]!=i) return find(con[i]);
		return i;
		
	}
}
class Edge implements Comparable<Edge>{
	
	int s;
	int e;
	int w;
	public Edge(int s, int e, int w) {
		super();
		this.s = s;
		this.e = e;
		this.w = w;
	}
	@Override
	public int compareTo(Edge o) {
		if(w>((Edge)o).w)
			return 1;
		return -1;
	}
	
}
