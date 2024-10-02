package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coffee = 0 , money = 0;
		System.out.println("커피 개수 입력");
		coffee = input.nextInt();
		if( coffee  > 10 ) {
			money = 20000 + (coffee - 10) * 1500;
		}else {
			money = coffee * 2000;
		}
		System.out.println(coffee+" : "+money);
		
		System.out.println("--- 3,4 배수 ---");
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		/*
		if(num % 12 == 0 && num != 0){ //( num % 3 == 0 && num % 4 == 0) {
			System.out.println("3,4배수");
		}else if(num % 3 == 0 && num != 0) {
			System.out.println("3배수");
		}
		else if(num % 4 == 0 && num != 0) {
			System.out.println("4배수");
		}else if(num % 3 != 0 || num % 4 != 0) {
			System.out.println("3,4배수 아님");
		}else {
			System.out.println("0 이다");
		}
		*/
		if( num == 0 ) {
			System.out.println("0 이다");
		}else if(num % 12 == 0 ){ //( num % 3 == 0 && num % 4 == 0) {
			System.out.println("3,4배수");
		}else if(num % 3 == 0) {
			System.out.println("3배수");
		}else if(num % 4 == 0 ) {
			System.out.println("4배수");
		}else if(num % 3 != 0 || num % 4 != 0) {
			System.out.println("3,4배수 아님");
		}
	}
}
















