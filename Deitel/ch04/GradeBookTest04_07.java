package ch04;

//Fig. 4.7: GradeBookTest.Java
//Cria o objeto da classe GradeBook e invoca seu m�todo determineClassAverage

public class GradeBookTest04_07
{
public static void main( String args[] )
{
   // cria o objeto myGradeBookda classe GradeBook e
   // passa o nome de cursor para o construtor
   GradeBook04_06 myGradeBook = new GradeBook04_06( 
      "CS101 Introduction to Java Programming" );

   myGradeBook.displayMessage(); // exibe a mensagem welcome
   myGradeBook.determineClassAverage(); // calcula a m�dia das 10 notas
} // fim de main

} // fim da classe GradeBookTest