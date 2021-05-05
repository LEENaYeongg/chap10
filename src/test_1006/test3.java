package test_1006;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
 * 
1. 1부터 100까지의 숫자가 아닌 경우에는" 1과 100사이의 숫자만 입력하세요"를 출력하고 
2. 숫자 아닌 경우 숫자만 입력하세요를 출력하고 계속 입력을 받는다.
3. 몇번의 입력만에 숫자를 맞추었는지 출력(입력 오류된 입력도 입력 건수에 포함)
 * 
 * */
public class test3 {
	public static void main(String[] args) throws RuntimeException {
		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		while (true) {
			cnt++;
			System.out.println("1부터 100까지의 숫자를 입력하세요");
			try {
				int me = scan.nextInt();
				if (com == me) {
					System.out.println("정답입니다. 입력횟수: "+cnt);
					break;
				}
				if (me<0|| me>100) {
					System.out.println("1~100 사이의 숫자만 입력하세요.");
				}
				else if (com > me) {
					System.out.println("큰수를 입력하세요");
				}
				else if (com < me) {
					System.out.println("작은수를 입력하세요");
				}
			} catch (InputMismatchException e) {
				String str = scan.next(); 
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요");
			} catch (Exception e) { //에러 메시지 표시
				System.out.println(e.getMessage());
			}
		}
		
	}
}