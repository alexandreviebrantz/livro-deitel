package ch03;
//Fig. 3.13: Account.java
//classe Account com um construtor para
//inicializar a vari�vel de inst�ncia balance.

public class Account
{
	private double balance; // vari�vel de inst�ncia que armazena o saldo

	// construtor
	public Account( double initialBalance )
	{
		// valida que initialBalance � maior que 0,0;
		// se n�o, o saldo � inicializado como o valor padr�o 0.0
		if ( initialBalance > 0.0 ) 
			balance = initialBalance; 
	} // fim do construtor Account

	// credita (adiciona) uma quantia � conta
	public void credit( double amount )
	{      
		balance = balance + amount; // adiciona quantia ao saldo
	} // fim do m�todo credit

	// retorna o saldo da conta
	public double getBalance()
	{
		return balance; // fornece o valor de saldo ao m�todo chamador
	} // fim do m�todo getBalance

} // fim da classe Account


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