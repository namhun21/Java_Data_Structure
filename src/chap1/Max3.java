package chap1;
import java.util.Scanner;
public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		for(int i = 0; i<3;i++) {
			System.out.print(i+"�� ��: ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max = arr[0];
		if(max< arr[1])
			max = arr[1];
		if(max< arr[2])
			max = arr[2];
		System.out.println("�ִ��� : "+ max + "�Դϴ�.");
	}
	
}
