package ch02;
//Fig. 2.15: Comparison.java
//Compara inteiros utilizando instru��es if, operadores relacionais
//e operadores de igualdade.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison 
{
	// m�todo principal inicia a execu��o do aplicativo Java
	public static void main( String args[] )
	{
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );

		int number1; // primeiro n�mero a comparar
		int number2; // segundo n�mero a comparar

		System.out.print( "Enter first integer: " ); // prompt
		number1 = input.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio

		System.out.print( "Enter second integer: " ); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio

		if ( number1 == number2 )                              
			System.out.printf( "%d == %d\n", number1, number2 );

		if ( number1 != number2 )                              
			System.out.printf( "%d != %d\n", number1, number2 );

		if ( number1 < number2 )                              
			System.out.printf( "%d < %d\n", number1, number2 );

		if ( number1 > number2 )                              
			System.out.printf( "%d > %d\n", number1, number2 );

		if ( number1 <= number2 )                              
			System.out.printf( "%d <= %d\n", number1, number2 );

		if ( number1 >= number2 )                              
			System.out.printf( "%d >= %d\n", number1, number2 );

	} // fim do m�todo principal

} // fim da classe Comparison


/**************************************************************************
* (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/