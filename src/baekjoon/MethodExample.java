package baekjoon;

public class MethodExample {

    public static void main(String[] args) {
        /*String a = "hello";
        String b = "niane";

        System.out.println(a + b);*/
        MethodExample methodExample = new MethodExample();  //클래스 생성
        methodExample.StrCombine("hello", "niane");   //메소드 실행(String 타입 2개 넘겨줌)

    }

    public void StrCombine(String a, String b){
        String result = a + b;
        System.out.println(result);
    }
}
