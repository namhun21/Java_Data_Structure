package chap1;

public class SumFor7 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i<=7;i++) {
			if(i<7) 
				System.out.print(i+" + ");
			else
				System.out.print(i + " = ");
			
			sum+=i;
		}
		System.out.println(sum);
	}

}
