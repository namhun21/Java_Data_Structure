package chap1;
import java.util.*;
//���콺�� �� n*(n+1)/2
public class Gsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n : ");
		int num = sc.nextInt();
		int sum = num*(num+1)/2;
		System.out.println("1���� "+num+"������ �� = "+sum);
	}

}
