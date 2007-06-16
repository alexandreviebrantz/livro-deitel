package ch05;
//Fig. 5.9: GradeBook.java
//Classe GradeBook utiliza instru��o switch para contar as notas A, B, C, D e F.
import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook 
{
	private String courseName; // nome do curso que essa GradeBook representa
	private int total; // soma das notas
	private int gradeCounter; // n�mero de notas inseridas
	private int aCount; // contagem de notas A
	private int bCount; // contagem de notas B 
	private int cCount; // contagem de notas C
	private int dCount; // contagem de notas D
	private int fCount; // contagem de notas F

	// construtor inicializa courseName;
	// vari�veis de inst�ncia int s�o inicializadas como 0 por padr�o
	public GradeBook( String name )
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

	// insere n�mero arbitr�rio de notas do usu�rio
	public void inputGrades()
	{
		Scanner input = new Scanner( System.in );

		int grade; // nota inserida pelo usu�rio

		System.out.printf( "%s\n%s\n   %s\n   %s\n", 
				"Enter the integer grades in the range 0-100.", 
				"Type the end-of-file indicator to terminate input:", 
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
		"On Windows type <ctrl> z then press Enter" );

		// faz loop at� o usu�rio inserir o indicador de fim do arquivo
		while (input.hasNext()) 
		{
			grade = input.nextInt(); // l� a nota
			total += grade; // adiciona grade a total
			++gradeCounter; // incrementa o n�mero de notas

			// chama m�todo para incrementar o contador adequado
			incrementLetterGradeCounter( grade );
		} // fim do while
	} // fim do m�todo inputGrades

	// adiciona 1 ao contador adequado da nota especificada
	public void incrementLetterGradeCounter( int grade )
	{
		// determina a nota que foi inserida             
		switch ( grade / 10 )                            
		{                                                
			case 9:  // nota estava entre 90              
			case 10: // e 100                           
				++aCount; // incrementa aCount              
				break; // necess�rio para sair de switch         

			case 8: // nota estava entre 80 e 89        
				++bCount; // incrementa bCount
				break; // sai do switch                      

			case 7: // nota estava entre 70 e 79        
				++cCount; // incrementa cCount              
				break; // sai do switch                      

			case 6: // nota estava entre 60 e 69        
				++dCount; // incrementa dCount              
				break; // sai de switch                      

			default: // nota era menor que 60            
				++fCount; // incrementa fCount               
			break; // opcional; sair� de switch de qualquer jeito
		} // fim do switch                                                                    
	} // fim do m�todo incrementLetterGradeCounter

	// exibe um relat�rio baseado nas notas inseridas pelo usu�rio
	public void displayGradeReport()
	{
		System.out.println( "\nGrade Report:" );

		// se usu�rio inseriu pelo menos uma nota...
		if ( gradeCounter != 0 ) 
		{
			// calcula a m�dia de todas as notas inseridas
			double average = (double) total / gradeCounter;  

			// gera a sa�da de resumo de resultados
			System.out.printf( "Total of the %d grades entered is %d\n", 
					gradeCounter, total );
			System.out.printf( "Class average is %.2f\n", average );
			System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
					"Number of students who received each grade:", 
					"A: ", aCount,   // exibe n�mero de notas A
					"B: ", bCount,   // exibe n�mero de notas B
					"C: ", cCount,   // exibe n�mero de notas C
					"D: ", dCount,   // exibe n�mero de notas D
					"F: ", fCount ); // exibe n�mero de notas F
		} // fim do if
		else // nenhuma nota foi inserida, assim gera a sa�da da mensagem apropriada
			System.out.println( "No grades were entered" );
	} // fim do m�todo displayGradeReport
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