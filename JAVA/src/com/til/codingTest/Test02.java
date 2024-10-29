package com.til.codingTest;

// 클래스 선언
class Test02 {
    // 문자열 t와 p를 입력받아 t에서 p와 길이가 같은 부분 문자열 중 p보다 작거나 같은 숫자의 개수를 반환하는 메서드
    public int test02(String t, String p) {

        int count = 0; // 조건을 만족하는 부분 문자열의 개수를 세기 위한 변수 초기화
        int pLength = p.length(); // 문자열 p의 길이를 저장
        long pValue = Long.parseLong(p); // 문자열 p를 long 타입의 숫자로 변환하여 저장

        // 문자열 t에서 길이가 p와 같은 모든 부분 문자열을 탐색
        for (int i = 0; i <= t.length() - pLength; i++) {
            // 현재 인덱스부터 p의 길이만큼 부분 문자열 추출
            String subString = t.substring(i, i + pLength);
            // 추출한 부분 문자열을 long 타입의 숫자로 변환
            long subValue = Long.parseLong(subString);

            // 부분 문자열의 숫자 값이 p의 값보다 작거나 같은지 비교
            if (subValue <= pValue) {
                count++; // 조건을 만족하면 카운트 증가
            }
        }

        return count; // 조건을 만족하는 부분 문자열의 총 개수 반환
    }
}
