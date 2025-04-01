package Q01;

import java.util.Scanner;

public class TotalAverageEx {

	public static void main(String[] args) {
		
		// 점수입력
		Scanner sc = new Scanner(System.in);
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.println("자바점수 : ");
		int java = sc.nextInt();
		
		// 총점과 평균 구하기
		int sum = eng + math + java;
		double average = sum / 3.0;
		
		// 결과 출력
		
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("자바점수 : " + java);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		sc.close();

	}
}
