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