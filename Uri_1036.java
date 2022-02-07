package URI;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1036 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String[] line;
		double x1, x2, a, b, c, delta;

		line = scan.nextLine().split(" ");

		a = Double.parseDouble(line[0]);
		b = Double.parseDouble(line[1]);
		c = Double.parseDouble(line[2]);

		delta = b * b - 4 * a * c;

		if (a == 0 || delta < 0) {
			System.out.printf("Impossivel calcular\n");
			scan.close();
			return;
		}
		
		x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / (2 * a);
		x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / (2 * a);						
		
		System.out.printf("R1 = %.5f\n", x1);
		System.out.printf("R2 = %.5f\n", x2);

		scan.close();
	}
}
