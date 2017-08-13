import java.util.Scanner;

	public class Cal_4Main{

	
	public void aa(int a){
	
		
	}
	public static void main(String[] args) {
		
		Cal_4 tt = new Cal_4(); 
		
		tt.first(0);
		System.out.println("초기 값은 0 이에요!\n");
		
		Scanner scan =new Scanner(System.in);
		System.out.println("수를 입력해주세요");
		tt.a = scan.nextInt();
		
		while(true) {
			
			//Scanner scan =new Scanner(System.in);
			System.out.println("연산자를 입력해주세요");
			tt.d = scan.next();
		
  		tt.once();

		}

	}

		}