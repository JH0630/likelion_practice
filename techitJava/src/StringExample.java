public class StringExample {

    public static void main(String[] args) {
        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

//        String str = "안녕하세요!";
//        String str_2 = new String("안녕하세요!");
//        String str_3 = "안녕하세요!";
//
//        if(str == str_2) {
//            System.out.println("str == str_2");
//        }
//
//        if(str == str_3) {
//            System.out.println("str == str_3");
//        }
//
//        if (str.equals(str_2)){ // equls는 메모리 주소를 생각하지 않고 값만 생각하기 때문에 true 반환
//            System.out.println("str.equals(str_2)");
//        }
//
//        if (str.equals(str_3)){
//            System.out.println("str.equals(str_3)");
//        }


//        // 문자열 병합
//        // 1. '+' 연산자
//        String str_4 = "hello,";
//        String str_5 = "World!";
//
//        System.out.println(str_4+" "+str_5);
//
//
//        // 2. StringBuilder
//        StringBuilder strBdr_1 = new StringBuilder("Hello,");
//
//        strBdr_1.append(" ");
//        strBdr_1.append("World!");
//
//        String str_new = strBdr_1.toString();
//
//        System.out.println(str_new);

//        // 문자열 슬라이스
//
//        String str_6 = "이름: 김자바";
////        System.out.println(str_6.indexOf("이"));
////        System.out.println(str_6.indexOf("름"));
//        String str_name = str_6.substring(4,7);
//        System.out.println(str_name);

        // 문자열 대소문자 변환

//        String str_7 = "abc";
//        String str_8 = "ABC";
//
//        str_7 = str_7.toUpperCase();
//        str_8 = str_8.toLowerCase();
//
//        System.out.println(str_7);
//        System.out.println(str_8);
//
//        if(str_7.equals(str_8)) {
//            System.out.println(str_7.equals(str_8));
//        }
//
//        if(str_7.equalsIgnoreCase(str_8)) {
//            System.out.println(str_7.equals(str_8));
//        }

        // 공백제거

        //1. 양쪽 끝 공백
        String str_9 = "         Hello    ";
        str_9 = str_9.trim();
        System.out.println(str_9);

        //2. 문자열 중간 공백
        String str_10 = "   Hel l o";
        str_10 = str_10.trim();
        str_10 = str_10.replace(" ","");
        System.out.println(str_10);

    }
}
