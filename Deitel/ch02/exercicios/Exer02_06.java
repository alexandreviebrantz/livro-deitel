package ch02.exercicios;

//Ex. 2.6: Product.java
//Calcula o produto de tr�s inteiros
import java.util.Scanner;

public class Exer02_06 {
	public static void main(String[] args) {
		//cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int x; //Primeiro n�mero inserido pelo usu�rio
		int y; //Segundo n�mero inserido pelo usu�rio
		int z; //Terceiro n�mero inserido pelo usu�rio
		int result; //Produto dos numeros
		
		System.out.println("Enter first integer:"); //Solicita entrada
		x = input.nextInt(); //L� o primeiro inteiro
		
		System.out.println("Enter second integer:"); //Solicita entrada
		y = input.nextInt(); //L� o segundo inteiro
		
		System.out.println("Enter third integer:"); //Solicita entrada
		z = input.nextInt(); //L� o terceiro inteiro
		
		result = x*y*z; //Calcula o produto dos n�meros
		
		System.out.printf("Product is %d\n", result);
	}//Fim do m�todo orincipal
}//Fim da classe product
