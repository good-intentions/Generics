package simeon;

import java.util.Scanner;

public class Zad2Test {
	
		int a= 5;
		static int b = 6;
		public static void main(String[] args) {
			b = 7;
		
			GenericStack<String> stack1 = new GenericStack<>();
			Scanner sc = new Scanner(System.in);
			
			
			for(int i = 0; i < 5; i++) {
				System.out.println("String " + (i + 1) +": ");
				stack1.push(sc.nextLine());
			}
			sc.close();
			
			
			while (!stack1.isEmpty())                 
				System.out.println(stack1.pop());
			}
	}
		
