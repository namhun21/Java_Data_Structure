package chap1;
import java.util.*;
//가우스의 합 n*(n+1)/2
public class Gsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n : ");
		int num = sc.nextInt();
		int sum = num*(num+1)/2;
		System.out.println("1부터 "+num+"까지의 합 = "+sum);
	}

}
