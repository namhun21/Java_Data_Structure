package chap1;
import java.util.*;
//�ݺ��� while �̿�
public class SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int index = 1;
		int sum = 0;
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		n = sc.nextInt();
		while(index <=5) {
			sum += index++;
		}
		System.out.println(index);
		System.out.println("1���� "+n+"������ ���� "+ sum+"�Դϴ�.");
	}

}
