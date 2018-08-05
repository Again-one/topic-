package _8_4;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Scanner scan =new Scanner(System.in);
	Graph graph1=null;//RG��
	Graph graph2=null;//GB��

	
	public static void main(String args[]){
		int T=scan.nextInt();
		Main main=new Main();
		for(int i=0;i<T;i++){
			main.start(i);
		}
	}
	public void start(int t){
		graph1=null;
		graph2=null;
		int n=scan.nextInt();//����
		int m=scan.nextInt();//����
		ArrayList<Edge> edgeRArray=new ArrayList<Edge>();
		ArrayList<Edge> edgeGArray=new ArrayList<Edge>();
		ArrayList<Edge> edgeBArray=new ArrayList<Edge>();
		for(int i=0;i<m;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			int w=scan.nextInt();
			char c=scan.next().charAt(0);
			if(c=='R'){
				edgeRArray.add(new Edge(a,b,w,c));
			}
			if(c=='G'){
				edgeGArray.add(new Edge(a,b,w,c));
			}
			if(c=='B'){
				edgeBArray.add(new Edge(a,b,w,c));
			}
		}
		System.out.println("Case #"+(t+1)+":");
		
		//��ɫ�ͺ�ɫ
		int isRG=1;
		int isGB=1;
		
		
		int RGW=0;
		
		{
			ArrayList<Edge> array=new ArrayList<Edge>();
			for(int i=0;i<edgeRArray.size();i++){
				array.add(edgeRArray.get(i));
			}
			for(int i=0;i<edgeGArray.size();i++){
				array.add(edgeGArray.get(i));
			}
			
			RGW=getW(n+1,array,1);
			if(graph1.count!=2){
				isRG=0;
			}
		}
		
		int GBW=0;
		
		
		{
			ArrayList<Edge> array=new ArrayList<Edge>();
			for(int i=0;i<edgeBArray.size();i++){
				array.add(edgeBArray.get(i));
			}
			for(int i=0;i<edgeGArray.size();i++){
				array.add(edgeGArray.get(i));
			}
			
			GBW=getW(n+1,array,2);
			if(graph2.count!=2){
				isGB=0;
				
			}
			
		}
		//ֻ�ú�ɫ����ô�죿��ʵֻ�ü��߽�
				
				//��ɫ��ɫ
		//�����Խ�������ʱ��ѡ��һ����С�������ú�ʣ�µı���һ��˳���������ӽ�ȥ
		if((isGB==0&&isRG==0)){
			for(int i=0;i<m;i++){
				System.out.println("-1");
			}
			
		}else{
			if(isGB!=0&&isRG!=0){
					if(RGW<GBW){
						out(RGW,m,graph1.size,1,edgeBArray);
					}else{
						out(GBW,m,graph2.size,2,edgeRArray);
						
					}
					
					
				
				
				
			}else{
				if(isGB!=0){
					out(GBW,m,graph2.size,2,edgeRArray);
					
				}else{
					out(RGW,m,graph1.size,1,edgeBArray);
					
				}
			}
		}
	}
	/**
	 * 
	 * @param w ���ڵ�Ȩ��
	 * @param size ��С�ߴ�
	 * @param m ���ٸ���
	 * @param mode 1�Ǻ��� 2������
	 * @param edge ����һ��û�б���������б�
	 * @param size2 ����һ��size��С�����Ϊ0���ù�,-1���ǽ�����һ�����д���
	 * @param isAdd �Ƿ���ֱ�����w
	 */
	public void out(int w,int m,int size,int mode,ArrayList<Edge> edge){
		
		if(mode==1){
			Queue<Edge> q=new PriorityQueue<Edge>();
			for(int i=0;i<graph1.array.size();i++){
				q.offer(graph1.array.get(i));
			}
			for(int j=0;j<edge.size();j++){
				q.offer(edge.get(j));
			}

			for(int i=0;i<m;i++){
				if(i<size-1){
					System.out.println(-1);
					continue;
				}else{
					if(i==size-1){
						System.out.println(w);
						continue;
					}
					
				}
				w=w+q.poll().w;
				
				System.out.println(w);
				
				
			}
			
			
		}
		if(mode==2){
			Queue<Edge> q=new PriorityQueue<Edge>();
			for(int i=0;i<graph2.array.size();i++){
				q.offer(graph2.array.get(i));
			}
			for(int j=0;j<edge.size();j++){
				q.offer(edge.get(j));
			}

			for(int i=0;i<m;i++){
				if(i<size-1){
					System.out.println(-1);
					continue;
				}else{
					if(i==size-1){
						System.out.println(w);
						continue;
					}
				}
				w=w+q.poll().w;
				System.out.println(w);
			}
		}
			
		
	}
	
	/**
	 * 
	 * @param n �������Ҫ+1
	 * @param array
	 * @param mode ���ĸ�ͼ����������graph1��graph2����ֵ��1��2
	 * @return
	 */
	public int getW(int n,ArrayList<Edge> array,int mode){
		Queue<Edge> q=new PriorityQueue<Edge>();
		Graph graph=new Graph(n);
		for(int i=0;i<array.size();i++){
			q.offer(array.get(i));
		}
		int w=0;
		while(!q.isEmpty()){
			Edge edge=q.poll();
			
			int a=edge.a;
			int b=edge.b;
			
			if(graph.connected(a, b)){
				graph.array.add(edge);
				continue;
			} 
			graph.lian(a, b);
			w+=edge.w;
			graph.size++;
			
		}
		
		if(mode==1){
			graph1=graph;
			
		}else{
			graph2=graph;
			
		}
		return w;
	}
	
	class Edge implements Comparable<Edge>{
		int a;
		int b;
		int w;
		char c;//R��G,B������
		public Edge(int a, int b, int w, char c) {
			super();
			this.a = a;
			this.b = b;
			this.w = w;
			this.c = c;
		}
		@Override
		public int compareTo(Edge o) {
			if(o.w<this.w){
				return 1;
			}else{
				return -1;
			}
			
		}
		
	}
	class Graph{
		int w[];
		int s[];
		int size;//�Ѿ��ù��ı�;
		int add=1;
		int count=0;
		ArrayList<Edge> array=new ArrayList<Edge>();
		public Graph(int n){
			w=new int[n];
			s=new int[n];
			count=n;
			for(int i=0;i<n;i++){
				w[i]=i;
				s[i]=1;
			}

		}
		public boolean connected(int i,int j){
			return find(i)==find(j);
		}
		public int find(int i){
			if(w[i]!=i) i=find(w[i]);
			return i;
		}
		public void lian(int i,int j){
			int t=find(i);
			int t2=find(j);
			
			if(t==t2){
				return;
			}
			if(s[t]>s[t2]){
				w[t2]=t;
				s[t]+=s[t2];
			}else{
				w[t]=t2;
				s[t2]+=s[t];
			}
			count--;
			
		}
	}
}
