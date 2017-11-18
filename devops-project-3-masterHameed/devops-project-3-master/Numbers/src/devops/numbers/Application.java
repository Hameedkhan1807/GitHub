/**
 * 
 */
package devops.numbers;

import java.util.Scanner;

public class Application {

	
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter between 1 to 99999999 or type 0 to exit: ");
		num = scanner.nextInt();
		while (num!=0){
			if (num>=1 && num<=9999999){
				Convertor convertor = new Convertor();
				System.out.println("Converted String is : " + convertor.convert(num));
			}
		
		else {
			System.out.print("Number out of Range");
		  }
		System.out.print("Enter number between 1 to 99999999 or type 0 to exit: ");
		num = scanner.nextInt();
	}
}
}
