package chap1;
import java.util.*;
//���� �Ǵ� �� �б�
public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("������ �Է��ϼ���. ");
		num = sc.nextInt();
		if(num> 0) {
			System.out.println("�� ���� ����Դϴ�.");
		}
		else if(num == 0) {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		else {
			System.out.println("�� ���� ���� �Դϴ�.");
		}
	}

}
