package simeon;

import java.util.Scanner;

public class Zad1Test {
	public static void main(String[] args) {
		zad1<String> stack1 = new zad1<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("String " + (i + 1) +": ");
			stack1.push(sc.nextLine());
		}
		sc.close();
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}
	}
	
}
