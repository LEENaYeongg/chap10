package test_1006;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1���� 100���� �� ������ ���ڸ� ��ǻ�Ͱ� �����ϰ�, ���� �Է¹޾� ����� ���� ���ߴ� ���α׷��� �ۼ��ϱ�
 * 
1. 1���� 100������ ���ڰ� �ƴ� ��쿡��" 1�� 100������ ���ڸ� �Է��ϼ���"�� ����ϰ� 
2. ���� �ƴ� ��� ���ڸ� �Է��ϼ��並 ����ϰ� ��� �Է��� �޴´�.
3. ����� �Է¸��� ���ڸ� ���߾����� ���(�Է� ������ �Էµ� �Է� �Ǽ��� ����)
 * 
 * */
public class test3 {
	public static void main(String[] args) throws RuntimeException {
		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		while (true) {
			cnt++;
			System.out.println("1���� 100������ ���ڸ� �Է��ϼ���");
			try {
				int me = scan.nextInt();
				if (com == me) {
					System.out.println("�����Դϴ�. �Է�Ƚ��: "+cnt);
					break;
				}
				if (me<0|| me>100) {
					System.out.println("1~100 ������ ���ڸ� �Է��ϼ���.");
				}
				else if (com > me) {
					System.out.println("ū���� �Է��ϼ���");
				}
				else if (com < me) {
					System.out.println("�������� �Է��ϼ���");
				}
			} catch (InputMismatchException e) {
				String str = scan.next(); 
				System.out.println(str + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���");
			} catch (Exception e) { //���� �޽��� ǥ��
				System.out.println(e.getMessage());
			}
		}
		
	}
}