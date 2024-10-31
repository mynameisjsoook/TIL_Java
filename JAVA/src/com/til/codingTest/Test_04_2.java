package com.til.codingTest;

import java.util.HashMap;

public class Test_04_2 {
    public int test_04_2 (String s) {
        // 숫자와 영단어 매핑
        HashMap<String, String> numWords = new HashMap<>();
        numWords.put("zero", "0");
        numWords.put("one", "1");
        numWords.put("two", "2");
        numWords.put("three", "3");
        numWords.put("four", "4");
        numWords.put("five", "5");
        numWords.put("six", "6");
        numWords.put("seven", "7");
        numWords.put("eight", "8");
        numWords.put("nine", "9");

        // 영단어를 숫자로 치환
        for (String word : numWords.keySet()) {
            s = s.replace(word, numWords.get(word));
        }

        // 변환된 문자열을 숫자로 반환
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Test_04_2 test = new Test_04_2();
        // main 메서드를 통해 test_04_2 메서드를 호출하고 결과를 출력하면,
        // 코드가 올바르게 작동하는지 쉽게 확인할 수 있음.
        // 이를 통해 디버깅이나 결과 검증을 간단히 수행할 수 있음.

        // 테스트 실행
        System.out.println(test.test_04_2("one4seveneight")); // 출력: 1478
        System.out.println(test.test_04_2("23four5six7"));    // 출력: 234567

        // Test_04_2 test = new Test_04_2();은 Test_04_2 클래스의 인스턴스를 생성해 Test_04_2 메서드를 호출할 준비를 함
        // System.out.println을 사용해 Test_04_2 메서드의 반환값을 출력하여 각 입력에 대한 결과를 확인함

    }
}
