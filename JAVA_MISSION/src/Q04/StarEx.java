package Q04;

import java.util.Scanner;

public class StarEx {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수를 입력하세요 : ");
	int N = sc.nextInt();
	
	// 별패턴 반복
	for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	} sc.close();
			
	}


}
