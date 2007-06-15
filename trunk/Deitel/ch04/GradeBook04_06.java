package ch04;

//Fig. 4.6: GradeBook.java
//Classe GradeBook que resolve o problema da m�dia da classe utilizando
//repeti��o controlada por contador.
import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook04_06 
{
private String courseName; // nome do curso que essa GradeBook representa

// construtor inicializa courseName
public GradeBook04_06( String name )
{
   courseName = name; // inicializa courseName
} // fim do construtor

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

// determina a m�dia da classe com base em 10 notas inseridas pelo usu�rio
public void determineClassAverage()
{
   // cria Scanner para obter entrada a partir da janela de comando
   Scanner input = new Scanner( System.in );

   int total; // soma das notas inseridas pelo usu�rio
   int gradeCounter; // n�mero da nota a ser inserida a seguir
   int grade; // valor da nota inserida pelo usu�rio
   int average; // m�dia das notas

   // fase de inicializa��o
   total = 0; // inicializa o total
   gradeCounter = 1; // inicializa o contador de loops

   // fase de processamento
   while ( gradeCounter <= 10 ) // faz o loop 10 vezes
   {
      System.out.print( "Enter grade: " ); // prompt
      grade = input.nextInt(); // insere a pr�xima nota
      total = total + grade; // adiciona grade a total
      gradeCounter = gradeCounter + 1; // incrementa o contador por 1
   } // fim do while

   // fase de t�rmino
   average = total / 10; // divis�o de inteiros produz um resultado inteiro

   // exibe o total e a m�dia das notas
   System.out.printf( "\nTotal of all 10 grades is %d\n", total );
   System.out.printf( "Class average is %d\n", average );
} // fim do m�todo determineClassAverage

} // fim da classe GradeBook