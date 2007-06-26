/*
 * Escrva um aplicativo que insere um n�mero consistindo em cinco d�gitos do usu�rio, separe
 * o n�mero em seus d�gitos individuais e imprima os d�gitos separados uns dos outros por
 * tr�s espa�os cada. Por exemplo, se o �su�rio digitar 42339, o programa deve imprimir
 * 4   2   3   3   9
 */

package ch02;

import java.util.Scanner;

public class Exer02_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();

		System.out.print((n/10000)%10+"   ");
		System.out.print((n/1000)%10+"   ");
		System.out.print((n/100)%10+"   ");
		System.out.print((n/10)%10+"   ");
		System.out.print(n%10+"   ");
	}
}
