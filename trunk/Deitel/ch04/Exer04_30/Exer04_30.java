package ch04.Exer04_30;

import java.util.Scanner;

public class Exer04_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer num = 0;
		String s;

		while (num.toString().length() != 5){
			System.out.print("Digite o n�mero: ");
			num = input.nextInt();
			if (num.toString().length() != 5)
				System.out.println("Erro: N�o tem 5 d�gitos.");
		}

		s = num.toString();		
		if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3)))
			System.out.println("Pal�ndromo");
		else System.out.println("N�o � pal�ndromo");
	}
}
