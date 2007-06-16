package ch03;
//Fig. 3.14: AccountTest.Java
//Cria e manipula um objeto Account.
import java.util.Scanner;

public class AccountTest
{
	// m�todo principal inicia a execu��o do aplicativo Java
	public static void main( String args[] ) 
	{
		Account account1 = new Account( 50.00 ); // cria o objeto Account
		Account account2 = new Account( -7.53 ); // cria o objeto Account

		// exibe saldo inicial de cada objeto
		System.out.printf( "account1 balance: $%.2f\n", 
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", 
				account2.getBalance() );

		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double depositAmount; // quantia de dep�sito lida a do usu�rio

		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obt�m a entrada do usu�rio
		System.out.printf( "\nadding %.2f to account1 balance\n\n", 
				depositAmount );
		account1.credit( depositAmount ); // adiciona o saldo de account1

		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f\n", 
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", 
				account2.getBalance() );

		System.out.print( "Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // obt�m a entrada do usu�rio
		System.out.printf( "\nadding %.2f to account2 balance\n\n", 
				depositAmount );
		account2.credit( depositAmount ); // adiciona ao saldo de account2

		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f\n", 
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n", 
				account2.getBalance() );
	} // fim de main

} // fim da classe AccountTest


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