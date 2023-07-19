package j0719;

import java.util.Scanner;

public class exam_15 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요");
		int num=s1.nextInt();
		int result;
		
		for(int i=1; i<10; i++) {
			result=num*i;
			System.out.printf("%d X %d = %2d\n",num, i, result);
		}

	}

}
