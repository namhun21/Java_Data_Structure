package chap1;
import java.util.*;
public class PrintTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �ﰢ��: ");
		int num = sc.nextInt();
		for(int i = 1; i<=num ; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
