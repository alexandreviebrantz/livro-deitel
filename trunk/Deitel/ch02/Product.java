package ch02;
//Ex. 2.6: Product.Java
//Calcula o produto de tr�s inteiros.

import java.util.Scanner; // programa utiliza Scanner

public class Product 
{
	public static void main( String args[] )
	{
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );

		int x; // primeiro n�mero inserido pelo usu�rio
		int y; // segundo n�mero inserido pelo usu�rio
		int z; // terceiro n�mero inserido pelo usu�rio
		int result; // produto dos n�meros

		System.out.print( "Enter first integer: " ); // solicita entrada
		x = input.nextInt(); // l� o primeiro inteiro

		System.out.print( "Enter second integer: " ); // solicita entrada
		y = input.nextInt(); // l� o segundo inteiro

		System.out.print( "Enter third integer: " ); // solicita entrada
		z = input.nextInt(); // l� o terceiro inteiro

		result = x * y * z; // calcula o produto dos n�meros

		System.out.printf( "Product is %d\n", result );

	} // fim do m�todo principal

} // fim da classe Product


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