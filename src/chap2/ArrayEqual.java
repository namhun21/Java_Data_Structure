package chap2;

import java.util.Scanner;

public class ArrayEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("a의 요솟수 : ");
		num = sc.nextInt();
		int[] arr1 = new int[num];
		for(int i = 0 ; i< num ; i++) {
			System.out.print("x["+i+"]: ");
			arr1[i] = sc.nextInt();
		}
		System.out.print("b의 요솟수 : ");
		num = sc.nextInt();
		int[] arr2 = new int[num];
		for(int i = 0 ; i< num ; i++) {
			System.out.print("x["+i+"]: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println("배열 a와 b는"+(equals(arr1,arr2) ? "같습니다":"같지 않습니다."));
	}
	public static boolean equals(int arr1[],int arr2[]) {
		if(arr1.length != arr2.length)
			return false;
		for(int i = 0 ;i< arr1.length ; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

}
