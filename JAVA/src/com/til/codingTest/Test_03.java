package com.til.codingTest;

class Test03 {
    public int test03(String s) {

        // Step 1: 필요한 변수 초기화
        int answer = 0;
        char first = s.charAt(0); // 첫 번째 글자를 기준으로 설정
        int firstCount = 0;
        int strCount = 0;

        // Step 2: 문자열 탐색 및 분할
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 기준 문자와 같은지 확인
            if (current == first) {
                firstCount++;
            } else {
                strCount++;
            }

            // Step 3: 분할 조건 체크
            if (firstCount == strCount) {
                answer++; // 분할 카운트 증가
                // 다음 분할을 위한 초기화
                if (i + 1 < s.length()) {
                    first = s.charAt(i + 1); // 새로운 분할 기준
                }
                firstCount = 0;
                strCount = 0;
            }
        }

        // Step 4: 반복이 종료된 후 분할이 남아 있으면 카운트 증가
        if (firstCount != 0 || strCount != 0) {
            answer++;
        }

        return answer;
    }
}
