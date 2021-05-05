package test_1006;

//1. Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
class Outer1 {
    class Inner1 {
          int iv = 100;
     }
    static class Inner2 {
          int iv = 200;
     }
}
public class test1 {
   public static void main(String[] args) {
          System.out.println("Inner1의 iv: "+new Outer1().new Inner1().iv);
          System.out.println("Inner2의 iv: "+new Outer1.Inner2().iv);
   }
}

