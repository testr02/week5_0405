package test.while1;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반복횟수 입력:");
		int count = s.nextInt();
		int i = 0;
		
		do {
			System.out.println("do ~ while문 실행됨");
			i++;
		}while(i < count);
		
		s.close();
	}
}
