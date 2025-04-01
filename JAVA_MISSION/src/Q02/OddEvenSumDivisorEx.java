package Q02;

import java.util.Iterator;
import java.util.Scanner;

/**
 *  정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고, 정수 1부터 N까지 홀수의 합계와 짝수의 합계
 *  그리고, 정수 N의 약수를 구하여 예시 <출력>과 같이 출력하는 프로그램을 작성하시요.
 *  (1 <= N <= 100)
 */
public class OddEvenSumDivisorEx {
	
	public static void main(String[] args) {
		// 10을 입력받는다.
		Scanner sc = new Scanner(System.in);
				System.out.println("정수입력 (1 <= N <= 100): ");
				int N = sc.nextInt();
				
		// 1번 줄에는 1~N에 대한 홀수의 수식 및 합계,
		int oddSum = 0, evenSum = 0;
		StringBuilder oddExpression = new StringBuilder();
		StringBuilder evenExpression = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) { // 홀수
				oddSum += i;
				oddExpression.append(i).append("+");
			} else { // 짝수
				evenSum += i;
				evenExpression.append(i).append("+");

			}
			
		}
		// 2번 줄에는 1~N에 대한 짝수의 수식 및 합계,
		if (oddExpression.length() > 0) {
			oddExpression.deleteCharAt(oddExpression.length() - 1);
		}
		if (oddExpression.length() > 0) {
			evenExpression.deleteCharAt(evenExpression.length() - 1);
		}
		
		StringBuilder divisors = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				divisors.append(i).append(" ");
			}
			
		}
		// 결과 출력
		System.out.println(oddExpression + "=" + oddSum);
		System.out.println(oddExpression + "=" + evenSum);
		System.out.println(divisors.toString().trim());
		sc.close();
	}

}
