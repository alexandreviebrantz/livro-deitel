package ch05;
//Fig. 5.10: GradeBookTest.Java
//Cria o objeto GradeBook, insere notas e exibe relat�rio de notas.

public class GradeBookTest
{
	public static void main( String args[] )
	{
		// cria o objeto myGradeBookda classe GradeBook e
		// passa o nome de cursor para o construtor
		GradeBook myGradeBook = new GradeBook( 
		"CS101 Introduction to Java Programming" );

		myGradeBook.displayMessage(); // exibe a mensagem welcome
		myGradeBook.inputGrades(); // l� as notas fornecidas pelo usu�rio
		myGradeBook.displayGradeReport(); // exibe relat�rio baseado em notas
	} // fim de main
} // fim da classe GradeBookTest


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