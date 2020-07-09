package chap1;
import java.util.*;
//조건 판단 및 분기
public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요. ");
		num = sc.nextInt();
		if(num> 0) {
			System.out.println("이 수는 양수입니다.");
		}
		else if(num == 0) {
			System.out.println("이 수는 0입니다.");
		}
		else {
			System.out.println("이 수는 음수 입니다.");
		}
	}

}
