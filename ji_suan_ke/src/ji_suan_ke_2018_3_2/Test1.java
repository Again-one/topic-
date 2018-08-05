package ji_suan_ke_2018_3_2;

import java.util.Scanner;

//题目名在下面
public class Test1 {
	String target;
	public static void main(String args[]){
		
		Test1 test=new Test1();
		test.start();
		
	}
	public void start(){
		
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			target=scan.next();
			int n=scan.nextInt();
			String array[]=new String[n];
			int sum=0;
			for(int i=0;i<array.length;i++){
				
				array[i]=scan.next();
				
				
				
				
			}
			if(sum%2==0){
				System.out.println("Alice");
			}else{
				System.out.println("Bob");
			}
			
		}
		
	}
	public int changdu(String mid,String target,int length){
		if(target.lastIndexOf(mid)!=-1){
			length+=mid.length();
			changdu(target.substring(target.lastIndexOf(mid), target.length()),target.substring(0, target.lastIndexOf(mid)-1),length);
		}
		return length;
	}
	
}
/*
 * 
 * Recently Alice and Bob are playing a game about strings. Before starting the game, they should prepare nn strings s_1s 
1
​	 , s_2s 
2
​	 , ..., s_ns 
n
​	  and a target string tt. It's promised that each of these nn strings is a substring of tt.

When the game begins, they do the following things alternately while Alice starts first:

Choose a string s_is 
i
​	  from the nn strings;
Append one letter to the chosen string;
The new string must also be a substring of tt.
If the above things cannot be completed, the player loses the game. Suppose Alice and Bob both use optimal strategy, find who will win the game.

Input

The input consists of multiple test cases.

Each test case begins with the non-empty target string tt, whose length will not exceed 100000100000. The second line contains an integer nn (1 \leq n \leq 100)(1≤n≤100), the number of strings they prepared. Then nn lines follow. The ii-th line of the following nn lines is the string s_is 
i
​	 . The input guarantees that each of the nn strings must be a non-empty substring of tt.

The total length of all strings will not exceed 3000000030000000.

Output

For each test case, output the winner "Alice" or "Bob" (without quotes) in one line.

忽略每行输出的末尾多余空格

样例输入
aaaa
1
a
abcabd
1
a
样例输出
Alice
Bob*/
 