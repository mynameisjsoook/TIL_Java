package com.til.codingTest;

class Test04 {


    //영단어를 담는 String 타입의 배열 새성
    //영단어와 배열의 인덱스 값이 동일하다.
    public int test04(String s) {
        String[] array ={"zero","one","two","three","four","five","six","seven","eight","nine"};

        // 반복문을 사용해 배열 안의 모든 영단어를 검사한다
        // 문자열 s에 영단어가 있다면 replace 를 사용해 변환한다.
        for(int i=0; i<array.length; i++) {
            if(s.contains(array[i])) {
                s = s.replace(array[i], Integer.toString(i));
            }
        }

        // 방법2) 각 영단어를 숫자로 치환
//        for (int i = 0; i < array.length; i++) {
//            s = s.replace(array[i], Integer.toString(i));
//        }

        //변환된 문자열을 숫자로 반환 후 answer에 저장
        int answer = Integer.parseInt(s);
        return answer;

    }
}
