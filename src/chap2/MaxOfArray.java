package chap2;

import java.util.*;
public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		num = sc.nextInt();
		int[] height = new int[num];
		for(int n = 0 ; n< num ; n++) {
			System.out.print("height["+n+"]: ");
			height[n] = sc.nextInt();
		}
		Arrays.sort(height);
		System.out.println("�ִ��� "+ height[num-1]+"�Դϴ�.");
	}

}
