package chap1;
import java.util.*;
//for문 이용한 예제
public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		num = sc.nextInt();
		
		for(int i = 1; i<num+1;i++) {
			sum += i;
		}
		System.out.println("1부터 "+num+"까지의 합은"+ sum+"입니다.");
	}

}
