package ch04;

//Fig. 4.9: GradeBook.java
//Classe GradeBook que resolve o programa da m�dia da classe utilizando
//repeti��o controlado por sentinela.
import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook04_09
{
private String courseName; // nome do curso que essa GradeBook representa

// construtor inicializa courseName
public GradeBook04_09( String name )
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

// determina a m�dia de um n�mero arbitr�rio de notas
public void determineClassAverage()
{
   // cria Scanner para obter entrada a partir da janela de comando
   Scanner input = new Scanner( System.in );

   int total; // soma das notas
   int gradeCounter; // n�mero de notas inseridas
   int grade; // valor da nota
   double average; // n�mero com ponto de fra��o decimal para a m�dia

   // fase de inicializa��o
   total = 0; // inicializa o total
   gradeCounter = 0; // inicializa o contador de loops
   
   // fase de processamento
   // solicita entrada e l� a nota do usu�rio
   System.out.print( "Enter grade or -1 to quit: " );
   grade = input.nextInt();                          

   // faz um loop at� ler o valor de sentinela inserido pelo usu�rio
   while ( grade != -1 ) 
   {
      total = total + grade; // adiciona grade a total
      gradeCounter = gradeCounter + 1; // incrementa counter

      // solicita entrada e l� a pr�xima nota fornecida pelo usu�rio
      System.out.print( "Enter grade or -1 to quit: " );
      grade = input.nextInt();                          
   } // fim do while

   // fase de t�rmino
   // se usu�rio inseriu pelo menos uma nota...
   if ( gradeCounter != 0 ) 
   {
      // calcula a m�dia de todas as notas inseridas
      average = (double) total / gradeCounter;  

      // exibe o total e a m�dia (com dois d�gitos de precis�o)
      System.out.printf( "\nTotal of the %d grades entered is %d\n", 
         gradeCounter, total );
      System.out.printf( "Class average is %.2f\n", average ); 
   } // fim do if
   else // nenhuma nota foi inserida, assim gera a sa�da da mensagem apropriada
      System.out.println( "No grades were entered" ); 
} // fim do m�todo determineClassAverage

} // fim da classe GradeBook