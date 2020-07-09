package chap1;
import java.util.*;
public class TriangleLB { //왼쪽 아래가 직각삼각형
	
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
	public static void triangleLB(int num) { //왼쪽아래가 직각인 삼각형
		for(int i = 1; i<=num ; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int num) { //왼쪽위가 직각인 삼각형
		for(int i = 1; i<=num ; i++) {
			for(int j = num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int num) { //오른쪽 위가 직각인 삼각형
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
	public static void triangleRB(int num) { //오른쪽 위가 직각인 삼각형
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
