package chap2;

import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = {1,2,3,4,5};
		copy(a,b);
		for(int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
	public static void copy(int[] a, int[] b) {
		if(a.length != b.length)
			System.out.println("배열의 길이가 다름");
		else {
			for(int i = 0; i< a.length ; i++)
				a[i] = b[i];
		}
	}
}
