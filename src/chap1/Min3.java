package chap1;
import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(min3(a,b,c));
	}
	public static int min3(int a, int b, int c) {
		int min = a;
		if(min> b)
			min = b;
		if(min> c)
			min = c;
		return min;
	}
}
