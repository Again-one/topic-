package math;

import java.util.Scanner;
/**
 * 叮铃铃 …… 上课铃响了。

「啊，又是无聊的 math」，坐在教室里的 ZQC 这样想道。Mr.Sam 今天在课上讲了平面直角坐标系上的向量。「这不是幼儿园姿势么」，ZQC 实在忍不住，睡着了。Mr.Sam 把 ZQC 给叫醒，并给了他这样一道题：

假设有一平面直角坐标系，ZQC 有一支画笔，起点是 (1,1) (1, 1) (1,1)，现在有 nnn 个向量，第 iii 个向量形如 (xi,yi) (x_i, y_i) (x​i​​,y​i​​)，且满足每一个向量都满足 xi,yi x_i, y_i x​i​​,y​i​​ 均为偶数。ZQC 按顺序根据这些向量改变自己的画笔的位置，即位置依次改变成 (1+x1,1+y1),(1+x1+x2,1+y1+y2)… (1 + x_1, 1 + y_1), (1 + x_1 + x_2, 1 + y_1 + y_2) \ldots (1+x​1​​,1+y​1​​),(1+x​1​​+x​2​​,1+y​1​​+y​2​​)…。每次改变位置时，画笔都沿两点之间的最短距离移动。结束时，画笔的运动轨迹一定由 nnn 条线段组成。Mr.Sam 要 ZQC 回答这些线段穿过 xxx 轴和 yyy 轴的总次数之和是多少。

但这样的问题对 ZQC 来说太简单了，于是 Mr.Sam 设定了一个指针，一开始指在第一个向量。现在他做了 q(q≤3×105) q(q \leq 3 \times 10 ^ 5) q(q≤3×10​5​​) 个操作，操作有四种，分别是：

    B 表示把指针向后移动，如果越界则视为无效。即，如果设指针移动前的位置是 iii，那么移动后的位置是 max(1,i−1)\max(1,i-1)max(1,i−1)。
    F 表示把指针向前移动，如果越界则视为无效。即，如果设指针移动前的位置是 iii，那么移动后的位置是 min(n,i+1)\min(n,i+1)min(n,i+1)。
    C nx ny 把当前指针所指的向量修改为 (nx,ny)(\text{nx},\text{ny})(nx,ny)，这里同样满足 nx,ny\text{nx},\text{ny}nx,ny 为偶数。
    Q 假设 ZQC 从起点开始，按第 1 1 1 个到第 n(n≤105) n(n \leq 10 ^ 5) n(n≤10​5​​) 个的顺序沿向量走，询问画出的 nnn 条线段穿过 xxx 轴和 yyy 轴次数的总和。

ZQC 想了想，这不是思博题么。

我是要拿图灵奖和菲尔兹奖的男人，这种题浪费我时间，不做！

但是如果不做的话，ZQC 又会遭到 detention，所以他希望聪明的你能在 +1s 内帮他解决这道题。
输入格式

第一行一个正整数 n n n。
接下来 n n n 行每行两个整数 x,y x, y x,y，保证 x,y x, y x,y 均为偶数。
接下来一行一个整数 q q q。
接下来 q q q 行，格式见「题目描述」。
输出格式

对于询问中的每个 q q q，输出画出的 n n n 条线段穿过 x x x 轴和 y y y 轴次数的总和。
样例输入

6
2 2
2 -6
-2 -4
-6 4
10 -10
-8 12
16
Q
C -4 -4 
F
F
Q
F
C 6 -2 
B
B
B
Q
C 0 6 
Q
F
C -8 4 
Q

样例输出

4
4
3
1
5


 * @author d
 *
 */
public class Test1 {

	public static void main(String args[]){
		
		
		
	}
	
	Scanner scan=new Scanner(System.in);
	
	public void start(){
		
		int num=scan.nextInt();
		Vector vector[]=new Vector[num];
		for(int i=0;i<vector.length;i++){
			
			vector[i]=new Vector(scan.nextInt(),scan.nextInt());
			
		}
		int num1=scan.nextInt();
		while(num1-->0){
			
			
			
		}
		
		
	}
	int size=0;
	public void caozuo(Vector vector[],char t){
		
		switch(t){
		
		case  'B':
			size=size-1<0 ? size:size-1;
			break;
		case 'F':
			size=size+1>=vector.length ? size: size+1;
			break;
		case 'C':
			int x=vector[size].x;
			int y=vector[size].y;
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			vector[size].x=x1*x;
			vector[size].y=y1*y;
			
			break;
		case 'Q':
			
			break;
		
		}
		
	}
	public void print(Vector vector[]){
		int k=0;
		int a=1;
		int b=1;
		int a1=a;
		int b1=b;
		int a2=0;
		int b2=0;
		
		for(int i=0;i<vector.length;i++){
			
			a+=vector[i].x;
			b+=vector[i].y;
			if(a==0){
				if(a1>0){
					a2=1;
				}
				if(a1<0)
					a2=-1;
					
			}
			
			
		}
		
	}
	
	class Vector{
		
		int x;
		int y;
		public Vector(int x, int y) {
			
			super();
			this.x = x;
			this.y = y;
			
		}
		
		
	}
	
}
