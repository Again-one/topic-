package ji_suan_ke_2018_3;

import java.util.LinkedList;
import java.util.Queue;

public class Test6 {
	
	class Graph{
		
	}
	class Edge{
		int v,w,d;

		public Edge(int v, int w, int d) {
			super();
			this.v = v;
			this.w = w;
			this.d = d;
		}  
		
		
	}
	public void sort(int[][] a){
		
	}
	public void start(){
		
		int graph[][]={
				{0,0,0,0,0,0,0,1,0,0},
				{0,0,0,2,0,0,1,0,0,0},
				{0,2,0,0,1,0,0,2,0,0},
				{0,1,0,0,0,2,0,0,1,0},
				{0,2,0,0,1,0,2,0,0,0},
				{0,0,2,0,0,0,0,2,0,0},
				{0,0,0,0,0,2,0,0,1,0},
				{0,2,0,2,0,0,1,0,0,0},
				{0,1,0,0,0,0,2,2,0,0},
				{0,0,2,0,0,2,1,0,0,0},
		};
		fangxiang(graph,0,0,0,0);
		
		
	}
	int minDay=Integer.MAX_VALUE;
	public void fangxiang(int graph[][],int x,int y,int sum,int day){
		if(x>=graph.length||x<0||y>=graph[0].length||y<0){
			
			return;
		}
		if(graph[x][y]==-1||graph[x][y]==2){
			
			return;
			
		}
		int x1[]={x,x,x-1,x+1};
		int y1[]={y-1,y+1,y,y};
		for(int i=0;i<4;i++){
			
				
			int temp=graph[x][y];
			
			if(graph[x][y]==1){
				graph[x][y]=-1;
				fangxiang(graph,x1[i],y1[i],sum+1,day+1);
				if(sum+1==10){
					if(day<=minDay){
						System.out.println(x+" "+y+" "+minDay);
						minDay=day;
					}
				}
			}
			else{
				graph[x][y]=-1;
				fangxiang(graph,x1[i],y1[i],sum,day+1);
				
			}
			graph[x][y]=temp;
			
			
		}
	}
	public static void main(String args[]){
		
		Test6 test=new Test6();
		test.start();
		
	}
	
}
