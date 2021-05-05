package chap10;
/* UnsupportFunctionException  클래스 구현하기
 * 1. 멤버변수 : private final int ERR_CODE;
 * 2. 멤버메서드 :
 * 		public int getErrCode() : ERR_CODE 값 반환.
 * 	 	public String getMessage() : 오버라이딩 메서드.
 * 			부모클래스의 message 값과 ERR_CODE 값 반환.
 * 3. 예외처리를 안해도 되도록 구현.
 * 4. 생성자는 구동 클래스의 호출에 맞도록 구현.
 * 
 * */

//상수는 생성자에서 한번 초기화 가능. 객체별로 
//RuntimeException 하나만 예외처리 생략 가능.
//예외처리 방법 2가지 throws, try catch
// throw는 예외를 만드는 것.
class UnsupportFunctionException extends RuntimeException {
	private final int ERR_CODE;
	//ERR_CODE 상수인데 가능한 이유?
	//						객체별로 다른 상수값을 갖게 하기 위해서 생성자에서 상수는 한번 초기화 가능.
	UnsupportFunctionException(String msg, int code){
		super(msg); //super : Runtime
		ERR_CODE = code;
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "," + ERR_CODE;
	}
}
public class Exam3 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException //예외 발생
			("지원하지 않는 기능입니다", 200);
			
		}catch (UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}

	}
}
