package chap2;

import java.util.*;
public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		num = sc.nextInt();
		int[] height = new int[num];
		for(int n = 0 ; n< num ; n++) {
			System.out.print("height["+n+"]: ");
			height[n] = sc.nextInt();
		}
		Arrays.sort(height);
		System.out.println("최댓값은 "+ height[num-1]+"입니다.");
	}

}
