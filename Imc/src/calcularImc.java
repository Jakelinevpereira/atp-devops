import java.util.Locale;
import java.util.Scanner;

public class calcularImc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite seu peso: ");
		float peso = sc.nextFloat();
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();
		System.out.println("Digite é sexo: ");
		String sexo = sc.next();
		float imc = peso / (altura * altura);

		System.out.println("IDADE = " + idade + " anos");
		System.out.printf("PESO =  %.2f kg\n", peso);
		System.out.printf("ALTURA =  %.2f cm\n", altura);
		System.out.println("Sexo = " + sexo);
		System.out.println("Seu IMC é = " + peso / (altura * altura));

		if (imc < 18.5) {
			System.out.println("PESO BAIXO !!!");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("PESO NORMAL !!!");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("SOBRE PESO !!!");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("OBESIDADE CLASSE I !!!");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("OBESIDADE CLASSE II !!!");
		} else if (imc >= 40) {
			System.out.println("OBESIDADE CLASSE III !!!");
		}
		sc.close();

	}

}
