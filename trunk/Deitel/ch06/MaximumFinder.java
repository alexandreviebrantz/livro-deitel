package ch06;
// Fig. 6.3: MaximumFinder.java
// M�todo maximum declarado pelo programador.
import java.util.Scanner;

public class MaximumFinder 
{
   // obt�m tr�s valores de ponto flutuante e localiza o valor m�ximo
   public void determineMaximum()
   {
      // cria Scanner para entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // obt�m a entrada do usu�rio
      System.out.print( 
         "Enter three floating-point values separated by spaces: " );
      double number1 = input.nextDouble(); // l� o primeiro double
      double number2 = input.nextDouble(); // l� o segundo double
      double number3 = input.nextDouble(); // l� o terceiro double

      // determina o valor m�ximo
      double result = maximum( number1, number2, number3 );

      // exibe o valor m�ximo
      System.out.println("Maximum is: " + result);
   } // fim do m�todo determineMaximum

   // retorna o m�ximo dos seus tr�s par�metros de double
   public double maximum( double x, double y, double z )          
   {                                                              
      double maximumValue = x; // sup�e que x � o maior valor inicial
                                                                  
      // determina se y � maior que maximumValue
      if ( y > maximumValue )                                     
         maximumValue = y;                                        
                                                                  
      // determina se z � maior que maximumValue
      if ( z > maximumValue )                                     
         maximumValue = z;                                        
                                                                  
      return maximumValue;                                        
   } // fim do m�todo maximum                                        
} // fim da classe MaximumFinder


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