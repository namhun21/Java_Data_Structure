package chap1;
import java.util.*;
public class TriangleLB { //���� �Ʒ��� �����ﰢ��
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		triangleLB(num);
		System.out.println();
		triangleLU(num);
		System.out.println();
		triangleRU(num);
		System.out.println();
		triangleRB(num);
		System.out.println();
	}
	public static void triangleLB(int num) { //���ʾƷ��� ������ �ﰢ��
		for(int i = 1; i<=num ; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int num) { //�������� ������ �ﰢ��
		for(int i = 1; i<=num ; i++) {
			for(int j = num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int num) { //������ ���� ������ �ﰢ��
		for(int i = 1; i<=num ; i++) {
			for(int j = 1; j<=num; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void triangleRB(int num) { //������ ���� ������ �ﰢ��
		for(int i = num; i>0 ; i--) {
			for(int j = 1; j<=num; j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
