package Q03;

import java.util.Scanner;

public class ThreeSixNineEx {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int num = i;
			int count = 0;
			
			while (num > 0) {
				int digit = num % 10; // 각 자리 숫자를 추출
				if (digit == 3 || digit == 6 || digit == 9) {
					count++; // 3, 6, 9가 포함된 개수를 증가
				}
				num /= 10; // 다음 자리로 이동
			}
			if (count > 0) {
				for (int j = 0; j < count; j++) {
					System.out.print("*"); // 개수만큼 별 출력
				}
			} else {
				System.out.print(i); // 3, 6, 9가 없으면 숫자 그대로 출력
			}
			
			System.out.println(); // 줄바꿈
		}
		
		
	}

}
