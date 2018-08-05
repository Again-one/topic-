package ji_suan_ke_2018_3;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = 0;
        while (n != 0) {
            ans += n/=5;
        }
        System.out.println(ans);
    }
}
