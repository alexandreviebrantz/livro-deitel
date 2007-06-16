package ch04;
//Fig. 4.16: Increment.java
//operadores de pr�-incremento e de p�s-incremento.

public class Increment 
{
	public static void main( String args[] )
	{
		int c;

		// demonstra o operador de p�s-incremento
		c = 5; // atribui 5 � vari�vel c
		System.out.println( c );   // imprime 5
		System.out.println( c++ ); // imprime 5 ent�o p�s-incremente
		System.out.println( c );   // imprime 6

		System.out.println(); // pula uma linha

		// demonstra o operador de pr�-incremento
		c = 5; // atribui 5 � vari�vel c
		System.out.println( c );   // imprime 5
		System.out.println( ++c ); // pr�-incrementa e ent�o imprime 6
		System.out.println( c );   // imprime 6

	} // fim de main

} // fim da classe Increment


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