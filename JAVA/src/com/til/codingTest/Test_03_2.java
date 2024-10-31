package com.til.codingTest;

class Test03_2 {
    public int test03_2(String s) {

        int answer = 0;  // 분해된 문자열의 개수를 세기 위한 변수
        int i = 0;       // 문자열을 읽어갈 인덱스

        while (i < s.length()) {
            char x = s.charAt(i);  // 첫 번째 글자 x 설정
            int xCount = 0;        // x의 개수를 세기 위한 변수
            int otherCount = 0;    // x가 아닌 다른 글자의 개수를 세기 위한 변수

            // 두 개수가 같아질 때까지 반복
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }

                i++;

                // x와 다른 글자의 개수가 같아지면 분리하고 루프를 빠져나옴
                if (xCount == otherCount) {
                    answer++;
                    break;
                }
            }

            // 남은 문자가 있다면 마지막 부분 문자열로 분리
            if (i == s.length() && xCount != otherCount) {
                answer++;
            }
        }

        return answer;
    }
}
