import java.util.Scanner;

public class Uri_1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final double PI = 3.14159;
		
		double raio = scan.nextDouble();
		double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f\n", volume);
		scan.close();
	}
}
