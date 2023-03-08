import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		Scanner sc2 = new Scanner(System.in);
		
		int y;
		y = sc2.nextInt();
		System.out.println("Voce digitou: " + y);
		
		Scanner sc3 = new Scanner(System.in);
				
		double z;
		z = sc3.nextDouble();
		System.out.println("Voce digitou : " + z);
		
		Scanner sc4 = new Scanner(System.in);
		
		char a;
		a = sc3.next().charAt(0);
		System.out.println("Voce digitou: " + a);
		
		sc.close();
	}

}
