package chap1;
import java.util.*;
//반복문 while 이용
public class SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int index = 1;
		int sum = 0;
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		n = sc.nextInt();
		while(index <=5) {
			sum += index++;
		}
		System.out.println(index);
		System.out.println("1부터 "+n+"까지의 합은 "+ sum+"입니다.");
	}

}
