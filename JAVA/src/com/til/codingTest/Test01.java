package com.til.codingTest;

// 클래스 선언
class Test01 {

    // 문자열에서 'p'와 'y'의 개수를 비교하는 메서드
    boolean test01(String s){

        // 문자열을 소문자로 변환하여 대소문자 구분 없이 처리
        s = s.toLowerCase();

        // 'p'와 'y'의 개수를 셀 변수 초기화
        int pCount = 0;
        int yCount = 0;

        // 문자열의 각 문자를 하나씩 확인하는 반복문
        for (int i = 0; i < s.length(); i++){

            // i번째 문자를 가져와 변수 ch에 저장
            char ch = s.charAt(i);

            // 현재 문자가 'p'라면 pCount를 증가
            if (ch == 'p') {
                pCount++;

            // 현재 문자가 'y'라면 yCount를 증가
            } else if ( ch == 'y') {
                yCount++;
            }
        }

        // 'p'와 'y'의 개수가 같으면 true, 다르면 false 반환
        return pCount == yCount;
    }
}