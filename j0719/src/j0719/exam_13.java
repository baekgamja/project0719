package j0719;

import java.util.Scanner;

public class exam_13 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		
		System.out.println("요금을 입력 하세요: ");
		int sum=s1.nextInt();
		
		for(int i=0; sum<100000;i++) {
	     System.out.println("요금을 입력 하세요: ");
	     int s=s1.nextInt();
	     sum=s+sum;
			
		}
		System.out.println("종수입은"+sum+"이다");

	}

}
