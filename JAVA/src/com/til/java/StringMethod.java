package com.til.java;

public class StringMethod {
    public static void main(String[] args) {

        // 문자열 길이 반환
        String text = "카페라떼";
        System.out.println(text.length());

        // 문자열 포함여부 확인
        // 해당 문자열이 매개변수에 전달되는 문자열을 포함하고 있는지 확인
        String text2 = "안녕. 오늘 날씨가 좋아";
        boolean isContains = text2.contains("오늘"); //오늘이 포함 되는지
        System.out.println(isContains);
        //true
        boolean isContains2 = "오늘".contains(text2); //text2 전체 문자열을 포함하고 있는지
        System.out.println(isContains2);
        //false

        // 앞의 문자열 동일 여부 확인
        String text3 = "기도수첩으로 시작하는 하루";
        boolean isCollect = text3.startsWith("기도");
        System.out.println(text3.startsWith("기도"));
        System.out.println(isCollect);

        // 앞뒤 공백 제거
        String text4 = "   오늘은 눈이 오는 날이네요    ";
        String trimedText = text4.trim();
        System.out.println(trimedText);


        //TO DO : 문자열 치환  *원본 훼손 x
        String text5 = "카페라떼,녹차라떼,코드라떼";
        System.out.println(text5.replace("라떼","a4"));

        // 문자열 자르기  *원본 훼손 x
        String text6 = "123456789";
        System.out.println(text6.substring(5));
        System.out.println(text6.substring(9));
        // " "

        // 문자열 자르기 : beginIndex ~ endIndex 전까지 반환
        System.out.println(text6.substring(2,6));


        // 대소문자 변환
        String text8 = "a8sHe";
        System.out.println(text8.toLowerCase());
        System.out.println(text8.toUpperCase());

        String lowerCaseText = text8.toLowerCase();
        System.out.println(lowerCaseText);

        // 특정문자 찾기
        String text9 = "오늘도, 내일도, 모레도";
        System.out.println(text9.indexOf("모레")); // 10
        System.out.println(text9.indexOf("오")); // 0
        System.out.println(text9.indexOf("늘도")); // 1
        System.out.println(text9.indexOf("도")); // 2

        // 특정 index의 문자 반환
        String text10 = "가나다라마바사";
        System.out.println(text10.charAt(4)); // 마
        String text11 = "12345678";
        System.out.println(text11.charAt(4)); // 5

        // 문자열 비교
        //compareTo 메서드의 결과 값은
        //두 문자열에서 첫 번째로 다른 문자의 유니코드 차이를 나타냄
        //j (유니코드 106), a (유니코드 97)
        System.out.println("abc".compareTo("jzis"));
        System.out.println("jzis".compareTo("abc"));
        System.out.println("aa".compareTo("aaa")); // Java에서는 짧은 문자열이 더 앞에 있다고 판단하여 -1을 반환

    }
}