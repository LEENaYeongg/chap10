package chap10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		try {
			throw new Exception("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}