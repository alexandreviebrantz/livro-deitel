package ch06;
// Fig. 6.15: MethodOverloadError.java
// M�todos sobrecarregados com assinaturas id�nticas
// resulta em erros de compila��o, mesmo se os tipos de retorno forem diferentes.

public class MethodOverloadError
{
   // declara��o do m�todo square com argumento int
   public int square( int x )
   {
      return x * x;
   }
   
   // segunda declara��o do m�todo square com argumento int
   // resulta em erros de compila��o mesmo que os tipos de retorno sejam diferentes
   public double square( int y )                                     
   {                                                                 
      return y * y;                                                  
   }                                                                 
} // fim da classe MethodOverloadError


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
