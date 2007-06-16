package ch03;
//Fig. 3.10: GradeBook.java
//Classe GradeBook com um construtor para inicializar o nome de um curso.

public class GradeBook03_10
{
	private String courseName; // nome do curso para esse GradeBook

	// construtor inicializa courseName com String fornecido como argumento
	public GradeBook03_10( String name )                                       
	{
		courseName = name; // inicializa courseName
	} // termina construtor

	// m�todo para configurar o nome do curso
	public void setCourseName( String name )
	{
		courseName = name; // armazena o nome do curso
	} // termina o m�todo setCourseName

	// m�todo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	} // termina o m�todo getCourseName

	// exibe uma mensagem de boas-vindas para o usu�rio GradeBook
	public void displayMessage()
	{
		// essa instru��o chama getCourseName para obter o
		// nome do curso que esse GradeBook representa
		System.out.printf( "Welcome to the grade book for\n%s!\n", 
				getCourseName() );
	} // termina o m�todo displayMessage

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