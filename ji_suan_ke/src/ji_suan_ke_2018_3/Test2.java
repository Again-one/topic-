package ji_suan_ke_2018_3;

public class Test2 {
	int array[]=new int[8];
	int box[]=new int[8];
	int zhishu;
	public void sort(int step){
		
		if(step==8){
			int sum = 0;
			if(box[0]==0)
				return;
			for(int i=0;i<8;i++){
				
				sum+=box[i]*(int) Math.pow(10.0, (7.0-i));
				
			}
			if(isZhiShu(sum))
				zhishu++;
			return;
		}
		for(int i=0;i<8;i++){
			
			if(array[i]==0){
				
				array[i]=-1;
				box[step]=i;
				sort(step+1);
				array[i]=0;
				
			}
			
		}
		
	}
	public boolean isZhiShu(int sum){
		if(sum==2||sum==3)
			return true;
		if(sum%6!=1&&sum%6!=5)
			return false;
		int temp=(int)Math.sqrt(sum);
		for(int i=5;i<=temp;i+=6){
			
			if(sum%i==0||sum%(i+2)==0)
				return false;
			
		}
		return true;
	}
	public void start(){
		sort(0);
		System.out.println(zhishu);
	}
	
	public static void main(String args[]){
		
		Test2 test=new Test2();
		test.start();
		
		
	}
	
}
