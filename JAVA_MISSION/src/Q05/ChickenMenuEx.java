package Q05;

import java.util.Scanner;

public class ChickenMenuEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menuNo = 0;
		int count = 0;
		String menuName = " ";
		
		// do~while 문 : 무조건 1회 실행 후, 조건을 검색하여 반복하는 문장
		do {
			System.out.println("::::: 메 뉴 판 ::::: ");
			System.out.println("1. 황금올리브 반반한 치킨");
			System.out.println("2. 뿌잉클 치키 ");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.println("메뉴 번호 : ");
			
			// 메뉴번호 입력
			menuNo = sc.nextInt();
			
			if (menuNo >= 1 && menuNo <= 3) {
				switch (menuNo) {
				case 1: menuName = "황금올리브 반반한 치킨"; break;
				case 2: menuName = "뿌잉클 치키"; break;
				case 3: menuName = "처갓집에서 호식이가 만든 치킨"; break;
				}
				count++;
				System.out.println(menuName + "(이/가) 주문되었습니다.");
				
				// 종료 메세지
				}	else if (menuNo == 0) {
					System.out.println("주문이 종료되었습니다.");
				} else {
					System.out.println("(0~3)번 사이의 번호를 입력해주세요.");
				}
				System.out.println();
			
		} while (menuNo != 0);
				// 
		
		System.out.println( "총 " + count + "개의 상품이 주문되었습니다.");
		System.out.println("메뉴판을 종료합니다.");
		
		sc.close();
		
	}
}


//Scanner sc = new Scanner(System.in);
//
//int count = 0; // 주문 개수
//int menuNo = 0; // 선택한 메뉴 번호
//String menuName = " "; // 선택한 메뉴 이름
//	
//// do~while 문
//// : 무조건 1회 실행 후, 조건을 검색하여 반복하는 문장
//
//do {
//	System.out.println("::::: 메뉴판 :::::");
//	System.out.println("1.황금올리브 반반한 치킨");
//	System.out.println("2. 뿌잉클 치킨");
//	System.out.println("3. 처갓집에서 호식이가 만든 치킨");
////	System.out.println("4. 양념반후라이드반 통닭 - 두마리");
////	System.out.println("5. 뼈없는 양념반후라이드반 통닭 - 두마리");
//	System.out.println("0. 종료");
//	System.out.println("메뉴 번호 : ");
//	
//	// 메뉴 번호 입력
//	menuNo = sc.nextInt();
//	
//	// 유효성 검사
//	if ( menuNo >= 1  && menuNo <= 5) {
//		switch (menuNo) {
//		case 1: menuName = "황금올리브 반반한 치킨"; break;
//		case 2: menuName = "뿌잉클 치킨"; break;
//		case 3: menuName = "처갓집에서 호식이가 만든 치킨"; break;
////		case 4: menuName = "양념반후라이드반 통닭"; break;
////		case 5: menuName = "뼈없는 양념반후라이드반 통닭"; break;
//		}
//		count++; // 주문 개수 증가
//		System.out.println(menuName + "(이/가) 주문되었습니다.");
//		
//		// - 종료 메세지
//		} else if (menuNo == 0 )	{
//			System.out.println("주문을 종료합니다.");
//		} else	{
//			// 유효하지 않은 메뉴 번호
//			System.out.println("(0~5) 사이의 번호를 입력해주세요.");
//			
//		}
//		
//		System.out.println(); // 출력 간격 추가
//	
//	} while (menuNo != 0) ; // 0 입력시 반복 종료
//	
//	// 총 주문 개수 출력
//	System.out.println( "총 " + count + "개의 상품이 주문되었습니다.");
//	System.out.println("메뉴판을 종료합니다.");
//
//	sc.close();  // Scanner 닫기