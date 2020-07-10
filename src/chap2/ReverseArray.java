package chap2;

import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("요솟수 : ");
		num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0 ; i< num ; i++) {
			System.out.print("x["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		swap(arr, num);
		System.out.println("요소를 역순으로 정렬");
		for(int i = 0 ; i< num ; i++) {
			System.out.println("x["+i+"]: "+arr[i]);
			
		}
	}
	public static void swap(int[] arr,int num) {
		for(int i = 0; i< num/2 ; i++) {
			int tmp = arr[i];
			arr[i] = arr[num- i -1];
			arr[num- i -1] = tmp;
		}
	}
}
