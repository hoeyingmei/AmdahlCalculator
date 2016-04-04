import java.util.*;
public class AmdahlCalculator {
	public static void main (String[] args) {
		
		int choice=0;
		float speedup = 0f;
		float threads = 0f;
		float serial;
		
		System.out.println("IS303 Calculator. Use at your own risk.");
		while (choice !=3) {
			System.out.println();
			System.out.println("What do you have for me?");
			System.out.println("1) Speedup and n (number of threads)"); 
			System.out.println("2) B (% serial) and n (number of threads)"); 
			System.out.println("3) Leave"); 
			System.out.println();
			System.out.print("Please enter a choice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter the speed up factor:");
					speedup=sc.nextFloat();
					System.out.print("Enter the number of threads:");
					threads=sc.nextFloat();
					serial=((threads/speedup-1)/(threads-1));
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					System.out.println("B is " + serial);
					System.out.println("Serial % is " + serial*100);
					break;
					
				case 2:
					System.out.print("Enter B (from 0 to 1):");
					serial=sc.nextFloat();
					System.out.print("Enter the number of threads:");
					threads=sc.nextFloat();
					speedup=(threads/((serial*threads) + 1-serial ));
					System.out.println("Speed up factor:" + speedup);
					break;
			}
		}
	}
}