package ch05;
//Fig. 5.1: WhileCounter.java
//Repeti��o controlada por contador com a instru��o de repeti��o while.

public class WhileCounter 
{
	public static void main( String args[] ) 
	{      
		int counter = 1; // declara e inicializa a vari�vel de controle

		while (counter <= 10) // condi��o de continua��o do loop
		{
			System.out.printf( "%d  ", counter );
			++counter; // incrementa a vari�vel de controle por 1
		} // fim do while

		System.out.println(); // gera a sa�da de um caractere de nova linha
	} // fim de main
} // fim da classe WhileCounter 


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