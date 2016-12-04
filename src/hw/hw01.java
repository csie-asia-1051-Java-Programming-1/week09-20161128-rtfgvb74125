package hw;

/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);
	}

	public static void fun(int n) {
		int count = 0;
		String str = "";
		for (int i = 1; i < n; i++) {
			
			str = "" + i;
			int sum = 0;
			int j = i;
			while (sum < n) {
				sum = sum + j;
				j++;
				if (sum < n) {
					str = str + "+" + j;
				}
			}
			if (sum == n) {
				count++;
				System.out.println(str);
			}
		}
		if (count == 0) {
			System.out.println("NO");
		}
	}

}
