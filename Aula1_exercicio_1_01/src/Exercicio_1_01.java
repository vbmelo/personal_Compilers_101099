import java.io.EOFException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Exercicio_1_01 {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Baiano's calculator!" +
		 "/n Type your operation in the following format: 1 + 1 " +
		 "/n Type a empty line to exit");

		Scanner inputReader = new Scanner(System.in);
		System.out.println("Insert your operation: ");

		try {
			while (true) {
				String input = inputReader.nextLine();
				if (input.isEmpty()) {
					System.out.println("See ya!");
					break;
				}
				String[] inputArray = input.split("\\s+");

				System.out.println("Executing: " + inputArray[0] + " " + inputArray[1] + " " + inputArray[2]);

				String operacao = inputArray[1];
				float a = Float.parseFloat(inputArray[0]);
				float b = Float.parseFloat(inputArray[2]);

				Calculadora calc = new Calculadora(a, b);



				switch (operacao) {
					case "+":
						System.out.println("Results: " + calc.somar(calc.getOperandoA(), calc.getOperandoB()));
						break;
					case "-":
						System.out.println("Results: " + calc.subtrair(calc.getOperandoA(), calc.getOperandoB()));
						break;
					case "*":
						System.out.println("Results: " + calc.multiplicar(calc.getOperandoA(), calc.getOperandoB()));
						break;
					case "/":
						System.out.println("Results: " + calc.dividir(calc.getOperandoA(), calc.getOperandoB()));
						break;
					case "%":
						System.out.println("Results: " + calc.restoDivisao(calc.getOperandoA(), calc.getOperandoB()));
						break;
					default:
						System.out.println("Operação inválida");
						break;
				}

			}
		} catch (Exception e) {
			System.out.println("Erro ao ler entrada: " + e.getMessage());
			System.out.println("See ya!");
		}
	}
}
