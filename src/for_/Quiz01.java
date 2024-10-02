package for_;

public class Quiz01 {
	public static void main(String[] args){
		//1번
		for(int i=1;i<5;i++)
			System.out.println(i+".hello");
		//2번
		int sum=0;
		for(int i=0;i<=100;i++){
			sum+=i;
			if(sum == 528)
				System.out.println("sum : "+sum+"\n"+"i : "+i);
		}
		//3번
		for(int i=1;i<=25;i++) {
			System.out.print(i+"\t");
			if(i%5==0) System.out.println();
		}
	}

}
