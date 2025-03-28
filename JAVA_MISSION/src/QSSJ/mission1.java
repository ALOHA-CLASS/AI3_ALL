package QSSJ;

import java.util.Scanner;

//학생의 영어, 수학, 자바 성적을
//각각 정수형 변수 eng, math, java 로 선언하고,

//순서대로 점수를 입력 받아
//성적의 총 합계와 평균을 계산하여
//출력하는 프로그램을 작성하시오.
public class mission1 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 성적을 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int math = sc.nextInt();
		System.out.println("자바 성적을 입력하세요.");
		int java = sc.nextInt();
		
		int sum = eng + math + java;
		
		double average = sum/3.0;
		
		System.out.println("성적의 총합: " + sum);
        System.out.println("성적의 평균: " + average);
		sc.close();
	}
}
