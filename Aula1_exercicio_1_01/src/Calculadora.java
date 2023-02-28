public class Calculadora implements OperacoesBasicas {
	private float a;
	private float b;
	
	public Calculadora(float a, float b) {
		this.a = a;
		this.b = b;
	}

	public float getOperandoA() {
		return this.a;
	}

	public float getOperandoB() {
		return this.b;
	}
	
	@Override
	public float somar(float a, float b) {
		try {
			return a + b;
		} catch (Exception e) {
			System.out.println("Erro ao somar: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public float subtrair(float a, float b) {
		try {
			return a - b;
		} catch (Exception e) {
			System.out.println("Erro ao subtrair: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public float multiplicar(float a, float b) {
		try {
			return a * b;
		} catch (Exception e) {
			System.out.println("Erro ao multiplicar: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public float dividir(float a, float b) {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println("Erro ao dividir: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public float restoDivisao(float a, float b) {
		try {
			return a % b;
		} catch (Exception e) {
			System.out.println("Erro ao calcular o Resto de Divisão: " + e.getMessage());
			return 0;
		}
	}
}

