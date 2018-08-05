package ji_suan_ke_2018_3;

import java.util.Scanner;

public class Test8 {
	int graph[][];
	public static void main(String args[]){
		
		Test8 test=new Test8();
		test.start();
		
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int sum=0;
		if(n<m){
			int temp=m;
			m=n;
			n=temp;
		}
		graph=new int[n][m];
		for(int i=0;i<m;i++){
			if(put(0,i)){
				sum++;
			}
		}
		for(int i=0;i<m;i++){	
			if(put(n-1,i)){
				sum++;
			}
		}
		for(int i=0;i<n;i++){	
			if(put(i,0)){
				sum++;
			}
		}
		for(int i=0;i<n;i++){	
			if(put(i,m-1)){
				sum++;
			}
		}
		for(int i=0;i<n;i++){	
			for(int j=0;j<m;j++){
				if(put(i,j)){
					sum++;
				}
			}
		}
		System.out.println(sum);
		
	}
	public boolean put(int x,int y){
		if(graph[x][y]==2||graph[x][y]==1){
			return false;
		}
		int array1[]=new int[8];
		int array2[]=new int[8];
		array1[0]=x-2;
		array2[0]=y-1;
		array1[1]=x-1;
		array2[1]=y-2;
		array1[2]=x-2;
		array2[2]=y+1;
		array1[3]=x+1;
		array2[3]=y-2;
		array1[4]=x+2;
		array2[4]=y-1;
		array1[5]=x-1;
		array2[5]=y+2;
		array1[6]=x+2;
		array2[6]=y+1;
		array1[7]=x+1;
		array2[7]=y+2;
		for(int i=0;i<8;i++){
			if(array1[i]>=graph.length||array1[i]<0){
				continue;
			}
			if(array2[i]>=graph[0].length||array2[i]<0){continue;}
			if(graph[array1[i]][array2[i]]==2){
				return false;
			}
		}
		for(int i=0;i<8;i++){
			if(array1[i]>=graph.length||array1[i]<0){
				continue;
			}
			if(array2[i]>=graph[0].length||array2[i]<0){continue;}
			if(graph[array1[i]][array2[i]]==2){
				continue;
			}
			graph[array1[i]][array2[i]]=1;
				
			
		}
		graph[x][y]=2;
		
		return true;
	}
}
