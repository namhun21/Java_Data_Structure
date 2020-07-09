package chap1;
import java.util.*;

public class Sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		System.out.println(min+"부터 "+max+"까지의 합 : "+ sumof(min,max));
	}
	public static int sumof(int a, int b) {
		
		int sum = 0;
		for(int i = a ; i<=b ; i++)
			sum += i;
		return sum;
	}
}
