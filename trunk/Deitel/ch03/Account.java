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