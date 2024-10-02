package switch_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 switch 비교 가능
		 - String , int , char
		 */
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		switch( num ) {
			case 1: System.out.println("1 입력"); break;
			case 2: System.out.println("2 입력"); break;
			default: System.out.println("그 외의 값");
		}
		/*
		if(num == 1 ) System.out.println("1");
		else if(num == 2 )System.out.println( 2 );
		else System.out.println("그외의 값");
		*/
		System.out.println("다음 문장들 실행...");
		
		System.out.println("문자열 입력");
		String str = input.next();
		switch( str ) {
			case "a": //System.out.println("a에이 입력");break;
			case "A":System.out.println("A에이 입력");
		}
		
		System.out.println("--- 짝 홀 구분 ---");
		System.out.println("수 입력");
		num = input.nextInt();
		//if num % 2 == 0
		//sysout( k + m + e );
		//sum = k+m+e
		//sysout( sum )
		
		System.out.println( "결과(num%2) : "+num % 2  );
		int result = num % 2 ;
		System.out.println("result : "+result );
		
		switch( result ){ //num % 2 ) {
			case 0 : System.out.println("짝수");break;
			default : System.out.println("홀 수");
		}
	}
}




















