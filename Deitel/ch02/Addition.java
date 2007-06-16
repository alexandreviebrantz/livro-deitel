package ch02;
//Fig. 2.7: Addition.java
//Programa de adi��o que exibe a soma de dois n�meros.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition 
{
	// m�todo principal inicia a execu��o do aplicativo Java
	public static void main( String args[] )
	{
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );            

		int number1; // primeiro n�mero a somar
		int number2; // segundo n�mero a adicionar
		int sum; // soma de number1 e number2

		System.out.print( "Enter first integer: " ); // prompt
		number1 = input.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio

		System.out.print( "Enter second integer: " ); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio

		sum = number1 + number2; // soma os n�meros

		System.out.printf( "Sum is %d\n", sum ); // exibe a soma

	} // fim do m�todo principal

} // fim da classe Addition


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