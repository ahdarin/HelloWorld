package testesSahaja;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for (int i=1; i<= array.length; i++) {
			System.out.print("ke " + i + ":");
			array[i]=input.nextInt();
			
			System.out.println();
		}

	}

}
