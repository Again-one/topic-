package ji_suan_ke_2018_3_2;

import java.util.Scanner;

public class Test2 {
	String op[]={"=", "!=", "<=", ">=", "<", ">"};
	int array[];
	int zong;
	Op opExample[];
	public static void main(String args[]){
		Test2 test=new Test2();
		test.start();
	}
	public void sort(int sum,int k,int step,int z){
		if(step==k){
			int sum1=0;
			for(int i=0;i<k;i++){
				sum1+=array[i];
			}
			if(z==sum1){
				zong++;
			}
			return;
		}
		for(int i=0;i<sum;i++){
			array[i]=i;
			sort(sum-i,k,step+1,z);
		}
	}
	public void jisuan(){
		for(int i=0;i<opExample.length;i++){
			
		}
	}
	public void start(){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			zong=0;
			int s=scan.nextInt();
			int k=scan.nextInt();
			int m=scan.nextInt();
			opExample=new Op[m];
			array=new int[k];
			scan.nextLine();
			for(int i=0;i<m;i++){
				
				String lizi=scan.nextLine();
				String temp[]=lizi.split(" ");
				int op1=op(temp[1]);
				int i1=Integer.parseInt(temp[0]);
				int j1=Integer.parseInt(temp[2]);
				
				opExample[i]=new Op(i1,j1,op1);
			}
			
			
		}
	}
	public int op(String o){
		
		for(int i=0;i<op.length;i++){
			
			if(o.equals(op[i])){
				return i;
			}
			
		}
		return -1;
	}
	class Op{
		int i;
		int j;
		int op;
		public Op(int i, int j, int op) {
			super();
			this.i = i;
			this.j = j;
			this.op = op;
		}
		@Override
		public String toString() {
			return "Op [i=" + i + ", j=" + j + ", op=" + op + "]";
		}
		
	}
	
}
