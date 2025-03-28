package QSSJ;

import java.util.Scanner;

//정수 하나를 입력 받아,
//정수형 변수 N에 초기화시키고,
// 정수 1부터 N까지 홀수의 합계와 짝수의 합계
//그리고 정수 N의 약수를 구하여
//예시 <출력>과 같이 출력하는 프로그램을 작성하시오. ( 1 ≤ N ≤ 100 )
//
//
//• (설명)
//10을 입력받아서,
//1번 줄에는 1~N에 대한 홀수의 수식 및 합계,
//2번 줄에는 1~N에 대한 짝수의 수식 및 합계,
//3번 줄에는 N의 약수를 출력하시오.
public class mission2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 값 : ");
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 ==0) {
				sum1 += i;
				
			} else {
				sum2 += i;
				
			}
		}
		System.out.println("짝수의 합계 : " + sum1);
		System.out.println("홀수의 합계 : " + sum2);
		
		System.out.println("정수 " + N + "의 약수: ");
		for (int i = 1; i <= N; i++) {
			if (N % i ==0) {
				System.out.println(i + " ");
			} 
		}
		
		
	sc.close();
	}
}
