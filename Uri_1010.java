package URI;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.*;

public class Uri_1010 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int[] id = new int[2];
		int[] qt = new int[2];
		double[] valor = new double[2];
		String[] line = new String[2];
		double valorTotal = 0.00;

		for(int i = 0; i < 2; i++) {
			line[i] = scan.nextLine();

			String[] inputArr = line[i].split(" ");

			id[i] = Integer.parseInt(inputArr[0]);
			qt[i] = Integer.parseInt(inputArr[1]);
			valor[i] = Double.parseDouble(inputArr[2]) * qt[i];
		}	

		valorTotal = DoubleStream.of(valor).sum();

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
		
		scan.close();
	}
}
