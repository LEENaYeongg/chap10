package test_1006;

//1. OuterŬ������ ���� Ŭ���� Inner1, inner2 �� ������� iv�� �� ���
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
          System.out.println("Inner1�� iv: "+new Outer1().new Inner1().iv);
          System.out.println("Inner2�� iv: "+new Outer1.Inner2().iv);
   }
}

