package chap1;
import java.util.Scanner;
public class Max3m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("max3("+a+","+b+","+c+") = "+ max3(a,b,c));
		
	}
	
	public static int max3(int a, int b, int c) {
		int max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		return max;
	}
}
