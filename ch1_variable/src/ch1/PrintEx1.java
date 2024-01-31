package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        // 화면 출력
        int var1 = 35, var2 = 25;
        boolean flag = true;
        System.out.println(var1 + ", " + var2 + ", " + flag); // 35, 25, true
        System.out.println("var1 = "+ var1 + ", " +"var2 = " + var2 + ", " +"flag = "+ flag); // var1=35, var2=25, flag=true
        System.out.printf("var1=%d, var2=%d, flag=%b\n", var1, var2, flag);

        //printf 지시자
        // %d : 10진 정수 형태로 출력
        // %b : boolean 형태로 출력
        // %c : char 로 출력
        // %s : 문자열(String) 출력
        // %f : 부동소수점(float, double) 출력
        System.out.printf("var1=%5d, var2=%05d, flag=%b\n", var1, var2, flag); // Hello 가 붙어서 나오기 때문에 다음줄에 Hello가 출력되려면 \n 을 넣어줘야 함
        System.out.println("Hello");

        float f1 = 3.141592f;
        double d1 = 31.41592d;
        System.out.printf("f1=%.5f\n", f1); // 소수점 5자리까지 나오게 해줘
        System.out.printf("d1=%5.3f\n", d1);
    }
    
}
