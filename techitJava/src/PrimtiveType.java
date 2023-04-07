public class PrimtiveType {

    public static void main(String[] args) {
        // 정수형
        // 1. byte(1 byte = 8 bits) 1111 1000 => 2^8 => (-128~127)
        // 2. short(2 bytes) => -2^15 ~ 2^15 => (-32,768 ~ 32,767)
        // 3. int(4 bytes) => 2^31
        // 4. long(8 bytes) => 2^63

        // 실수형
        // 1. double(8 bytes) - 15자리
        // 2. float(4 bytes) - 7자리

        double a = 1.23;
        float b = 3.25f; //숫자 끝에 f를 명시해줘야 함

//        System.out.println(b);

        //문자형
        //char(2 bytes)
        char char_1 = 'a';
        char char_2 = 97;
        char char_3 = 0x61;

//        System.out.println(char_1);
//        System.out.println(char_2);
        //char형에 숫자를 할당했기에 아스키코드에 의거하여 문자 a 출력
//        System.out.println(char_3);
        //char형에 유니코드를 넣었기에 문자 a 출력

        // 논리형
        // boolean(1 byte)

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100<0);
//        boolean bool_4 = 1; 자바에선 bool에 1 입력 불가

//        System.out.println(bool_1);
//        System.out.println(bool_2);
//        System.out.println(bool_3);


    }
}
