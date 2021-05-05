package chap10;

/* 예외 재발생시키기 : 예외가 발생된 메서드에서 예외 처리 후 호출한 메서드에 발생된 예외를 전달할 수 있다.
 * 
 * */
public class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main :"+e.getMessage());
		}
	}

	private static void badmethod() throws Exception {
//		throw new RuntimeException("예외 강제 발생"); //방법1. 예외처리 생략 가능 : RuntimeException
		try {
			throw new Exception("예외 강제 발생"); //방법2. try catch로 묶음. 
		} catch (Exception e) {
			System.out.println("badmethod :"+e.getMessage());
			throw e; //같은 객체의 예외 다시 발생
		}
	}
}
