package j0719;

import java.util.Scanner;

public class exam_02 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("주행거리를 입력하세요 : ");
		double m=s1.nextDouble();
		
		System.out.println("사용한 휘발유 양을 입력하세요 : ");
		double l=s1.nextDouble();
		
		double gas=m/l;
		System.out.println("연비 : "+gas);
		
		

	}

}
