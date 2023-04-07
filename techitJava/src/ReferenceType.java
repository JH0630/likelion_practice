public class ReferenceType {
    public static void main(String[] args) {
        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        String a = new String("Hello!");
        System.out.println(a);
        // new 방식으로 선언할 경우 아예 새로운 메모리 주소 할당

        String b = "Hello!";
        String c = "Hello!";
        // 리터럴 방식으로 변수를 선언 할 경우 기존 메모리에 같은 값이 있는지
        // 확인 후에 있다면 같은 메모리 값 사용
        if (c == b) {
            System.out.println("a==b");
        }
    }
}
