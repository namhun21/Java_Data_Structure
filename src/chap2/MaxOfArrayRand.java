package chap2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class MaxOfArrayRand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int num;
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		num = sc.nextInt();
		int[] height = new int[num];
		
		for(int n = 0 ; n< num ; n++) {
			System.out.print("height["+n+"]: ");
			height[n] = 100 + rn.nextInt(90);
			System.out.println(height[n]);
		}
		Arrays.sort(height);
		System.out.println("�ִ��� "+ height[num-1]+"�Դϴ�.");

	}

}
