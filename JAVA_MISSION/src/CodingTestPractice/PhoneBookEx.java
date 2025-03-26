package CodingTestPractice;

/**
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *   - 구조대 : 119
 *   - 박준영 : 97 674 223
 *   - 지영석 : 11 9552 4421
 *   전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질때,
 *   어떤 번호가 다른 번호의 접두어인 경우가 있으면 false 를 그렇지 않은면 true를 return 하도록
 *   solution함수를 작성해 주세요.
 */

import java.util.Arrays;

class Person { }


public class PhoneBookEx {
    public static boolean solution(String[] phone_book) {
        // 전화번호부 정렬
        Arrays.sort(phone_book);

        // 각 전화번호가 다음 전화번호의 접두사인지 확인
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//    	Person person = new Person() 
//			String name = "구조대";
//			int num = 119
			
        String[] phoneBook1 = {"119", "97674223", "1195524421"};
        String[] phoneBook2 = {"123", "456", "789"};
        String[] phoneBook3 = {"12", "123", "1235", "567", "88"};

        System.out.println(solution(phoneBook1)); // false
        System.out.println(solution(phoneBook2)); // true
        System.out.println(solution(phoneBook3)); // false
    }
}
