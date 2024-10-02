package switch_;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String home = null, office = null;
		int num;
		while(true) {
			System.out.println("1.집");
			System.out.println("2.회사");
			System.out.println("3.출력");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch( num ) {
			case 1:
				System.out.println("집 주소 입력");
				home = input.next();
				break;
			case 2:
				System.out.println("회사 주소 입력");
				office = input.next();
				break;
			case 3:
				System.out.println( home +", "+office);
				if( home == null ) {
					System.out.println("집 주소 등록 되지 않음!!");
				}else {
					System.out.println("집 주소 : "+home);
				}
				break;
			}
			/*
			if( num == 1 ) {
				System.out.println("집 주소 입력");
				home = input.next();
			}else if(num == 2 ) {
				System.out.println("회사 주소 입력");
				office = input.next();
			}else {
				System.out.println( home +", "+office);
			}
			*/
		}
	}
}





