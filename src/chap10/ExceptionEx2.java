package chap10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println(1);
//		System.out.println(1/0); //ArithmeticException ���
		try {
			System.out.println(2);
			System.out.println(3);
//			System.out.println(3/0); //1256 ���.
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);

	}

}
