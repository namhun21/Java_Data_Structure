package chap1;
import java.util.*;
//for�� �̿��� ����
public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		num = sc.nextInt();
		
		for(int i = 1; i<num+1;i++) {
			sum += i;
		}
		System.out.println("1���� "+num+"������ ����"+ sum+"�Դϴ�.");
	}

}
