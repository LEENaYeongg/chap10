package chap10;
/*����ó�� : �߻��� ���ܸ� ����ȭ�ϴ� ����
 * try �ҷ� : ���ܰ� �߻��� �� �ִ� ���ɼ��� �ִ� �����
 * catch �� : try ������ ���ܹ߻��� ����Ǵ� ��
 * */

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
			System.out.println(args[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� ���� �Է��ϼ���.");
		}
		System.out.println("���α׷� ����");

	}

}
