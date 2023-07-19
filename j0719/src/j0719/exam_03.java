package j0719;

import java.util.Scanner;

public class exam_03 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("원기둥의 밑면의 반지름은? ");
		double r=s1.nextDouble();
		
		System.out.println("원기둥의 높이는? ");
		double h=s1.nextDouble();
		
		final double PI=3.14;
		
		double result=r*r*h*PI;
		System.out.println("원기둥의 부피는 "+result);

	}

}
