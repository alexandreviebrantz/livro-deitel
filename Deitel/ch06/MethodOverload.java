package ch06;
// Fig. 6.13: MethodOverload.java
// Declara��es de m�todos sobrecarregados.

public class MethodOverload 
{
   // teste de m�todos square sobrecarregados
   public void testOverloadedMethods()
   {
      System.out.printf( "Square of integer 7 is %d\n", square( 7 ));
      System.out.printf( "Square of double 7.5 is %f\n", square( 7.5 ));
   } // fim do m�todo testOverloadedMethods
   
   // m�todo square com argumento de int
   public int square( int intValue )                               
   {                                                               
      System.out.printf( "\nCalled square with int argument: %d\n",
         intValue );                                               
      return intValue * intValue;                                  
   } // fim do m�todo square com argumento de int
 
   // m�todo square com argumento double
   public double square( double doubleValue )                         
   {                                                                  
      System.out.printf( "\nCalled square with double argument: %f\n",
         doubleValue );                                               
      return doubleValue * doubleValue;                               
   } // fim do m�todo square com argumento double
} // fim da classe MethodOverload


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