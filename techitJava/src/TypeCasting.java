public class TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // byte < short < int <<< float < double

//        int a = 123;
//        short b = a;
        // 에러 발생

        short x = 10;
        int y = x;
        // short 보다 int가 범위가 더 크기에 자동 형변환이 가능하다.
        System.out.println(x);
        System.out.println(y);

        int a = 128;
        short b = (short) a;
        // 범위가 작은 것으로 형변환을 해줄 땐 명시를 해줘야 함
        System.out.println(a);
        System.out.println(b);

        byte c = (byte) a;
        System.out.println(c);
        // 강제로 형변환을 할 때 오버플로우가 발생되지 않는지 확인해야 함

        int m = 80;
        double n = m;
        System.out.println(m);
        System.out.println(n);

        double f = 12.2;
        float d = (float) c;

        int e = 10;
        short s = 20;

        short g = (short) (e+f);
    }
}
