package j0719;

import java.util.Scanner;

public class exam_19 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 : ");
		int dan=s1.nextInt();
		int i=1;
		
		do {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			i++;
		}while(i<=10);

	}

}
