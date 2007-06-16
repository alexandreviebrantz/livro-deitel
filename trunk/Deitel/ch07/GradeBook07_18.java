package ch07;
// Fig. 7.18: GradeBook.java
// Livro de nota utilizando um array bidimensional para armazenar notas. 

public class GradeBook07_18
{
   private String courseName; // nome de curso que este livro de nota representa
   private int grades[][]; // array bidimensional de notas de aluno
   
   // construtor de dois argumentos inicializa courseName e array de notas
   public GradeBook07_18( String name, int gradesArray[][])
   {
      courseName = name; // inicializa courseName
      grades = gradesArray; // n�veis de armazenamento
   } // fim do construtor GradeBook de dois argumentos

   // m�todo para configurar o nome do curso
   public void setCourseName( String name )
   {
      courseName = name; // armazena o nome do curso
   } // fim do m�todo setCourseName

   // m�todo para recuperar o nome do curso
   public String getCourseName()
   {
      return courseName;
   } // fim do m�todo getCourseName

   // exibe uma mensagem de boas-vindas para o usu�rio GradeBook
   public void displayMessage()
   {
      // getCourseName obt�m o nome do curso
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // fim do m�todo displayMessage

   // realiza v�rias opera��es nos dados
   public void processGrades()
   {
      // gera sa�da de array de notas
      outputGrades();

      // chama m�todos getMinimum e getMaximum
      System.out.printf( "\n%s %d\n%s %d\n\n", 
         "Lowest grade in the grade book is", getMinimum(), 
         "Highest grade in the grade book is", getMaximum() );

      // gera a sa�da de gr�fico de distribui��o de notas de todas as notas em todos os testes
      outputBarChart();
   } // fim do m�todo processGrades

   // localiza nota m�nima
   public int getMinimum()
   { 
      // assume que o primeiro elemento de array de notas � o menor
      int lowGrade = grades[ 0 ][ 0 ];                           
                                                                 
      // faz um loop pelas linhas do array de notas
      for ( int studentGrades[] : grades )                       
      {                                                          
         // faz um loop pelas colunas da linha atual
         for ( int grade : studentGrades )                       
         {                                                       
            // se a nota for menor que lowGrade, atribui a nota a lowGrade
            if ( grade < lowGrade )                              
               lowGrade = grade;                                 
         } // fim do for interno 
      } // fim do for externo 

      return lowGrade; // retorna nota mais baixa
   } // fim do m�todo getMinimum

   // localiza nota m�xima
   public int getMaximum()
   { 
      // assume que o primeiro elemento de array de notas � o maior
      int highGrade = grades[ 0 ][ 0 ];

      // faz um loop pelas linhas do array de notas
      for ( int studentGrades[] : grades ) 
      {
         // faz um loop pelas colunas da linha atual
         for ( int grade : studentGrades ) 
         {
            // se a nota for maior que highGrade, atribui essa nota a highGrade
            if ( grade > highGrade )
               highGrade = grade;
         } // fim do for interno 
      } // fim do for externo 

      return highGrade; // retorna nota mais alta
   } // fim do m�todo getMaximum

   // determina a m�dia do conjunto de particular de notas
   public double getAverage( int setOfGrades[] )          
   {                                                      
      int total = 0; // inicializa o total
                                                          
      // soma notas de um aluno
      for ( int grade : setOfGrades )                     
         total += grade;                                  
                                                          
      // retorna m�dia de notas
      return (double) total / setOfGrades.length;         
   } // fim do m�todo getAverage

   // gera a sa�da do gr�fico de barras para exibir distribui��o total de notas
   public void outputBarChart()
   {
      System.out.println( "Overall grade distribution:" );

      // armazena freq��ncia de notas em cada intervalo de 10 notas
      int frequency[] = new int[ 11 ];
      
      // para cada nota em GradeBook, incrementa a freq��ncia apropriada
      for ( int studentGrades[] : grades )                               
      {                                                                  
         for ( int grade : studentGrades )                               
            ++frequency[ grade / 10 ];                                   
      } // fim do for externo 

      // para cada freq��ncia de nota, imprime barra no gr�fico
      for ( int count = 0; count < frequency.length; count++ )
      {
         // gera sa�da do r�tulo de barra ( "00-09: ", ..., "90-99: ", "100: " )
         if ( count == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               count * 10, count * 10 + 9  ); 
         
         // imprime a barra de asteriscos
         for ( int stars = 0; stars < frequency[ count ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // inicia uma nova linha de sa�da
      } // fim do for externo 
   } // fim do m�todo outputBarChart

   // gera a sa�da do conte�do do array de notas
   public void outputGrades()
   {
      System.out.println( "The grades are:\n" );
      System.out.print( "            " ); // alinha t�tulos de coluna

      // cria um t�tulo de coluna para cada um dos testes
      for ( int test = 0; test < grades[ 0 ].length; test++ ) 
         System.out.printf( "Test %d  ", test + 1 );

      System.out.println( "Average" ); // t�tulo da coluna de m�dia do aluno

      // cria linhas/colunas de texto que representam notas de array
      for ( int student = 0; student < grades.length; student++ ) 
      {
         System.out.printf( "Student %2d", student + 1 );

         for ( int test : grades[ student ] ) // gera sa�da de notas do aluno
            System.out.printf( "%8d", test );                           

         // chama m�todo getAverage para calcular a m�dia do aluno;
         // passa linha de notas como o argumento para getAverage
         double average = getAverage( grades[ student ] );
         System.out.printf( "%9.2f\n", average );
      } // fim do for externo 
   } // fim do m�todo outputGrades
} // fim da classe GradeBook


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