package for_;

public class Ex01 {
	public static void main(String[] args) {
		/*  규칙적으로 동작한다면 반복문 고려 */
		// 변수에 1을 저장 후 출력시 1씩 증가 된 값으로 출력되게 만드세
		//10까지. 결과 : 1,2,3,4,5,6,7,8,9,10
		for( int i = 1 ; i <= 10 ; i++  ) 
		{
			//System.out.println( i ); //1, 2
		}
		/*
		int i = 1;
		System.out.println( i );
		i = i + 1;
		System.out.println( i );
		i += 1;
		System.out.println( i );
		i++;
		System.out.println( i );
		i++;
		System.out.println( i );
		i++;
		System.out.println( i );
		i++;
		System.out.println( i );
		i++;
		System.out.println( i );
		i++;
		System.out.println( i );
		*/
		int num = 2; // 0, 1, 2
		//1~10까지의 수 중 짝수 출력
		for(  ; num <= 10  ; num = num + 2 ) 
		{
			System.out.println( num );
		}
		/*
		System.out.println( num );
		num = num + 2;
		System.out.println( num );
		num = num + 2;
		System.out.println( num );
		*/
		
		// 1 ~ 10 까지 수 중 짝, 홀 구분해서 출력
		// 예 ) 1 : 홀, 2 : 짝, 3 : 홀, 4 : 짝 . . .
		for( int i = 1 ; i <= 10 ; i++  ) {
			if( i % 2 == 0 ) {
				System.out.println(i+" : 짝");
			}else {
				System.out.println(i+" : 홀");
			}
		}
		
		/*
		for(int i=2 ; i<=10 ; i+=2) {
			System.out.println("짝 : "+i);
		}
		for(int i=1 ; i<=10 ; i+=2) {
			System.out.println("홀 : "+i);
		}
		*/
		
		int sum = 0;
		int n = 1;
		for( n = 1 ; n <= 10 ; n++  ) {
			//n++;
			sum = sum + n ;
			System.out.println( "n : "+n);
			System.out.println( "sum : "+sum );
		}
		/*
		sum = sum + n ;
		System.out.println( sum );
		
		n++;
		sum = sum + n ;
		System.out.println( sum );
		
		n++;
		sum = sum + n ;
		System.out.println( sum );
		*/
		
		// 1 ~ 10까지의 합중 짝, 홀 수의 합을 구해서 출력
		// 결과 : 짝합 : 30, 홀합 : 25
		
		int evenSum = 0 , oddSum = 0;
		for(int i=1 ; i <= 10 ; i++) {
			if( i % 2 == 0) {
				//System.out.println("짝 : "+i);
				evenSum = evenSum + i;
			}else {
				//System.out.println("홀 : "+i);
				oddSum += i;
			}
		}
		System.out.println("짝 합 : "+evenSum);
		System.out.println("홀 합 : "+oddSum);
	}
}










