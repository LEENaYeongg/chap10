package chap10;

/* finally 구문 : try 블럭과 함께 사용됨.
 * 				무조건 실행되는 블럭.
 * */
public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
		} catch (Exception e) {
			System.out.print(4);
			return; //메서드 종료
		} finally {
			System.out.print(5);
		}
		System.out.print(6);
	}
}
